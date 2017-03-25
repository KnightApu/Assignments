
import java.io.File;


public class masterWriter extends AssistantClass implements Runnable {
	
	
	
	
		
	
	public void run(){
		
		masterWriting();
		
	}
	
	public void masterWriting() {
		
		
		
		masterWriter finalWriter = new masterWriter();
		
		finalWriter.dir = "C:\\Users\\Acer\\Desktop\\result";
		finalWriter.folder = new File(finalWriter.dir);
		finalWriter.listOfFiles = finalWriter.folder.listFiles();
		
		System.out.println(finalWriter.listOfFiles[0]   + " master thread " + finalWriter.listOfFiles[1] + " " + finalWriter.listOfFiles.length);
		
		
		
		
		finalWriter.readerWriter("C:\\Users\\Acer\\Desktop\\I am master.txt",0,finalWriter.listOfFiles.length);
		
		System.out.println(finalWriter.dir);
		
	}

}
