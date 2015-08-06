import java.util.Scanner;
public class Javatest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("請輸入飲料店");
       String S = scn.next();
       System.out.println("請輸入欲購買飲料種類");
       String D = scn.next();
       System.out.println("請輸入價格");
       int G = scn.nextInt();
       if (S.equals("五十嵐")){
       System.out.println("....不買了");
       }
       else{if (D!="綠茶類"||D!="咖啡類"){
            System.out.println("....不買了");
       }
           else{if ( G>45 ){
    	   System.out.println(".....太買了");
       }
           else 
        	   System.out.println("就是這一杯");
       
       
       
       
       
       
       
	}

}
       }
	}


