import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java.util.Scanner;
import java.util.Random;
public class insertpicture {
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
	//---------------------------�ХܹϤ��b�q����m
	ImageIcon image0 = new ImageIcon("file://E:GitHub/pa .jpg");
	ImageIcon image1 = new ImageIcon("file://E:GitHub/se .jpg");
	ImageIcon image2 = new ImageIcon("file://E:Github/st .jpg");
		
	//-------------------------�ХܪŶ�label
	
	JLabel JLb1  = new JLabel();
	JLabel JLb2  = new JLabel();
	JLabel JLb3  = new JLabel();

	
	//--------------------------�[�J�Ϥ�
	JLb1.add(JLb1);
	JLb2.add(JLb2);
	JLb2.add(JLb3);

	//--------------------------�Х�label��m
	
	JLb1.setIcon(image0);
	JLb1.setBounds(0,0,800,600);
	JLb2.setIcon(image1);
	JLb2.setBounds(0,0,800,600);
	JLb3.setIcon(image2);
	JLb3.setBounds(0,0,800,600);
	
	


	
	
	
	
	
	}
	
}
