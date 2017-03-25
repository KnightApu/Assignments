import java.io.File;

public class Threads extends AssistantClass  implements Runnable{
	
	
	
	String dir = "C:\\Users\\Acer\\Desktop\\test";;
	File folder = new File(dir);
	File[] listOfFiles = folder.listFiles();
	
	String path ;
	int firstFileToScan;
	int lastFileToScan;
	
	public Threads(String path, int firstFileToScan , int lastFileToScan) {
		
		this.path = path;
		this.firstFileToScan = firstFileToScan;
		this.lastFileToScan = lastFileToScan;
		
	}
	public void run(){
		
		writingByThreads();
			 
		}
	
	
	
	
	
	
	public void writingByThreads(){
		
		AssistantClass firstWriter = new AssistantClass();
		firstWriter.readerWriter(path, firstFileToScan, lastFileToScan);
				
			

	}
	
	

}
