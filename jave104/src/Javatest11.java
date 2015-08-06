import java.util.Scanner;
public class Javatest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System .in);
System.out.println("請輸入傾角");
int A = scn.nextInt();
System.out.println("請輸入軸距");
int L = scn.nextInt();
System.out.println("請輸入輪胎尺寸");
int S = scn.nextInt();

if(A>=43&&L==130&&S==12){
	System.out.println("就是它了");
	}
	else{
	System.out.println("銘謝惠顧");
	}
	}

}
