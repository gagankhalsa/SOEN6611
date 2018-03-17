
public class Administrator extends Employees {

	public Administrator(String name) {
		super(name);
	
	}

	@Override
	public String getEmpType() {
		String Emp="Admininstrator";
		
		return Emp;
	}
	
	public void calcSalary() {
		int Sal= pay*12;
		System.out.println(Sal);
	}

}
