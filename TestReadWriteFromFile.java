import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestReadWriteFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for reading data from file use InputStram
		try {
			FileReader fr = new FileReader("MyFile.txt");
			BufferedReader br = new BufferedReader(fr);

			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				//bw.write(str)
			}
			br.close();
			fr.close();

			// write
			FileWriter fw = new FileWriter("MyFile.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is Testing :Write Student data into  File");
			bw.close();
			fw.close();
			
			//read data from source.txt and write into destination.txt
			
			
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
