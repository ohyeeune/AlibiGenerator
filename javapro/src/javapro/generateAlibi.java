package javapro;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class generateAlibi extends JFrame {
	generateAlibi() {
		setTitle("�˸����� �����ϱ�");
		Container c = getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����

		/*
		 * JCheckBox[] w5h1 = new JCheckBox[6]; String[] names = { "������", "����", "���",
		 * "������", "��", "���" };
		 */

		JCheckBox who = new JCheckBox("������");
		JCheckBox when = new JCheckBox("����");
		JCheckBox where = new JCheckBox("���");
		JCheckBox what = new JCheckBox("������");
		JCheckBox why = new JCheckBox("��");
		JCheckBox how = new JCheckBox("���");

		JLabel oneStage = new JLabel("~�˸����� ������ 1�ܰ�~");
		oneStage.setFont(new Font("a�ÿ�����2", Font.PLAIN, 50));

		oneStage.setSize(600, 50);
		oneStage.setLocation(280, 30);
		c.add(oneStage);

		// üũ�ڽ� ����
		who.setSize(180, 90);
		who.setLocation(360, 100);
		c.add(who);

		when.setSize(180, 90);
		when.setLocation(360, 200);
		c.add(when);

		where.setSize(180, 90);
		where.setLocation(360, 300);
		c.add(where);

		what.setSize(180, 90);
		what.setLocation(600, 100);
		c.add(what);

		why.setSize(180, 90);
		why.setLocation(600, 200);
		c.add(why);

		how.setSize(180, 90);
		how.setLocation(600, 300);
		c.add(how);

		JButton nextStage = new JButton(new ImageIcon("F:\\java_2019\\javapro\\src\\pic\\retryBtn.jpg"));
		nextStage.setSize(180, 90);
		nextStage.setLocation(430, 460);
		c.add(nextStage);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1080, 720);
		setVisible(true);
	}
}
