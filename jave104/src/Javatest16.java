import java.util.Scanner;
public class Javatest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入合法三角形之三邊長(請由小排到大)");
        System.out.println("A");
        int A = scn.nextInt();
        System.out.println("B");
        int B = scn.nextInt();
        System.out.println("C");
        int C = scn.nextInt();
        if ((A*A)+(B*B)==(C*C)){
        System.out.println("此為直角三角形");
        }else{if((A*A)+(B*B)>(C*C)){
        	  System.out.println("此為銳角三角形");
        }else
        	System.out.println("此為對角三角形");
        
		
		
		
		
		
	}

}
}
