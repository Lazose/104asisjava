import java . util . Scanner;
public class Javatest37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		
		float data[][]= new float[5][5];
		String name[] = new String[5];
		
		
		for(int p= 0 ; p <5 ; p++    ){
		System.out.print("請輸入學生名");
		name [p] = scn . next();
		System.out.println("請輸入該學生成績");
		data[p][0]=scn. nextFloat();
		data[p][1]=scn. nextFloat();
		data[p][2]=scn. nextFloat();
		data[p][3]=(data[p][0]+data[p][1]+data[p][2])/3;		
		}
		System.out.println("全員資料如下 ");
		System.out.println("名字+\\\\t+平均");
		for (int i = 0 ; i<5 ; i++){
		System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
		}
		
		
		
		
		
	}

}
