
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MasterWriter extends Test implements Runnable {
	
	public void run(){
		
		masterWriting();
		
	}
	
	public void masterWriting() {		
		
		
		
		FileWriter writer;
		BufferedWriter bWriter;
		
		try {
			
			writer = new FileWriter("C:\\Users\\Acer\\Desktop\\I am master.txt");
		    bWriter = new BufferedWriter(writer);
		    
		    for(int i = 0; i<stringObject.size(); i++) {
		    	
		    	 System.out.println(stringObject.get(i));
		    	 bWriter.append(stringObject.get(i));
				 bWriter.newLine();
		    	
		    }
		    
		    bWriter.close();
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
		
		
	}

}
