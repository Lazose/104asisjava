import java.util.Scanner;
public class Javatest36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�q�^��");
		String str = scn.nextLine();
	    System.out.println("�аݬO�[�K(y)�άO�ѱK(n)");
		String ans = scn.next();
		char[]data = str.toCharArray();
		int len = str.length();
		char[]data1 = new char[len];
		
		  
		
		
		if( ans =="y"  ){
		System.out.println("�п�J���Y�K�X(1~3)");
		int c = scn.nextInt();	int i ;
		  if(c ==1 ){
		  for ( i = 0; i<len ; i++);
		 data1[i]= (char)(data[i]+c);
		 System.out.println(data1[i]);
		  }else{
		  if(c ==2 ){
		  
		  }else{
		  if(c ==3 ){
		  	
          
		  
		  }else{
		  System.out.println("�K�X���~!!");  
		  
		  }
		  }
		  }	
			
			
			
			
			
	    }else{
		System.out.println("�п�J�����K�X(1~3)");
		int o = scn.nextInt();
		  if(o == 1){
		  	
		  }else{
		  if(o == 2){
		  		
		  }else{
		  if(o == 3){
		  			
		  }else{
		  System.out.println("�K�X���~!!");	
		  
		  }
		  }
		  }
		
	    
	    
	    }	    
}	
}
