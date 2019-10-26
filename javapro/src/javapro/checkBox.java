package javapro;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class checkBox extends JFrame{
	private JCheckBox [] w5h1 = new JCheckBox [6];
	private String [] names = {"누구와","언제","어디서","무엇을","왜","어떻게"};
	
	
	public checkBox() {
		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Label("알리바이 생성기 1단계  \"선택 \""));
		
		for(int i=0;i<w5h1.length;i++) {
			w5h1[i]=new JCheckBox(names[i]);
			w5h1[i].setBorderPainted(true);
			c.add(w5h1[i]);
		}
		
		c.add(new JButton("다음단계 고고~!"));
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new checkBox();
	}
}