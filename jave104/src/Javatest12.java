import java.util.Scanner;
public class Javatest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入日期");
        int D = scn.nextInt();
        System.out.println("請輸入星期");
        int W = scn.nextInt();
        
		if(D==7||D==17||D==27){
			System.out.println("肉!!");
		}
		else{if(W==2||W==4||W==6){
			 System.out.println("今天要吃菜");
		}
		     else{
		    	 System.out.println("還是吃肉ㄅㄟ");
		     }
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
