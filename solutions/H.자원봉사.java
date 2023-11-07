import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] dishes = new long[N]; // 그릇의 개수를 저장하는 배열
        long total = 0; // 전체 그릇의 수
        for(int i = 0 ; i < N ; i ++){
            int tmp = Integer.parseInt(st.nextToken());
            dishes[i] = tmp;
            total += tmp;
        }
        long num = total / N; // 각각의 학생들이 가지고 있어야 하는 그릇의 개수
        long answer = 0; // 이동 횟수
        for(int i = 0 ; i < N - 1 ; i ++){ // 각각의 학생들이 옆의 학생에게 그릇을 전달 (마지막 학생은 전달하지 않기 때문에 N - 1까지)
            long dif = dishes[i] - num; // 전달하거나(dif >= 0) 전달받는(dif <= 0) 그릇 개수
            dishes[i + 1] += dif;
            answer += Math.abs(dif);
        }
        System.out.println(answer);
    }
}

