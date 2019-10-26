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
		setTitle("알리바이 생성하기");
		JPanel NewWindowContainer = new JPanel();
		setContentPane(NewWindowContainer);

		JCheckBox[] w5h1 = new JCheckBox[6];
		String[] names = { "누구와", "언제", "어디서", "무엇을", "왜", "어떻게" };

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel oneStage = new JLabel(/*"알리바이 생성기 1단계  \"선택 \""*/"<html><body>알리바이 생성기 1단계</body></html>");
		JLabel lineChange = new JLabel("<html><body><br><br><br><br></body></html>");
		oneStage.setFont(new Font("a시월구일2",Font.PLAIN, 50));
		// 체크박스 위치 옮기기 (라벨 줄바꿈)
		c.add(oneStage);
		c.add(lineChange);
		//c.add(new Label("알리바이 생성기 1단계  \"선택 \""));

		for (int i = 0; i < w5h1.length; i++) {
			w5h1[i] = new JCheckBox(names[i]);
			w5h1[i].setBorderPainted(true);
			c.add(w5h1[i]);
		}

		c.add(new JButton("어색한 단어 고치러 가기"));

		setSize(1080, 720);
		setResizable(false);
		setVisible(true);
	}
}
