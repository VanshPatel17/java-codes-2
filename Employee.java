import java.io.Serializable;

public class Employee  implements Serializable{

	
	private int empid;
	private String name,address;
	public Employee()
	{
		
	}
	public Employee(int empid, String name, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
