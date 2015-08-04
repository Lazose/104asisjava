import java.util.Scanner;
public class Javatest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身高");
		float H = scn.nextFloat();
		System.out.println("請輸入體重");
		float W = scn.nextFloat();
		
		if (H>165&&W<45){
			System.out.println("放膽追吧");
		}
		else{if(H>165&&W>45){
			System.out.println("太大隻了");
		}
		     else{if(H<165&&W<45){
		    	 System.out.println("羅莉控嗎?!");
		     }
		     else
		     
		    	 System.out.println("紙片~紙片~飄壓飄");
		     }
		     }
		
		
	}

	}
