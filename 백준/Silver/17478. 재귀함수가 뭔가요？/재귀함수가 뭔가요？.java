import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * 17478 재귀함수가 뭔가요?
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String startMessage = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
        sb.append(startMessage + "\n");
        int cnt = 0;
        chatBot(N, cnt, sb);
        System.out.println(sb);
    }

    private static void chatBot(int N, int cnt, StringBuilder sb) {
        StringBuilder repeatSb = new StringBuilder();
        for(int i = 0; i < cnt * 4; i++){
            repeatSb.append("_");
        }
        String repeat = repeatSb.toString();
        if (cnt > N - 1) {
            sb.append(repeat + "\"재귀함수가 뭔가요?\"\n");
            sb.append(repeat + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            sb.append(repeat + "라고 답변하였지.\n");
            return;
        }

        sb.append(repeat + "\"재귀함수가 뭔가요?\"\n");
        sb.append(repeat + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
        sb.append(repeat + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
        sb.append(repeat + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        chatBot(N, ++cnt, sb);
        sb.append(repeat + "라고 답변하였지.\n");
    }


}

