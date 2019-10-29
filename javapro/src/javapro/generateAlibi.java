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
		setTitle("알리바이 생성하기");
		Container c = getContentPane();
		c.setLayout(null); // 컨텐트팬의 배치관리자 제거

		/*
		 * JCheckBox[] w5h1 = new JCheckBox[6]; String[] names = { "누구와", "언제", "어디서",
		 * "무엇을", "왜", "어떻게" };
		 */

		JCheckBox who = new JCheckBox("누구와");
		JCheckBox when = new JCheckBox("언제");
		JCheckBox where = new JCheckBox("어디서");
		JCheckBox what = new JCheckBox("무엇을");
		JCheckBox why = new JCheckBox("왜");
		JCheckBox how = new JCheckBox("어떻게");

		JLabel oneStage = new JLabel("~알리바이 생성기 1단계~");
		oneStage.setFont(new Font("a시월구일2", Font.PLAIN, 50));

		oneStage.setSize(600, 50);
		oneStage.setLocation(280, 30);
		c.add(oneStage);

		// 체크박스 나열
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
