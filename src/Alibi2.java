import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Alibi2 extends JFrame {

	public Alibi2() {
		JFrame jf=new JFrame("�˸����� ������");
		setTitle("�˸����� ������");
		
		JButton btn1 = new JButton("�˸����� �����ϱ�");
		btn1.setFont(new Font("���������� Bold", Font.PLAIN, 30));
		btn1.setBackground(Color.white);
		btn1.setForeground(Color.BLACK);
		//setLocation(1000,700);
		
		JButton btn2 = new JButton("�ó����� �Ẹ��");
		btn2.setFont(new Font("���������� Bold", Font.PLAIN, 30));
		btn2.setBackground(Color.white);
		btn2.setForeground(Color.BLACK);
		
		add(btn1,"East");
		add(btn2,"East");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1080, 720);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Alibi2();
	}
}