import java.util.Scanner;
public class Javatest17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		System.out.println("請輸入上學期總學分");
        int A = scn.nextInt();
		System.out.println("請輸入下學期總瘸分");
        int B = scn.nextInt();
		
		if((A+B)>22){
			System.out.println("在學");
			
		}else
			System.out.println("退學");
		
		
		
		
		
		
	}

}
