import java.util.Scanner;
public class Javatest21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身分證字號的英文");
		String str = scn.next();
		char vi = ' ';
        switch(str){
        case "A" :
        System.out.println("台北市10");
        	break;
        case "B":
        	System.out.println("台中市11");	
        	break;
        case "c":
        	System.out.println("基隆市12");
        	break;
        case "D":
        	System.out.println("台南市13");
        	break;
        case "E":
        	System.out.println("高雄市14");
        	break;
        case "F":
        	System.out.println("台北縣15");
        	break;
        case "G":
        	System.out.println("宜蘭縣16");
        	break;
        case"H":
        	System.out.println("桃園縣17");
        	break;
        case"J":
        	System.out.println("新竹縣18");
        	break;
        case"K":
        	System.out.println("苗栗縣19");
        	break;
        case"L":
        	System.out.println("台中縣20");
        	break;
        case"M":
        	System.out.println("南投縣21");
        	break;
        case"N":
        	System.out.println("彰化縣22");
        	break;
        case"P":
        	System.out.println("雲林縣23");
        	break;
        case"Q":
        	System.out.println("嘉義縣24");
        	break;
        case"R":
        	System.out.println("台南縣25");
        	break;
        case"S":
        	System.out.println("高雄縣26");
        	break;
        case"T":
        	System.out.println("屏東縣27");
        	break;
        case"U":
        	System.out.println("花蓮縣28");
        	break;
        case"V":
        	System.out.println("台東縣29");
        	break;
        case"X":
        	System.out.println("澎湖縣30");
        	break;
        case"Y":
        	System.out.println("陽明山31");
        	break;
        case"W":
        	System.out.println("金門32");
        	break;
        case"Z":
        	System.out.println("馬祖33");
        	break;
        case"I":
        	System.out.println("嘉義市34");
        	break;
        case"O":
        	System.out.println("新竹市35");
        	break;
        default:
        	System.out.println("沒有此縣市");
        	break;
        	
        
		
		
		
		
		
        
		
        }
	}
}