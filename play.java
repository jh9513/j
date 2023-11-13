import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요.:");
        int 나이 = scanner.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int 입장시간 = scanner.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String 국가유공자입력 = scanner.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String 복지카드입력 = scanner.next();

        boolean 국가유공자여부 = false;
        boolean 복지카드여부 = false;
        int 입장료 = 0;

        if (국가유공자입력.equals("y") || 국가유공자입력.equals("Y") || 국가유공자입력.equals("ㅛ")) {
            국가유공자여부 = true;
        } else {
            국가유공자여부 = false;
        }
        if (복지카드입력.equals("y") || 복지카드입력.equals("Y") || 복지카드입력.equals("ㅛ")) {
            복지카드여부 = true;
        } else  {
            복지카드여부 = false;
        }

        if (나이 < 3) {
            입장료 += 0;
        } else if (나이 < 13 || 입장시간 > 17) {
            입장료 += 4000;
        } else if (복지카드여부 || 국가유공자여부) {
            입장료 += 8000;
        } else {
            입장료 += 10000;
        }
        System.out.println("입장료는 " + 입장료 + "입니다.");

    }
}
