import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java.util.Scanner;
import java.util.Random;
public class Work13 extends JFrame{

	private JLabel name = new JLabel();
    private JTextField jlb1 = new JTextField();
    private JButton back = new JButton("返回");
    private JLabel talk = new JLabel();
    private Container cp ;
    private String fin   ;
	//------------------------------------------------
	public  Work13(){
	initComp();
}
	private void initComp(){	
	cp = this . getContentPane();
	this.setBounds(150,100,600,400);	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	cp.setLayout(null);//視窗
	//--------------------------------------
	
	name.setBounds(75,60,250,250);	//設定 標籤-標示輸贏
	name.setText(fin);
	cp.add(name);
	System.out.println(name.getText());
	
	//--------------------------------------
	back.setBounds(50,70,250,30);//push 按鍵-返回
	cp.add(back);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});}
	//--------------------------------------
	//剪刀石頭布 判斷
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	Random rnd = new Random();	
	
	
	

	//-------------------------------------------
	
		int w =0; int l =0;int t =0;//贏或輸或平手
		for( int z = 0 ; z<=2 ; z++){
			int x = 3 ;
			int y =(rnd.nextInt(3)+1) ;
			int vi = 1-y;
    
	switch(vi){
	
    	

	case (1):
	
	z++;l++;
	break;	
	case (2):
		
	z++;w++;
	break;
	case (-1):
	 
	z++;w++;
	break;
	case (-2):	
	
	z++;l++;
	break;	
	
	default :
	
	z++;t++;
	break;
	
	} 
	}
if (w>l){
	System.out.println("");
}else{if(w<l){
	System.out.println("");
}else{
	System.out.println("");
}
}
}

}
