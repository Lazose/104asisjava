import java.util.Scanner;
public class Javatest45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ӫ~����");
		int total = scn.nextInt();//�ӼƬ����
		NUM3 cousData[] = new NUM3[total];//��ƪŶ�
		for (int i =0; i< total; i++ ){//�d��
		 System.out.println("�п�J�ӫ~�W�A�ƶq�λ���");
		 cousData[i] = new NUM3(scn.next(),scn.next(),scn.nextInt());
		}
		String str = "y";
		int s , d;
		while (str.equals("y")||str.equals("Y")){//�O�_�ŦX����
		       System.out.println("�\�ඵ��");
		       System.out.println("1-�d�߰ӫ~");
		       System.out.println("2-�C�L�o��");
		       s = scn . nextInt();
		switch(s){       
		case 1 :
			System.out.println("�п�J�d�߽s�X");
			d = scn .nextInt();
			System.out.println("�ӫ~�W:"+cousData[d].getName()+"�ƶq:"+cousData[d].getNumber()+"��");
			break;
		case 2 :	
			System.out.println("�п�J�d�ߥN�X");
			d = scn .nextInt();
			cousData[d].showInfo();//�ܥX
			break;
		default:	
			System.out.println("�L���A��");
		}	
		System.out.println("�O�_�~��   �A �п�JY or N");
		str = scn.next();
	}
	    System.out.println("���ݱz�A�רϥ�");
}
}		
		class NUM3{
		private String cousName,cousNumber;
		private int cousMoney;
		
		public NUM3(String Name,String Number,int Money){
					cousName = Name;
					cousNumber = Number;
					cousMoney = Money;
		}
		public void setName(String str){			
				cousName = str;
		}
		public String getName(){
				return cousName;
		}
		public void setNumber(String str){
		        cousNumber = str;
		}
		public String getNumber(){
		return cousNumber;
		}
		
		public void setMoney(int v2){
				if(v2>0&&v2<999){
		cousMoney = v2;
				}else{
					System.out.println("�榡���~ ");
				}
		}
		public int getMoney(){
		return cousMoney;
		}
		public void showInfo(){
			System.out.println("�~�W"+cousName);
			System.out.println("�ƶq"+cousNumber);
			System.out.println("����"+cousMoney+"\n");
		
		
	}

}
