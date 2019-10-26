package javapro;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AlibiGenerator extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	public AlibiGenerator() {
		setTitle("알리바이 생성기");
		icon = new ImageIcon("F:\\java_2019\\javapro\\src\\pic\\alibi.jpg");

		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		background.setLayout(null);

		add(background); // 배경 생기게 하는 거

		JButton btn1 = new JButton(new ImageIcon("F:\\java_2019\\javapro\\src\\pic\\button_1.jpg"));
		btn1.setSize(180, 90);
		btn1.setLocation(810, 350);
		background.add(btn1);
		
		Music introMusic = new Music(true);
		introMusic.start();

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new generateAlibi();
			}
		});

		JButton btn2 = new JButton(new ImageIcon("F:\\java_2019\\javapro\\src\\pic\\button_2.jpg"));
		btn2.setSize(180, 90);
		btn2.setLocation(810, 450);
		background.add(btn2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1080, 720);
		setVisible(true);
	}
	/*public static void main(String ar[]) {
		new AlibiGenerator();
	}*/
}

