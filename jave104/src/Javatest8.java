import java.util.Scanner;
public class Javatest8   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�JA��");
		float A = scn.nextFloat();
		System.out.println("�л��JB��");
		float B = scn.nextFloat();
		System.out.println("�аݱz�n�����B��O+.-.*��/?");
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
	