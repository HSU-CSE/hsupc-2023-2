import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1번 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 버퍼
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // 출력 String
        StringTokenizer st;
        int[] arr;
        for(int i = 0 ; i < T ; i ++){
            sb.append("Case #" + (i + 1) + " : ");
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new int[N];
            for(int j = 0 ; j < N ; j ++){ // 입력 받은 수 배열에 저장
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int answer = 0;
            for(int j = 0 ; j < N ; j ++){ // j번째 수를 기준으로
                for(int k = j + 1 ; k < N ; k ++){ // k(j번 이후의 수)들을 탐색하며
                    if(arr[j] + arr[k] == 196){ // 두 수의 합이 196이 되는 경우
                        answer ++; // 정답을 1증가 시킨다.
                    }
                }
            }
            sb.append(answer + "\n");
        }
        System.out.println(sb);
    }
}


//2번 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 버퍼
        int T = Integer.parseInt(br.readLine());
        final int PLUS = 500;
        StringBuilder sb = new StringBuilder(); // 출력 String 
        StringTokenizer st;
        int[] Numbers ;
        for(int i = 0 ; i < T ; i ++){
            sb.append("Case #" + (i + 1) + " : ");
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Numbers = new int[1300];
            int answer = 0;
            for(int j=0;j<N;j++){
                int num = Integer.parseInt(st.nextToken());
                answer+=Numbers[196-num+PLUS];
                Numbers[num+PLUS]++;
            }
            sb.append(answer + "\n");
        }
        System.out.println(sb);
    }
}
