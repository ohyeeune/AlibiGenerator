import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alibi extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JFrame jf = new JFrame("�˸����� ������");

	public Alibi() {
		setTitle("�˸����� ������");
		icon = new ImageIcon("c:\\conanBackground.jpg");

		// ��� Panel ������ �������������� ����
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};

		background.setLayout(null);

		/*JButton btn1 = new JButton("�˸����� �����ϱ�");
		btn1.setLayout(null);
		btn1.setBounds(830, 380, 160, 80); // setBounds(x,y,w,h); ��ǥ x,y ����, ����
		btn1.setFont(new Font("���������� Bold", Font.PLAIN, 17));
		btn1.setBackground(Color.white);
		btn1.setForeground(Color.BLACK);
		background.add(btn1, "West");

		JButton btn2 = new JButton("�ó����� �Ẹ��");
		btn2.setLayout(null);
		btn2.setBounds(830, 480, 160, 80);
		btn2.setFont(new Font("���������� Bold", Font.PLAIN, 17));
		btn2.setBackground(Color.white);
		btn2.setForeground(Color.BLACK);
		background.add(btn2, "West");*/		

		JButton btn3 = new JButton(new ImageIcon("C:\\Users\\0hyee\\Downloads\\miamor\\1.jpg"));
		btn3.setLayout(null);
		btn3.setBounds(830, 580, 160, 80);
		btn3.setFont(new Font("���������� Bold", Font.PLAIN, 17));
		btn3.setBackground(Color.white);
		btn3.setForeground(Color.BLACK);
		background.add(btn3, "West");

		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);

		JPanel MainContainer = new JPanel();
		setContentPane(MainContainer);
		btn3.addActionListener(new ActionListener() {
			// ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new madePeople(); // Ŭ���� newWindow�� ���� ������
			}
		});

		MainContainer.add(btn3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1080, 720);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Alibi();
	}
}

class madePeople extends JFrame {
	// ��ư�� �������� ��������� �� â�� ������ Ŭ����
	madePeople() {
		setTitle("���� �����");
		// ����, ���⼭ setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ�
		// �����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ� ������

		JScrollPane scrollPane;
		ImageIcon back;

		back = new ImageIcon("team.jpg");

		// ��� Panel ������ �������������� ����
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};

		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);

		setSize(1280, 720);
		setResizable(false);
		setVisible(true);
	}
}
