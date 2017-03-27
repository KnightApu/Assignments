import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MergerClass extends Test {
	
	String dir = "C:\\Users\\Acer\\Desktop\\test"; // location
	File folder = new File(dir);
	File[] listOfFiles = folder.listFiles();
	
	
	
	
	public void readerWriter (String path, int j, int k) {
		
		
		
		
		try{	
			
			FileWriter writer = new FileWriter(path); // open the master.txt file
			BufferedWriter bWriter = new BufferedWriter(writer); // link with the FileWriter
			
			for ( int i=j; i<k; i++) {
					
					
					File myFile = new File(listOfFiles[i].getAbsolutePath()); // returns path of file
					FileReader fileReader = new FileReader(myFile);
					BufferedReader reader = new BufferedReader(fileReader);
					String[] line = new String[listOfFiles.length];
					
					while((line[i]=reader.readLine()) !=null){ // this is very crucial part
						
						//System.out.println(line[i]+ "  " + Thread.currentThread().getName());
						 stringObject.add(line[i]);
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
	
	
	
	
	

