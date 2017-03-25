import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class AssistantClass {
	
	String dir = "C:\\Users\\Acer\\Desktop\\test";;
	File folder = new File(dir);
	File[] listOfFiles = folder.listFiles();
	
	
	
	

	ArrayList<String> stringObject = new ArrayList<String>();
	
	public void readerWriter (String path, int j, int k) {
		
		
		
		
		
		
		try{	
			
			FileWriter writer = new FileWriter(path); // open the master.txt file
			BufferedWriter bWriter = new BufferedWriter(writer); // link with the FileWriter
			
			for ( int i=j; i<k; i++) {
					
					
					File myFile = new File(listOfFiles[i].getAbsolutePath());  // returns path of file
					
					FileReader fileReader = new FileReader(myFile);
					BufferedReader reader = new BufferedReader(fileReader);
					String[] line = new String[k];
					
					
					while((line[i]=reader.readLine()) !=null){ // this is very crucial part
						
						System.out.println(line[i]+ "  " + Thread.currentThread().getName());
						
						bWriter.append(line[i]);
						bWriter.newLine(); // this is crucial. printing a new line in the notePad.
						
					}
			
			}
			
			bWriter.close();
			writer.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();

	}
	}
		
	}
	
	
	
	
	

