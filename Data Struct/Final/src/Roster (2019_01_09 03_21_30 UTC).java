import java.util.*;

public class Roster {
	


	public static void main(String[] args) {
		BinarySearchTree Students = new BinarySearchTree();
		
		try {

			Student Jim = new Student(1245,"Jim", "RNK");
			Student Pam = new Student(1478, "Pam", "PHN");
			Student Dwight = new Student(8921, "Dwight", "BTS");
			Student Michael = new Student(4578, "Michael", "BSS");
			Student Ryan = new Student(9835, "Ryan", "TMP");
			
			Students.add(Jim);
			Students.add(Pam);
			Students.add(Dwight);
			Students.add(Michael);
			Students.add(Ryan);
		}
		catch (Student.studentIDException exc) {}
		catch (Student.studentMajorException exc) {}
		catch (Student.studentNameException exc) {}
		
		Scanner input = new Scanner(System.in);
		String choice = "";
		boolean wasError = false;
		boolean keepGoing = true;

		while (keepGoing)
		{
			String name;
			String major;
			int ID;
			Student temp;
			
			if (!wasError)
			choice = menu();
			
			switch (choice) {
				case "add":
					try {
						System.out.println("Please enter the ID of the new student: \n");
						ID = input.nextInt();
						input.nextLine();
						
						System.out.println("Please enter the name of the new student: \n");
						name = input.nextLine();
						
						System.out.println("Please enter the major of the new student: \n");
						major = input.nextLine();
	
						Student addition = new Student(ID, name, major);
						
						Students.add(addition);
						Students.print();
					}
					catch (Student.studentIDException exc) {wasError = true;}
					catch (Student.studentMajorException exc) {wasError = true;}
					catch (Student.studentNameException exc) {wasError = true;}
					wasError = false;
					break;
				case "remove":
					try {
						System.out.println("Please enter the ID of the student you would like to remove: \n");
						ID = input.nextInt();
						
						Student toRemove = new Student(ID);
						if (Students.find(toRemove) == false)
							System.out.println("That student is not in the roster.\n");
						else {
							Students.remove(toRemove);
							System.out.println("The student has been removed.\n");
						}
	
						Students.print();
					}
					catch (Student.studentIDException exc) {wasError = true;}
					wasError = false;
					break;
					
				case "display":
					Students.print();
					wasError = false;
					break;
					
				case "ID":
					try {
						System.out.println("Please enter the ID of the student you would like to find: \n");
						ID = input.nextInt();
						Student toFind = new Student(ID);
						if (Students.find(toFind) == false)
							System.out.println("That student is not in the roster.\n");
						else {
							toFind = (Student) Students.search(toFind);
							System.out.println("Here is the information on the student you requested:\n");
							toFind.print();						
						}
					}
					catch (Student.studentIDException exc) {wasError = true;}
					wasError = false;
					break;
					
				case "major":
					String desiredMajor;
					System.out.println("What major would you like to search for? \n");
					desiredMajor = input.nextLine();
					
					ArrayList<Student> studentsInMajor = new ArrayList<Student>(); // An array of Student IDs with the desired major
					
					MajorSearch ms = new MajorSearch(desiredMajor);
					Students.inorder(ms);
					studentsInMajor = ms.studentsInMajor;
					
					System.out.println("Students in major " + desiredMajor + ":\n");
					
					for(Student found : studentsInMajor) {
						System.out.print(found.getName() + "\n");						
					}
					System.out.println("");
					
					wasError = false;
					break;
					
				case "change major":
					try {
						System.out.println("What is the ID of the student whose major you would like to change?\n");
						ID = input.nextInt();
						Student toChange = new Student(ID);
						if (Students.find(toChange) == false) {
							System.out.println("That student is not in the roster.\n");
							break;
						}
						else 
							toChange = (Student) Students.search(toChange);
						
						input.nextLine();
						System.out.println("What is the student's new major?\n");
						major = input.nextLine();
						toChange.setMajor(major);
						System.out.println("Their major has successfully been changed");
					}
					catch (Student.studentIDException exc) {wasError = true;}
					catch (Student.studentMajorException exc) {wasError = true;}
					wasError = false;
					break;
					
					
				case "stop":
					Students.print();
					keepGoing = false;
					wasError = false;
					break;
				
				case "invalid":
					System.out.println("Please enter a valid choice");
					wasError = false;
					break;
				}
		}
	}

			
			
			
		


	private static String menu() {
		Scanner input = new Scanner(System.in);
		String choice;
		
		System.out.println("What would you like to do to the roster? \n"
				+ "Please enter \"add\", \"remove\", \"display\", \"ID\", \"major\", \"change major\", or \"stop\": \n");
		choice = input.nextLine();
		
		if (choice.equals("add"))
			return "add";
		else if (choice.equals("remove"))
			return "remove";
		else if (choice.equals("display"))
			return "display";
		else if (choice.equals("major"))
			return "major";
		else if (choice.equals("ID"))
			return "ID";
		else if (choice.equals("stop"))
			return "stop";
		else if (choice.equals("change major"))
			return "change major";
		else
			return "invalid";
			
		
	}
	

	

	

}
