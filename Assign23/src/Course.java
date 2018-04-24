
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course( String courseName ) {
		this.courseName = courseName;
	}
	public void addStudent( String student ){
		students[numberOfStudents] = student;
		numberOfStudents ++;
	}
	
	public String[] getStudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent( String student ) {
		int index = findStudent( student );
			if (index >= 0){
				dropStudent( index );
			}
			System.out.println(student + " has been removed form course: " + courseName );
	}
	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
	

	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
}
