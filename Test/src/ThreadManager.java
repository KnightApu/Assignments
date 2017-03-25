import java.util.Scanner;

public class ThreadManager  {
	
	
	
	public void startThreads(){
		
		
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("How many threads: ");
		 
		 int numberOfThreads =  scanner.nextInt();
		 int[] start = new int[numberOfThreads];
		 int[] end = new int[numberOfThreads];
		 
		 for(int i = 0; i<numberOfThreads; i++) {
			 
				System.out.println("Range for thread: " +  (i+1));
				start[i] = scanner.nextInt();
				end[i] = scanner.nextInt();
			 
		 }
		
		
		
		
		 
		 
		 
		
		Thread myThreads[] = new Thread[numberOfThreads];
		
		for (int j = 0; j < numberOfThreads; j++) {
			
			String path = "C:\\Users\\Acer\\Desktop\\result\\master"+j+".txt";
			
		
			
			
		    myThreads[j] = new Thread(new Threads(path, start[j] ,end[j]+1));
		    myThreads[j].setName("Thread no "+j);
		    
	
		    
		    myThreads[j].start();
		}
		
		for (int j = 0; j < 2; j++) {
			
		    try {
		    	
				myThreads[j].join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
		
		
		
		Runnable masterThread = new masterWriter();
		Thread masterWriter = new Thread(masterThread);
		masterWriter.setName("Master Thread ");
		
		masterWriter.start();
		
		
		
	}
	
	

}
