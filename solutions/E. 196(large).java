import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 버퍼
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // 출력 String
        StringTokenizer st;
        for(int i = 0 ; i < T ; i ++){
            sb.append("Case #" + (i + 1) + " : ");
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            HashMap<Long, Integer> map = new HashMap<>();
            int answer = 0;
            for(int j = 0 ; j < N ; j ++){
                long cur = Long.parseLong(st.nextToken());
                map.put(cur, map.getOrDefault(cur, 0) + 1); // map에 입력 받은 값을 저장
                if(map.containsKey(196 - cur)){
                    answer += map.get(196 - cur); // 196이 될 수 있으면 answer값에 가능한 쌍 추가
                }
            }
            sb.append(answer + "\n");
        }
        System.out.println(sb);
    }
}
