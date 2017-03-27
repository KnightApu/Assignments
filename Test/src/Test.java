import java.util.ArrayList;

public class Test {
	
	static ArrayList<String> stringObject = new ArrayList<String>();
	
	
	

	public static void main(String[] args) {
		
		FileGenerator lotOfFile  = new FileGenerator();
		lotOfFile.generateFiles();
		
		
		
		try {
			
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		ThreadManager threadManager = new ThreadManager();
		threadManager.startThreads();
		

	}

}
