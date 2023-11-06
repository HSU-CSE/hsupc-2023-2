import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= T ; i ++){
            int N = Integer.parseInt(br.readLine()); // 입력되는 단어의 개수
            int answer = 0; // 가위바위보의 개수
            for(int j = 0 ; j < N ; j ++){
                if(br.readLine().equals("가위바위보")) answer ++; // 만약 입력받은 문자열이 "가위바위보"와 같다면 가위바위보의 개수를 증가한다.
            }
            sb.append("Case #" + i + " : " + answer + "\n");
        }
        System.out.println(sb);
    }
}
