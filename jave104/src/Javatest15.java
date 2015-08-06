import java.util.Scanner;
public class Javatest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
	
       char[]a = scn.next().toCharArray();
       if ((a[0]-'a')>0&&( a[0]-'a')<26){
    	   a[a]=char(65+(a[0]-'a'));
       }
       else{
    	   a[a]=char(97+(a[0]-'A'));
       }
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
