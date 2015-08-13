import java.util.Scanner;
public class Javatest36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一段英文");
		String str = scn.nextLine();
	    System.out.println("請問是加密(y)或是解密(n)");
		String ans = scn.next();
		char[]data = str.toCharArray();
		int len = str.length();
		char[]data1 = new char[len];
		
		  
		
		
		if( ans =="y"  ){
		System.out.println("請輸入壓縮密碼(1~3)");
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
		  System.out.println("密碼錯誤!!");  
		  
		  }
		  }
		  }	
			
			
			
			
			
	    }else{
		System.out.println("請輸入解壓密碼(1~3)");
		int o = scn.nextInt();
		  if(o == 1){
		  	
		  }else{
		  if(o == 2){
		  		
		  }else{
		  if(o == 3){
		  			
		  }else{
		  System.out.println("密碼錯誤!!");	
		  
		  }
		  }
		  }
		
	    
	    
	    }	    
}	
}
