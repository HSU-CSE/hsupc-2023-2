import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        boolean[][] visited = new boolean[L * 2][L * 2]; // 명령어의 최대 길이가 L이면, 최대 이동할 수 있는 길이 또한 L입니다. 따라서, x, y 좌표의 최대 길이는 L * 2가 됩니다.
        int curx = L; // 배열의 길이를 L * 2로 하기 때문에, 원점은 L, L과 같습니다.
        int cury = L;
        visited[curx][cury] = true; // 처음의 원점은 색칠이 되어 있으므로 방문 처리를 해줍니다.
        int cnt = 1; // 색칠이 된 칸의 수 => 원점이 색칠 되어 있으므로 1로 초기화 해줍니다.
        String command = br.readLine();
        for(int i = 0 ; i < L ; i ++){
            char dir = command.charAt(i); // 이동 해야 할 방향
            switch (dir){
                case 'N':
                    cury --;
                    break;
                case 'E':
                    curx ++;
                    break;
                case 'S':
                    cury ++;
                    break;
                case 'W':
                    curx --;
                    break;
            }
            if(!visited[cury][curx]){ // 방문을 안 한(색칠이 안 된)상태라면
                visited[cury][curx] = true; // 방문 상태로 바꾼 후
                cnt ++; // 색칠 된 칸 수를 증가시켜 줍니다.
            }
        }
        System.out.println(cnt);
    }
}
