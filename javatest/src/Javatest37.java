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
		System.out.print("�п�J�ǥͦW");
		name [p] = scn . next();
		System.out.println("�п�J�Ӿǥͦ��Z");
		data[p][0]=scn. nextFloat();
		data[p][1]=scn. nextFloat();
		data[p][2]=scn. nextFloat();
		data[p][3]=(data[p][0]+data[p][1]+data[p][2])/3;		
		}
		System.out.println("������Ʀp�U ");
		
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
		System.out.println("�������ή�"+o+"�H");
		System.out.println("�����ή�"+n+"�H");
		
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
		System.out.println("�̰���"+max+"��");
	    System.out.println("�̧C��"+min+"��");
	
	
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
			System.out.println("��"+u+"�W"+data[u][3]+"��");

	
		
	}
}
}