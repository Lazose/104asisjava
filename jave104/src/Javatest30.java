import java . util.Scanner;
public class Javatest30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入年");
		int y = scn.nextInt();
		while ((y%4!=0)||(y%100==0&&y%400!=0)){
		System.out.println("請輸入年");
		y = scn.nextInt();
		}
		System.out.println("此為閏年");
		
		
		
		
		
		
		
	}

}
