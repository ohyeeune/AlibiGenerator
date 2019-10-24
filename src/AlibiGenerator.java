import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AlibiGenerator extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	public AlibiGenerator() {
		setTitle("알리바이 생성기");
		icon = new ImageIcon("C:\\alibi.jpg");
		
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		
		add(background); // 배경 생기게 하는 거

		JButton btn3 = new JButton(new ImageIcon("C:\\button1.jpg"));
		add(btn3,"East");
		btn3.setBounds(50, 80, 165, 93);
		//background.add(btn3,"East");
		btn3.setVisible(true);
	}
	
	public static void main(String[] args) {
		AlibiGenerator frame = new AlibiGenerator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1080,720);
		frame.setVisible(true);
	}
}