package javapro;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class startImage extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	public startImage() {
		setTitle("알리바이 생성기");
		icon = new ImageIcon("F:\\java_2019\\javapro\\src\\pic\\a-rum.jpg");

		// 배경 Panel 생성후 컨텐츠페인으로 지정
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};

		/*
		 * JButton button = new JButton("버튼"); background.add(button);
		 */
		
		JLabel label = new JLabel("완벽한 알리바이와 함께 떠나주세요!");
		background.add(label);

		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setSize(1080, 720);
		setVisible(true);
	}
}

