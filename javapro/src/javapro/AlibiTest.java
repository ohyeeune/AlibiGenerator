package javapro;

import java.util.*;

public class AlibiTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\t   �˸����� ������\n");

		String[] whenAlibi = new String[5];
		whenAlibi[0] = "���� ����";
		whenAlibi[1] = "���� ��ħ";
		whenAlibi[2] = "���� ����";
		whenAlibi[3] = "�̵���";
		whenAlibi[4] = "����";

		String[] whereAlibi = new String[5];
		whereAlibi[0] = "�б�";
		whereAlibi[1] = "ȸ��";
		whereAlibi[2] = "��";
		whereAlibi[3] = "����";
		whereAlibi[4] = "��";

		String[] whoAlibi = new String[5];
		whoAlibi[0] = "������";
		whoAlibi[1] = "�ҸӴϰ�";
		whoAlibi[2] = "�𸣴� �����";
		whoAlibi[3] = "������ �˴� �����";
		whoAlibi[4] = "���Ҿƹ�����";

		String[] whatAlibi = new String[5];
		whatAlibi[0] = "��";
		whatAlibi[1] = "��ʽ�";
		whatAlibi[2] = "��";
		whatAlibi[3] = "�޸�";
		whatAlibi[4] = "���� �����";

		String[] whyAlibi = new String[5];
		whyAlibi[0] = "�뵷 �شٰ�";
		whyAlibi[1] = "���� ������ �ִٰ�";
		whyAlibi[2] = "���ư��̴ٰ�";
		whyAlibi[3] = "���� ����";
		whyAlibi[4] = "�ٺ���";

		String[] howAlibi = new String[5];
		howAlibi[0] = "�� ���ٰ�";
		howAlibi[1] = "���� �����ٰ�";
		howAlibi[2] = "���� �Դٰ�";
		howAlibi[3] = "�ϴ��� �÷����ٰ�";
		howAlibi[4] = "�ɾ� �ִٰ�";

		Random random = new Random();
		int a = random.nextInt(5);
		System.out.println("������ ���� ����~!!");
		System.out.println(whenAlibi[a] + " �� " + whereAlibi[a] + " ����  " + whoAlibi[a] + " " + whatAlibi[a] + " ��(��) "
				+ whyAlibi[a] + " " + howAlibi[a] + "...");

		// ó�� �˸����� ���� ����

		// ����ڰ� �����ؼ� ������ �� ����
		String yon;
		String yon2;

		while (true) {
			System.out.print("������ �ȵ�ô� �κ��� �ֳ���?(Y/N) : ");
			yon = sc.nextLine();
			while (true) {
				if (yon.equalsIgnoreCase("y")) {
					int b = random.nextInt(5);

					System.out.println("��ġ�� ���� �κ��� �κ� ���ڸ� �����ּ���.");
					System.out.println("\t 1.���� \t 2.��� \n");
					System.out.println("\t 3.������ \t 4.������ \n");
					System.out.println("\t 5.�� \t 6.��� \n");
					System.out.print(">> ");

					int number = sc.nextInt();

					switch (number) {
					case 1:
						System.out.println(whenAlibi[b] + " �� " + whereAlibi[a] + " ���� " + whoAlibi[a] + " " + whatAlibi[a]
								+ " ��(��) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 2:
						System.out.println(whenAlibi[a] + " �� " + whereAlibi[b] + " ���� " + whoAlibi[a] + " " + whatAlibi[a]
								+ " ��(��) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 3:
						System.out.println(whenAlibi[a] + " �� " + whereAlibi[a] + " ���� " + whoAlibi[b] + " " + whatAlibi[a]
								+ " ��(��) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 4:
						System.out.println(whenAlibi[a] + " �� " + whereAlibi[a] + " ���� " + whoAlibi[a] + " " + whatAlibi[b]
								+ " ��(��) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 5:
						System.out.println(whenAlibi[a] + " �� " + whereAlibi[a] + " ����  " + whoAlibi[a] + " " + whatAlibi[a]
								+ " ��(��) " + whyAlibi[b] + " " + howAlibi[a] + "...");
						break;
					case 6:
						System.out.println(whenAlibi[a] + " �� " + whereAlibi[a] + " ����  " + whoAlibi[a] + " " + whatAlibi[a]
								+ " ��(��) " + whyAlibi[a] + " " + howAlibi[b] + "...");
						break;
					default:
						System.out.println("���� �ܿ� �ٸ� Ű�� �����̽��ϴ�.");
					}// switch
					
					System.out.print("����Ͻðڽ��ϱ�? (Y/N) >> ");
					yon2 = sc.next();
					if(yon2.equalsIgnoreCase("y")) continue;
					else if(yon2.equalsIgnoreCase("n")) {
						System.out.println("�Ϻ��� �˸����̿� �Բ� �����ֽ���");
						System.exit(0);
					}
					
				} // if

				else if (yon.equalsIgnoreCase("n")) {
					System.out.println("�ȳ������ʼ�~!~!!");
					System.exit(0);
				}

			} // �ȿ� while
		} // ū while

	} // main
}