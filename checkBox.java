package javapro;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class checkBox extends JFrame{
	private JCheckBox [] w5h1 = new JCheckBox [6];
	private String [] names = {"������","����","���","������","��","���"};
	
	
	public checkBox() {
		setTitle("üũ�ڽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Label("�˸����� ������ 1�ܰ�  \"���� \""));
		
		for(int i=0;i<w5h1.length;i++) {
			w5h1[i]=new JCheckBox(names[i]);
			w5h1[i].setBorderPainted(true);
			c.add(w5h1[i]);
		}
		
		c.add(new JButton("�����ܰ� ���~!"));
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new checkBox();
	}
}