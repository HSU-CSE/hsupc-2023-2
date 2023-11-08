import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        M %= 4;
        if(M == 0){
            for(int i = 0 ; i < N + 1 ; i ++){
                for(int j = 0 ; j < N ; j ++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
        }
        else if(M == 1){
            for(int i = 0 ; i < N ; i ++){
                for(int j = N - i ; j > 0 ; j --){
                    sb.append("  ");
                }
                for(int j = 0 ; j < i * 2 + 1 ; j ++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
            for(int i = 0 ; i < N ; i ++){
                for(int j = 0 ; j < i ; j ++){
                    sb.append("  ");
                }
                for(int j = 0 ; j < 2 * (N - i) - 1 ; j ++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
        }
        else if(M == 2){
            for(int i = 0 ; i < N ; i ++){
                for(int j = 0 ; j < N + 1 ; j ++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
        }
        else {
            for(int i = 0 ; i < N ; i ++){
                for(int j = N - 1 - i ; j > 0 ; j --){
                    sb.append("  ");
                }
                for(int j = 0 ; j < i * 2 + 1 ; j ++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
            for(int i = 0 ; i < N ; i ++){
                for(int j = 0 ; j <= i ; j ++){
                    sb.append("  ");
                }
                for(int j = 0 ; j < (N - i) * 2 - 1 ; j ++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
