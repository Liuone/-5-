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
		JFrame frame=new JFrame("�˿γɹ�"); 
	    JLabel label=new JLabel("�˿γɹ�"); 
	    //�½�һ��JPanel���panel�����������ڶ��� 
	    JPanel panel=new JPanel(); 
	    //��panel�������label 
	    panel.add(label); 
	    //����panel�Ĳ���Ϊ����null���֣����������setBounds��������Ч������label���������(125,75)λ�ã��Ҵ�СΪ100x20px 
	    panel.setLayout(null); 
	    label.setBounds(125,75,100,20); 
	    //��frame�����panel 
	    frame.getContentPane().add(panel); 
	    //����frame�Ĵ�СΪ300x200���ҿɼ�Ĭ���ǲ��ɼ��� 
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
