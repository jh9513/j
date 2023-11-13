mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액) :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int cashBack = (int)(input * 0.1);
        if ( cashBack > 300 ) {
            System.out.println("한 건의 캐시백 포인트는 최대 300원을 넘을 수 없습니다");
            cashBack = 300;
        }
        System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", input, cashBack));
    }

}
