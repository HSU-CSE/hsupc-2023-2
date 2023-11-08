import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        if(L - N < N - 1){ // 엘리베이터를 이용한 후 계단을 내려가야 하는 거리 (L - N)이 1층부터 계단을 올라가야 하는 거리(N) 보다 작은 경우
            System.out.println(L - N);
        }
        else{ // 1층부터 계단을 올라가야 하는 층수가 더 적거나 같은 경우
            System.out.println(N - 1);
        }
        //System.out.println(Math.min(L - N, N - 1)); // Math.min을 이용하여 출력해도 됩니다.
    }
}
