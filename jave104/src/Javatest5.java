import java.util.Scanner;
public class Javatest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn= new Scanner(System.in); 
        System.out.println("Hello,請問您是?");
        String n =scn.next();
        System.out.println("Hi,"+n+"您好!");
        System.out.println(n+",很高興認識你，請問您是哪一所高中畢業的?");
        String h =scn.next();
        System.out.println(n+",原來你是"+h+"畢業的。");
        System.out.println("你現在讀哪一個系的?");
        String c =scn.next();
        System.out.println("哇~~"+c+"可是熱門科系耶,你實在太厲害了! :)");
        System.out.println("你畢業之後要從事什麼工作?");
        String j =scn.next();
        System.out.println(j+"是個不錯的工作，真是羨慕你!:)");
        
        
	}

}
