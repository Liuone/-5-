package Frame;
import java.awt.*;
import javax.sound.midi.VoiceStatus;
import javax.swing.*;
import java.awt.event.*;

public class Quit extends JFrame {

		Quit(){
			initGUI();  
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("退课成功"); 
	    JLabel label=new JLabel("退课成功"); 
	    //新建一个JPanel面板panel，上面用来摆东西 
	    JPanel panel=new JPanel(); 
	    //在panel上面摆上label 
	    panel.add(label); 
	    //设置panel的布局为任意null布局，这样下面的setBounds语句才能生效，并且label在这个面板的(125,75)位置，且大小为100x20px 
	    panel.setLayout(null); 
	    label.setBounds(125,75,100,20); 
	    //在frame中添加panel 
	    frame.getContentPane().add(panel); 
	    //设置frame的大小为300x200，且可见默认是不可见的 
	    frame.setSize(300,200); 
	    frame.setVisible(true); 
//		
//     
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
//	public void CourseSelectionFrame() {
//		// TODO Auto-generated method stub
//		Quit frame=new Quit();
//	}
	
}
