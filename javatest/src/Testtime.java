
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

int t; //如果事件是用timer丟出來的，則將輸入框顯示的時間秒數減1 
t = Integer.parseInt(jtfTime.getText());
t--; 
jtfTime.setText(""+t); 
if (t<=0) 
{//如果輸入框秒數小於等於0就印出「時間到」並將timer停止 
tmr.stop(); 

} 
} 
} 

//建立本身Main物件 
public static void main(String[] args) { 
// TODO 自動產生方法 Stub 
new Testtime(); 
return;
} 

} 






