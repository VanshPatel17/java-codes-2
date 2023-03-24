import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestRetriveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// retrive emp created in TestCreateEmployee.java
		//
		// deserialization:retriveg persisted state of an object

		FileInputStream fin;
		try {
			fin = new FileInputStream("EmpData.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Employee obj=(Employee)oin.readObject();
			
			System.out.println(obj);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
