package javapro;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class startImage extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	public startImage() {
		setTitle("�˸����� ������");
		icon = new ImageIcon("F:\\java_2019\\javapro\\src\\pic\\a-rum.jpg");

		// ��� Panel ������ �������������� ����
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};

		/*
		 * JButton button = new JButton("��ư"); background.add(button);
		 */
		
		JLabel label = new JLabel("�Ϻ��� �˸����̿� �Բ� �����ּ���!");
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

