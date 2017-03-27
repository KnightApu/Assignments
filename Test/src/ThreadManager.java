import java.util.Scanner;

public class ThreadManager  {
	
	 int numberOfThreads;
	 int[] startPositionToScan;
	 int[] endPositionToScan;
	 Thread myThreads[]; 
	
	 
	
	
	 
	 
	public void startThreads(){
		
		
		managingThread();
		initializingThread();
		joiningThread();
		creatingMasterThread();
		
		
		}
	
	
	
	
	
	public void managingThread() {
		
		
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("How many threads: ");
		 
		 numberOfThreads =  scanner.nextInt();
		 startPositionToScan = new int[numberOfThreads];
		 endPositionToScan = new int[numberOfThreads];
		
		 
		 for(int indexOfThread = 0; indexOfThread<numberOfThreads; indexOfThread++) {
			 
				System.out.println("Range for thread: " +  (indexOfThread+1));
				
				startPositionToScan[indexOfThread] = scanner.nextInt();
				endPositionToScan[indexOfThread] = scanner.nextInt();
			 
		 }
		
	}
		
		
		public void initializingThread() {
			
			
			 myThreads = new Thread[numberOfThreads];
			 
			 for (int indexOfThread = 0; indexOfThread < numberOfThreads; indexOfThread++) {
				
				String path = "C:\\Users\\Acer\\Desktop\\result\\master-"+indexOfThread+".txt";			
				
			    myThreads[indexOfThread] = new Thread(new Threads(path, startPositionToScan[indexOfThread] ,endPositionToScan[indexOfThread]+1));
			    myThreads[indexOfThread].setName("Thread no "+indexOfThread);
			   // System.out.println(myThreads[indexOfThread].getName() + " " + startPositionToScan[indexOfThread] + " " + endPositionToScan[indexOfThread]);
			    		    
			    
			    
			}
			
			
			
			
		}
		
		
		public void joiningThread() {
			
			for (int indexOfThread = 0; indexOfThread < numberOfThreads; indexOfThread++) {
				
			    try {
			    	myThreads[indexOfThread].start();
					myThreads[indexOfThread].join();
					
				} catch (InterruptedException e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				} 
			}
			
		}
		
		 
		
		
		public void creatingMasterThread() {
			
			Runnable masterThread = new MasterWriter();
			Thread masterWriter = new Thread(masterThread);
			masterWriter.setName("Master Thread ");
			masterWriter.start();
			
			
		}
		
		
		
		
		
	}
	
	
