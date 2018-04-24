
public class Staff extends Employee {
	private String title;
 
	public Staff(String title, String hours,String office, String salary, String name,String address, String phone, String email) {
		super(hours,office,salary,name, address,phone,email);
		this.title= title;
	}
		public String toString(){
			return super.getName() + " in Staff";
	}

}
