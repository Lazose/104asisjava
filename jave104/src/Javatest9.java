import java.util.Scanner;
public class Javatest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		System.out.println("�п�J����");
		float H = scn.nextFloat();
		System.out.println("�п�J�魫");
		float W = scn.nextFloat();
		
		if (H>165&&W<45){
			System.out.println("���x�l�a");
		}
		else{if(H>165&&W>45){
			System.out.println("�Ӥj���F");
		}
		     else{if(H<165&&W<45){
		    	 System.out.println("ù������?!");
		     }
		     else
		     
		    	 System.out.println("�Ȥ�~�Ȥ�~������");
		     }
		     }
		
		
	}

	}
