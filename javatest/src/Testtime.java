
import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 

public class Testtime extends JFrame { 
private Container container; 
private JTextField jtfTime; 
private Timer tmr; 
private JLabel jlb1 = new JLabel();
private Container cp ;



private void initComponents(){ 
jtfTime.setText("5"); 
tmr.start(); 
if(         ){ 
	
	
	
}else{ 

int t; //�p�G�ƥ�O��timer��X�Ӫ��A�h�N��J����ܪ��ɶ���ƴ�1 
t = Integer.parseInt(jtfTime.getText());
t--; 
jtfTime.setText(""+t); 
if (t<=0) 
{//�p�G��J�ج�Ƥp�󵥩�0�N�L�X�u�ɶ���v�ñNtimer���� 
tmr.stop(); 

} 
} 
} 

//�إߥ���Main���� 
public static void main(String[] args) { 
// TODO �۰ʲ��ͤ�k Stub 
new Testtime(); 
return;
} 

} 






