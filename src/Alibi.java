import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alibi extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JFrame jf = new JFrame("알리바이 생성기");

	public Alibi() {
		setTitle("알리바이 생성기");
		icon = new ImageIcon("c:\\conanBackground.jpg");

		// 배경 Panel 생성후 컨텐츠페인으로 지정
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};

		background.setLayout(null);

		/*JButton btn1 = new JButton("알리바이 생성하기");
		btn1.setLayout(null);
		btn1.setBounds(830, 380, 160, 80); // setBounds(x,y,w,h); 좌표 x,y 가로, 세로
		btn1.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 17));
		btn1.setBackground(Color.white);
		btn1.setForeground(Color.BLACK);
		background.add(btn1, "West");

		JButton btn2 = new JButton("시나리오 써보기");
		btn2.setLayout(null);
		btn2.setBounds(830, 480, 160, 80);
		btn2.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 17));
		btn2.setBackground(Color.white);
		btn2.setForeground(Color.BLACK);
		background.add(btn2, "West");*/		

		JButton btn3 = new JButton(new ImageIcon("C:\\Users\\0hyee\\Downloads\\miamor\\1.jpg"));
		btn3.setLayout(null);
		btn3.setBounds(830, 580, 160, 80);
		btn3.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 17));
		btn3.setBackground(Color.white);
		btn3.setForeground(Color.BLACK);
		background.add(btn3, "West");

		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);

		JPanel MainContainer = new JPanel();
		setContentPane(MainContainer);
		btn3.addActionListener(new ActionListener() {
			// 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new madePeople(); // 클래스 newWindow를 새로 만들어낸다
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
	// 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
	madePeople() {
		setTitle("만든 사람들");
		// 주의, 여기서 setDefaultCloseOperation() 정의를 하지 말아야 한다
		// 정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다

		JScrollPane scrollPane;
		ImageIcon back;

		back = new ImageIcon("team.jpg");

		// 배경 Panel 생성후 컨텐츠페인으로 지정
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
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
