import java.io.*;
import java.util.*;

/**
 * 13417 카드 문자열
 *
 * 입력:
 *      1. 첫째 줄에 테스트 케이스 수 T
 *      2. 이후 T 만큼 카드의 개수 N (1 ~ 1,000) 그리고 N 만큼 카드 준다.(대문자)
 *
 *문제 분석:
 *      1. 주어진 카드.. 왼쪽 부터 한장씩 가져올 수 있음,
 *      첫번째 카드 => 자신의 앞에 둔다.
 *      그 다음 부터는 가져와서 둔 카드의 왼쪽 or 오른쪽에 둔다.
 *      이 카드들을 이어서 문자열 만든다.
 *      이 문자열 중에 사전순으로 가장 빠른 녀석 출력
 * 출력:
 *      1. 거스름돈 동전의 최소 개수, 거슬러 줄 수 없으면 -1
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < T; i++){
            Deque<Character> deque = new ArrayDeque<>();
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            while(st.hasMoreTokens()){
                sb.append(st.nextToken());
            }
            char[] charArray = sb.toString().toCharArray();

            // 제일 왼쪽 카드는 무조건 선택하고 시작.
            deque.offer(charArray[0]);
            for(int j = 1; j < N; j++){
                // deque에 1개만 있을때 => 최초 실행
                if(deque.size() == 1){
                    if(deque.peek() < charArray[j]) deque.offerLast(charArray[j]);
                    else deque.offerFirst(charArray[j]);
                }

                else{
                    if(deque.peekFirst() >= charArray[j]) deque.offerFirst(charArray[j]);
                    else deque.offerLast(charArray[j]);
                }
            }
            while(!deque.isEmpty()){
                result.append(deque.poll());
            }
            result.append("\n");
        }

        bw.write(result.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
