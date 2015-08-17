import java.util.Scanner;
public class Javatest39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in); 
		System.out.println("n");
		int n = scn.nextInt();
		System.out.println(n+"!="+fac(n));
	}
	public static int fac(int v1){	
	if(v1==1){	
		return 1 ;
	}else{
		return v1*fac(v1-1);
	}
	}	
	public static long fun1(int v1){
		long result = 1;
		for (int i = 1 ; i <=v1; i++){
		result*=i;
	}
	return result;
	}

}
