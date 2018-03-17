
public class Technical extends Employees {

	public Technical(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getEmpType() {
		String Emp= "Technical";
		return Emp;
	}
	
	public void calcSalary() {
		int Sal=pay*20;
		System.out.println(Sal);
	}

}
