import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java.util.Scanner;
import java.util.Random;
public class insertpicture {
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
	//---------------------------標示圖片在電腦位置
	ImageIcon image0 = new ImageIcon("file://E:GitHub/pa .jpg");
	ImageIcon image1 = new ImageIcon("file://E:GitHub/se .jpg");
	ImageIcon image2 = new ImageIcon("file://E:Github/st .jpg");
		
	//-------------------------標示空間label
	
	JLabel JLb1  = new JLabel();
	JLabel JLb2  = new JLabel();
	JLabel JLb3  = new JLabel();

	
	//--------------------------加入圖片
	JLb1.add(JLb1);
	JLb2.add(JLb2);
	JLb2.add(JLb3);

	//--------------------------標示label位置
	
	JLb1.setIcon(image0);
	JLb1.setBounds(0,0,800,600);
	JLb2.setIcon(image1);
	JLb2.setBounds(0,0,800,600);
	JLb3.setIcon(image2);
	JLb3.setBounds(0,0,800,600);
	
	


	
	
	
	
	
	}
	
}
