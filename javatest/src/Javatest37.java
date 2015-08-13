import java . util . Scanner;
public class Javatest37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		float min = 999;
		float max = 0;
		float data[][]= new float[5][5];
		String name[] = new String[5];
		
		int p ;
		for( p= 0 ; p <5 ; p++    ){
		System.out.print("請輸入學生名");
		name [p] = scn . next();
		System.out.println("請輸入該學生成績");
		data[p][0]=scn. nextFloat();
		data[p][1]=scn. nextFloat();
		data[p][2]=scn. nextFloat();
		data[p][3]=(data[p][0]+data[p][1]+data[p][2])/3;		
		}
		System.out.println("全員資料如下 ");
		
		for (int i = 0 ; i<5 ; i++){
		System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
		
		}
	int o=0 ; int n=0 ;int i =0;
		for ( i = 0 ; i<5 ; i++){
	
			if (data[i][3]<60){
		o++;
		
		}else{
		n++;
		
	}
		}
		System.out.println("平均不及格"+o+"人");
		System.out.println("平均及格"+n+"人");
		
	int t ;
	for(t=0;t<5;t++){
	     if(data[t][3]>max){
	    	 max = data[t][3];
	    	 t++;
	     }
		if(data[t][3]<min){
			min = data[t][3];
			t++;
		}
	}
		System.out.println("最高分"+max+"分");
	    System.out.println("最低分"+min+"分");
	
	
	    int j = 0;
		for(int q=0;q<5;q++){
			for(j=q+1;j<5;j++){
				if(data[q][3]>data[j][3]){
					float v1 = data[q][3];
					data[q][3]=data[j][3];
					data[j][3]= v1;
}
}
}
		for(int u = 0; u<5 ; u++){
			System.out.println("第"+u+"名"+data[u][3]+"分");

	
		
	}
}
}