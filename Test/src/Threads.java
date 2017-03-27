public class Threads extends MergerClass  implements Runnable{
	
	
	
	

	String path ;
	int firstFileToScan;
	int lastFileToScan;
	
	public Threads(String path, int firstFileToScan , int lastFileToScan) {
		
		this.path = path;
		this.firstFileToScan = firstFileToScan;
		this.lastFileToScan = lastFileToScan;
		
		//System.out.println(path + " " + firstFileToScan + " " + lastFileToScan + Thread.currentThread().getName());
		
	}
	public void run(){
		
		writingByThreads();
			 
		}
	
	
	
	
	
	
	public void writingByThreads(){
		
	
		
		readerWriter(path, firstFileToScan, lastFileToScan);
				
			

	}
	
	

}
