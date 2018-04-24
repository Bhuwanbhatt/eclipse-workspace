
public class Test {

	public static void main(String[] args) {
		
		     Person person = new Person ("Bhuwan","Callahan","9199191408","bhattb1@nku.edu");
		     System.out.println(person.toString());
		
		

			Student student = new Student("freshman", "Jane", "Callahan", "222-2222", "jane@nku.edu");
			System.out.println(student.toString());
			
			// Test case for Employee

			Employee employee = new Employee("GH314", "20000", "2017", "John", "Cincinnati", "333-3333", "john@nku.edu");
			System.out.println(employee.toString());
			
			Faculty faculty = new Faculty("TR2-3", "Professor", "GH510", "100.00", "1/1/2000", "CF", "NKU", "444-4444", "frank@nku.edu");
			System.out.println(faculty.toString());
			
		// Test case for Staff
             
			Staff Staff = new Staff("Parttime-Professor","MWF3-4","GH515","100.00","David","Cincinnati","333-3333","David@nku.edu");
             System.out.println(Staff.toString());
	}
	

}
