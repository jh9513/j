import java.util.*;

public class Main {

    public static int prompt() {
        int numOfLotto;             // 로또 개수
        Scanner kb = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]");
        while(true){
            System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10) : ");
            numOfLotto = kb.nextInt();
            // 1~10 외 입력 방지
            if(numOfLotto <= 0 || numOfLotto > 10){
                System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
                continue;
            }
            break;
        }

        return numOfLotto;
    }

    public static void main(String[] args) {
        int numOfLotto;             // 로또 개수
        int[][] lottoNumArr;        // 로또 번호 배열
        int[] winningNumArr = new int[6]; // 당첨 번호 배열
        char order = 'A';           // 로또 순서

        numOfLotto = prompt();
        lottoNumArr = new int[numOfLotto][6];  // 로또 번호 배열 크기 설정

        // 로또 번호 생성 및 정렬
        for (int i = 0; i < lottoNumArr.length; i++) {
            for (int j = 0; j < lottoNumArr[i].length; j++) {
                lottoNumArr[i][j] = new Random().nextInt(45) + 1;
                // 중복 제거
                for (int k = 0; k < j; k++) {
                    if(lottoNumArr[i][j] == lottoNumArr[i][k]){
                        j--;
                        break;
                    }
                }
            }
            Arrays.sort(lottoNumArr[i]);
        }

        // 로또 번호 출력
        for (int i = 0; i < lottoNumArr.length; i++) {
            System.out.print(order++ + "\t");
            for (int j = 0; j < lottoNumArr[i].length; j++) {
                if(j == 5) {
                    System.out.printf("%02d\n", lottoNumArr[i][j]);
                } else {
                    System.out.printf("%02d, ", lottoNumArr[i][j]);
                }
            }
        }
        System.out.println();


        // 당첨 번호 생성 및 정렬
        for (int i=0; i<6; i++) {
            winningNumArr[i] = new Random().nextInt(45) + 1;
            // 중복 번호 제거
            for (int j = 0; j < i; j++) {
                if(winningNumArr[i] == winningNumArr[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(winningNumArr);

        // 당첨 번호 출력
        System.out.println("[로또 발표]");
        System.out.print("\t");
        for(int i=0; i<6; i++) {
            if(i==5){
                System.out.print(winningNumArr[i] < 10 ? String.format("%02d\n", winningNumArr[i]): winningNumArr[i]+"\n");
            } else {
                System.out.print(winningNumArr[i] < 10 ? String.format("%02d, ", winningNumArr[i]): winningNumArr[i]+", ");
            }
        }
        System.out.println();

        // 내 로또 당첨 여부 발표
        order = 'A';
        System.out.println("[내 로또 발표]");

        for(int i=0; i<numOfLotto; i++) {
            int cnt = 0;
            System.out.print(order++ +"\t");
            for (int j = 0; j < 6; j++) {
                if(j==5){
                    System.out.print(lottoNumArr[i][j] < 10 ? String.format("%02d ", lottoNumArr[i][j]): lottoNumArr[i][j]+ " ");
                } else {
                    System.out.print(lottoNumArr[i][j] < 10 ? String.format("%02d, ", lottoNumArr[i][j]): lottoNumArr[i][j]+", ");
                }
                for (int k = 0; k < 6; k++) {
                    if(winningNumArr[k] == lottoNumArr[i][j])
                        cnt++;
                }
            }
            System.out.println(" => " + cnt + "개 일치");
        }
    }
}
