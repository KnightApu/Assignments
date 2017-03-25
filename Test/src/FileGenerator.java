import java.io.FileWriter;
import java.io.IOException;
//import java.security.SecureRandom;
import java.util.Random;

public class FileGenerator{

	//private SecureRandom random = new SecureRandom();
	char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	StringBuilder sb = new StringBuilder();
	
	public void generateFiles () {
		
		for (int i = 0; i < 10; i++) {
			
	        try {
	        	
	        	FileGenerator ob = new FileGenerator();
		        FileWriter f = new FileWriter("C:\\Users\\Acer\\Desktop\\test\\"+"textfile"+i+".txt");
		        
		        f.write(ob.randomWrite()+" textfile"+ i);
		        
		        f.close();
		        
		       
		    } catch (IOException e) {
		    	
		        e.printStackTrace();
		        
		    }
		 }
	}
	
	
	public String randomWrite(){
		
		
		//return new BigInteger(130, random).toString(32);
		
		
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		    
		}
		
		String output = sb.toString();
		
		return output;
		
		
	}
	
	
	
	
	
	
	
}
	

	
	


