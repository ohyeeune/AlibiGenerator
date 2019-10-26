package javapro;

import java.util.*;

public class AlibiTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\t   알리바이 생성기\n");

		String[] whenAlibi = new String[5];
		whenAlibi[0] = "어제 저녁";
		whenAlibi[1] = "오늘 아침";
		whenAlibi[2] = "오늘 저녁";
		whenAlibi[3] = "이따가";
		whenAlibi[4] = "옛날";

		String[] whereAlibi = new String[5];
		whereAlibi[0] = "학교";
		whereAlibi[1] = "회사";
		whereAlibi[2] = "길";
		whereAlibi[3] = "빵집";
		whereAlibi[4] = "집";

		String[] whoAlibi = new String[5];
		whoAlibi[0] = "엄마가";
		whoAlibi[1] = "할머니가";
		whoAlibi[2] = "모르는 사람이";
		whoAlibi[3] = "옛날에 알던 사람이";
		whoAlibi[4] = "외할아버지가";

		String[] whatAlibi = new String[5];
		whatAlibi[0] = "빵";
		whatAlibi[1] = "장례식";
		whatAlibi[2] = "물";
		whatAlibi[3] = "메모";
		whatAlibi[4] = "애플 우롱차";

		String[] whyAlibi = new String[5];
		whyAlibi[0] = "용돈 준다고";
		whyAlibi[1] = "빵에 문제가 있다고";
		whyAlibi[2] = "돌아가셨다고";
		whyAlibi[3] = "불이 나서";
		whyAlibi[4] = "바빠서";

		String[] howAlibi = new String[5];
		howAlibi[0] = "길 가다가";
		howAlibi[1] = "빨리 오려다가";
		howAlibi[2] = "빵을 먹다가";
		howAlibi[3] = "하늘을 올려보다가";
		howAlibi[4] = "앉아 있다가";

		Random random = new Random();
		int a = random.nextInt(5);
		System.out.println("무작위 문장 생성~!!");
		System.out.println(whenAlibi[a] + " 에 " + whereAlibi[a] + " 에서  " + whoAlibi[a] + " " + whatAlibi[a] + " 을(를) "
				+ whyAlibi[a] + " " + howAlibi[a] + "...");

		// 처음 알리바이 랜덤 생성

		// 사용자가 선택해서 수정할 수 있음
		String yon;
		String yon2;

		while (true) {
			System.out.print("마음에 안드시는 부분이 있나요?(Y/N) : ");
			yon = sc.nextLine();
			while (true) {
				if (yon.equalsIgnoreCase("y")) {
					int b = random.nextInt(5);

					System.out.println("고치고 싶은 부분을 부분 숫자를 눌러주세요.");
					System.out.println("\t 1.언제 \t 2.어디서 \n");
					System.out.println("\t 3.누구랑 \t 4.무엇을 \n");
					System.out.println("\t 5.왜 \t 6.어떻게 \n");
					System.out.print(">> ");

					int number = sc.nextInt();

					switch (number) {
					case 1:
						System.out.println(whenAlibi[b] + " 에 " + whereAlibi[a] + " 에서 " + whoAlibi[a] + " " + whatAlibi[a]
								+ " 을(를) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 2:
						System.out.println(whenAlibi[a] + " 에 " + whereAlibi[b] + " 에서 " + whoAlibi[a] + " " + whatAlibi[a]
								+ " 을(를) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 3:
						System.out.println(whenAlibi[a] + " 에 " + whereAlibi[a] + " 에서 " + whoAlibi[b] + " " + whatAlibi[a]
								+ " 을(를) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 4:
						System.out.println(whenAlibi[a] + " 에 " + whereAlibi[a] + " 에서 " + whoAlibi[a] + " " + whatAlibi[b]
								+ " 을(를) " + whyAlibi[a] + " " + howAlibi[a] + "...");
						break;
					case 5:
						System.out.println(whenAlibi[a] + " 에 " + whereAlibi[a] + " 에서  " + whoAlibi[a] + " " + whatAlibi[a]
								+ " 을(를) " + whyAlibi[b] + " " + howAlibi[a] + "...");
						break;
					case 6:
						System.out.println(whenAlibi[a] + " 에 " + whereAlibi[a] + " 에서  " + whoAlibi[a] + " " + whatAlibi[a]
								+ " 을(를) " + whyAlibi[a] + " " + howAlibi[b] + "...");
						break;
					default:
						System.out.println("숫자 외에 다른 키를 누르셨습니다.");
					}// switch
					
					System.out.print("계속하시겠습니까? (Y/N) >> ");
					yon2 = sc.next();
					if(yon2.equalsIgnoreCase("y")) continue;
					else if(yon2.equalsIgnoreCase("n")) {
						System.out.println("완벽한 알리바이와 함께 떠나주시죠");
						System.exit(0);
					}
					
				} // if

				else if (yon.equalsIgnoreCase("n")) {
					System.out.println("안녕히가십쇼~!~!!");
					System.exit(0);
				}

			} // 안에 while
		} // 큰 while

	} // main
}