import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Seat implements Comparable<Seat>{
    int r, c, dis;

    public Seat(int r, int c, int dis) {
        this.r = r;
        this.c = c;
        this.dis = dis;
    }

    @Override
    public int compareTo(Seat O){
        if(this.dis == O.dis){ // 만약 거리가 같으면
            return this.c - O.c; // 좌측에 있는 좌석을 우선으로
        }
        else return this.dis - O.dis; // 거리가 다르면 짧은 거리가 우선으로 정렬
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] answer = new int[N][M];
        // 상상부기의 위치
        int bugiy = -5; // 상상부기는 가장 가까운 좌석과 5만큼 떨어져 있습니다.
        int bugix = M / 2; // M은 홀수이므로 M / 2가 상상부기의 x좌표가 됩니다.
        int cnt = 1; // 좌석의 순서
        ArrayList<Seat> list = new ArrayList<>();
        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j < M ; j ++){
                int dis = (int)(Math.pow(Math.abs(bugiy - i), 2) + Math.pow(Math.abs(bugix - j), 2)); // 상상부기와의 거리 제곱
                list.add(new Seat(i, j, dis));
            }
        }
        Collections.sort(list); // 위에서 정의한 기준으로 좌석들을 정렬합니다.
        for(Seat s : list){
            answer[s.r][s.c] = cnt ++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i ++){
            for(int j = 0 ; j < M ; j ++){
                sb.append(answer[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
