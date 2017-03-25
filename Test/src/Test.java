



public class Test {
	
	
	

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
