package javapro;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class generateAlibi extends JFrame {
	generateAlibi() {
		setTitle("�˸����� �����ϱ�");
		JPanel NewWindowContainer = new JPanel();
		setContentPane(NewWindowContainer);

		JCheckBox[] w5h1 = new JCheckBox[6];
		String[] names = { "������", "����", "���", "������", "��", "���" };

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel oneStage = new JLabel(/*"�˸����� ������ 1�ܰ�  \"���� \""*/"<html><body>�˸����� ������ 1�ܰ�</body></html>");
		JLabel lineChange = new JLabel("<html><body><br><br><br><br></body></html>");
		oneStage.setFont(new Font("a�ÿ�����2",Font.PLAIN, 50));
		// üũ�ڽ� ��ġ �ű�� (�� �ٹٲ�)
		c.add(oneStage);
		c.add(lineChange);
		//c.add(new Label("�˸����� ������ 1�ܰ�  \"���� \""));

		for (int i = 0; i < w5h1.length; i++) {
			w5h1[i] = new JCheckBox(names[i]);
			w5h1[i].setBorderPainted(true);
			c.add(w5h1[i]);
		}

		c.add(new JButton("����� �ܾ� ��ġ�� ����"));

		setSize(1080, 720);
		setResizable(false);
		setVisible(true);
	}
}
