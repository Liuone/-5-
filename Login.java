package Frame;
import java.awt.*;
import javax.sound.midi.VoiceStatus;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
JLabel jL1,jL2,jL3;
JButton jB1,jB2;;
JTextField jF1;
JPasswordField jP1;
private int i=3;//����ֻ��������3��
	public Login()
		{
			super("��½����");
			jL1=new JLabel("�û�����");
			jL1.setBounds(15,5,60,20);
			jL2=new JLabel("��¼����");
			jL2.setBounds(15,25,60,20);
			jF1=new JTextField("",20);
			jF1.setBounds(110,5,100,20);
			jP1=new JPasswordField("",20);
			jP1.setBounds(110,25,100,20);
			jB1=new JButton("ȷ��");
			jB1.setBounds(35,50,60,30);
			jB1.addActionListener(this);
			jB2=new JButton("ȡ��");
			jB2.setBounds(130,50,60,30);
			jB2.addActionListener(this);
			jL3=new JLabel("");
			jL3.setBounds(60,90,200,30);
		Container winContainer=this.getContentPane();
		winContainer.setLayout(null);
		winContainer.add(jL1);
		winContainer.add(jL2);
		winContainer.add(jL3);
		winContainer.add(jF1);
		winContainer.add(jP1);
		winContainer.add(jB1);
		winContainer.add(jB2);
		this.setSize(300,200);
		this.setVisible(true);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}
	public static void main(String[] args)
		{
			Login w1=new Login();
		}
	public void actionPerformed(ActionEvent e)
		{
		  if(e.getSource()==jB1)
	        {
			  if(jF1.getText().equals("admin")&&jP1.getText().equals("1234")) {
				  jL3.setText("������ȷ,��¼�ɹ�");
				  this.dispose();//�����ťʱ��¼��������,��ѡ�ν���
				  new CourseSelectionFrame();
				  }
				else{
					if(i==0) {//����0ʱ�����Ǿ��޷��ٴ�������
						jL3.setText("���������Ա��ϵ");
						System.exit(0);
					}else{
						jL3.setText("�������,��¼ʧ��,�㻹ʣ"+(i)+"��");//��ʾ���м��λ���
					}
	        }
				}else if(e.getSource()==jB2)
					System.exit(0);
		}
}

