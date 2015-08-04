import java.util.Scanner;
public class Javatest8   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A值");
		float A = scn.nextFloat();
		System.out.println("請說入B值");
		float B = scn.nextFloat();
		System.out.println("請問您要做的運算是+.-.*或/?");
		String X = scn.next();
		
		if(X.equals("+")){
			
			System.out.println((A+B));
		}
		else{if(X.equals("-")){
		        
		        System.out.println((A-B));
	    }       
		     else{if(X.equals("*")){
			         
			           System.out.println((A*B));     
		}
		          else		     
					   
					   System.out.println((A/B));
		}
		     }
		}
	}
	