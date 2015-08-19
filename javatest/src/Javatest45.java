import java.util.Scanner;
public class Javatest45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入商品種類");
		int total = scn.nextInt();//個數為整數
		NUM3 cousData[] = new NUM3[total];//資料空間
		for (int i =0; i< total; i++ ){//範圍
		 System.out.println("請輸入商品名，數量及價格");
		 cousData[i] = new NUM3(scn.next(),scn.next(),scn.nextInt());
		}
		String str = "y";
		int s , d;
		while (str.equals("y")||str.equals("Y")){//是否符合條件
		       System.out.println("功能項目");
		       System.out.println("1-查詢商品");
		       System.out.println("2-列印發票");
		       s = scn . nextInt();
		switch(s){       
		case 1 :
			System.out.println("請輸入查詢編碼");
			d = scn .nextInt();
			System.out.println("商品名:"+cousData[d].getName()+"數量:"+cousData[d].getNumber()+"個");
			break;
		case 2 :	
			System.out.println("請輸入查詢代碼");
			d = scn .nextInt();
			cousData[d].showInfo();//示出
			break;
		default:	
			System.out.println("無此服務");
		}	
		System.out.println("是否繼續   ， 請輸入Y or N");
		str = scn.next();
	}
	    System.out.println("期待您再度使用");
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
					System.out.println("格式錯誤 ");
				}
		}
		public int getMoney(){
		return cousMoney;
		}
		public void showInfo(){
			System.out.println("品名"+cousName);
			System.out.println("數量"+cousNumber);
			System.out.println("價格"+cousMoney+"\n");
		
		
	}

}
