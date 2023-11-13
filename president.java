import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final String[] Candidates = {"이재명", "윤석열", "심상정", "안철수"};

        double progess = 0.0;           // 투표진행율
        int[] votes = new int[4];       // 투표수
        int numOfVoter;                 // 투표 인덱스
        int electedNum= 0;              // 당선자 인덱스

        // 투표 진행
        for(numOfVoter = 1; numOfVoter <= 10000; numOfVoter++) {

            progess = numOfVoter / 10000.0 * 100;

            int vote = new Random().nextInt(4);
            votes[vote]++;

            System.out.printf("[투표진행율] : %.2f%%,  %d명 투표 => %s \n", progess, numOfVoter, Candidates[vote]);
            System.out.printf("[기호:1] 이재명 : %.2f%%, (투표수 : %d)\n", (votes[0]/10000.0)*100, votes[0]);
            System.out.printf("[기호:2] 윤석열 : %.2f%%, (투표수 : %d)\n", (votes[1]/10000.0)*100, votes[1]);
            System.out.printf("[기호:3] 심상정 : %.2f%%, (투표수 : %d)\n", (votes[2]/10000.0)*100, votes[2]);
            System.out.printf("[기호:4] 안철수 : %.2f%%, (투표수 : %d)\n", (votes[3]/10000.0)*100, votes[3]);
            System.out.println();
        }

        // 투표 결과
        int tmpMax = votes[0];
        for(int i=1; i<4; i++){
            if( tmpMax < votes[i]){
                tmpMax = votes[i];
                electedNum = i;
            }
        }

        System.out.println("[투표 결과] 당선인 : " + Candidates[electedNum] );
    }
}

