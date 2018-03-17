
public abstract class Employees {


	private String name;
	public String paytype;
	public int pay;

	public Employees(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}
	public String getPayType() {
		return paytype;}
	
	public  void calcSalary() {}
	
	public abstract String getEmpType();
	
	public void setPay( int pay) {
	
		this.pay=pay;
		
	}
}
