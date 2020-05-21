import java.util.ArrayList;

class MajorSearch implements visitor  {

	String major = "";
	ArrayList<Student> studentsInMajor = new ArrayList<Student>(); // An array of Student IDs with the desired major
	public MajorSearch(String major) {
		this.major = major;
	}
	
	public void visit(Object data) {
		Student visited = (Student) data;
		if (visited.getMajor().equals(major))
			studentsInMajor.add(visited);
		
	}
	
}