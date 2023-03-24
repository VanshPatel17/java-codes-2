import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestCreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp=new Employee(101, "Sonali", "Mumbai");
		System.out.println(emp);
		//
		
		try {
			FileOutputStream fout=new FileOutputStream("EmpData.txt");
			
			//write/persist object in file using serialization
			//serialization:process to persist state of an object
			
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(emp);//emp will persisted in file EmpData.txt
			out.close();
			fout.close();
			
			System.out.println("--persisted----");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
