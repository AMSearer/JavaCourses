import java.io.*;


public class Student implements Comparable<Student>{
	
	private int ID;
	private String name, major;
	
	/**
	 * 	Blank Student constructor.
	 */
	public Student() {
		
		ID = 0;
		name = "";
		major = "";
	}
	
	/**
	 * Regular Student constructor.
	 * 
	 * @param ID_i Student ID number as an integer.
	 * @param name_i Student name as a string.
	 * @param major_i Student major as a capital 3-letter string.
	 */
	public Student(int ID, String name, String major) throws studentIDException, studentMajorException, studentNameException{
		if (this.ID != 0)
			throw new studentIDException("Student ID has already been assigned.");
		else if (ID < 1)
			throw new studentIDException("Student ID must be greater than 1.");
		else
			this.ID = ID;
		
		if (name.equals(""))
			throw new studentNameException("Student name cannot be blank.");
		else
			this.name = name;
		
		if (major.length() != 3)
			throw new studentMajorException("Please enter a valid major.");
		else
			this.major = major.toUpperCase();
	}
	/**
	 * Special Student constructor with only the ID specified.
	 * 
	 * @param ID_i Student ID as an integer.
	 */
	public Student(int ID) throws studentIDException{
		
		if (this.ID != 0)
			throw new studentIDException("Student ID has already been assigned.");
		else if (ID < 1)
			throw new studentIDException("Student ID must be greater than 1.");
		else
			this.ID = ID;
		name = "";
		major = "";
	}
	
	public void setID(int ID) throws studentIDException{
		
		if (this.ID != 0)
			throw new studentIDException("Student ID has already been assigned.");
		else if (ID < 1)
			throw new studentIDException("Student ID must be greater than 1.");
		else
			this.ID = ID;
	}
	
	public int getID() {
		return this.ID;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setMajor(String major) throws studentMajorException {
		if (major.length() != 3)
			throw new studentMajorException("Please enter a valid major.");
		else
			this.major = major.toUpperCase();
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void print() {
		System.out.println("Information for student " + this.getID() + ": ");
		System.out.println("Name: " + this.getName());
		System.out.println("Major: " + this.getMajor() +"\n\n");
	}
	
	public String toString() {
		String toReturn ="";
		toReturn += "\nInformation for student " + this.getID() + ":";
		toReturn += "\nName: " + this.getName();
		toReturn += "\nMajor: " + this.getMajor() +"\n";
		return toReturn;
	}

	public int compareTo(Student other) {
		if (this.getID() == other.getID())
			return 0;
		else if (this.getID() < other.getID())
			return -1;
		else
			return 1;
	}
	


	class studentIDException extends Exception{
		public studentIDException (String message) {
			System.out.println(message);
		}
	}
		
	class studentMajorException extends Exception{
		public studentMajorException (String message) {
			System.out.println(message);
		}
	}
	
	class studentNameException extends Exception{
		public studentNameException (String message) {
			System.out.println(message);
		}
	}
}
