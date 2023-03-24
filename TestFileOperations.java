import java.io.File;
import java.io.IOException;

public class TestFileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("---file IO----");
		File f=new File("MyFile1.txt");
		System.out.println("Path:"+f.isAbsolute());
		System.out.println("isPresent:"+f.exists());
		if(f.exists()==false)
		{
			f.createNewFile();
			System.out.println("File Created");
		}
		
		System.out.println("isPresent:"+f.exists());
	
		System.out.println("Size="+f.length());
		System.out.println("path:"+f.getAbsolutePath());
		System.out.println(f.canRead());
		
		System.out.println(f.delete());
		
		
		
	}

}
