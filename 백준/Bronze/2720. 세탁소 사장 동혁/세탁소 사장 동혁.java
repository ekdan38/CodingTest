import java.io.*;
import java.util.*;

public class Main {
    private final static int Quarter = 25;
    private final static int Dime = 10;
    private final static int Nickel = 5;
    private final static int Penny = 1;

    public static void main(String[] args) throws IOException {

        /**
         *  쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오.
         *   거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다.
         *    예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int C = Integer.parseInt(br.readLine());
            sb.append(C / Quarter).append(" ");
            sb.append((C % Quarter) / Dime).append(" ");
            sb.append((C % Quarter % Dime) / Nickel).append(" ");
            sb.append((C % Quarter % Dime % Nickel) / Penny).append("\n");
        }
        System.out.print(sb);

    }


}
