import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
class Word implements Comparable<Word>{
    String word; // 단어
    double tfIdf; // TF-IDF 값

    public Word(String word, double idf) {
        this.word = word;
        this.tfIdf = idf;
    }

    @Override
    public int compareTo(Word O){
        if(this.tfIdf == O.tfIdf){ // 만약 TF-IDF 값이 같다면
            return this.word.compareTo(O.word); // 알파벳 사전순으로 단어 정렬
        }
        // TF-IDF값이 다르면 TF-IDF값을 기준으로 오름차순 정렬
        else if(this.tfIdf > O.tfIdf) return -1;
        else return 1;
    }

}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> df = new HashMap<>(); // DF 값을 저장할 Map
        HashMap<String, Integer>[] tf = new HashMap[N]; // TF 값을 저장할 Map
        HashMap<String, Double> idf = new HashMap<>(); // IDF 값을 저장할 Map

        for(int i = 0 ; i < N ; i ++){
            tf[i] = new HashMap<>(); // 문장의 개수(N) 만큼 HashMap 생성
        }

        for(int i = 0 ; i < N ; i ++){
            st = new StringTokenizer(br.readLine());
            int len = st.countTokens();
            for(int j = 0 ; j < len ; j ++) { // 단어의 개수(len) 만큼 반복
                String cur = st.nextToken();
                tf[i].put(cur, tf[i].getOrDefault(cur, 0) + 1);
            }
        }

        for(int i = 0 ; i < N ; i ++){ // 모든 문서에 대해 DF값 구하기
            for(String s : tf[i].keySet()){
                df.put(s, df.getOrDefault(s, 0) + 1);
            }
        }

        for(String s : df.keySet()){ // DF값을 이용하여 IDF값으로 변화
            idf.put(s, Math.log(N / (1 + df.get(s))));
        }

        for(int i = 0 ; i < M ; i ++){
            ArrayList<Word> WordList = new ArrayList<>();
            int idx = Integer.parseInt(br.readLine()) - 1; // 문서는 1번부터 시작하기 때문에 1을 빼주어야 합니다.
            for(String s : tf[idx].keySet()){
                WordList.add(new Word(s, idf.get(s) * tf[idx].get(s)));
            }
            Collections.sort(WordList); // 위에서 정의한 Comparable 인터페이스로 정렬
            for(Word w : WordList){
                sb.append(w.word + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
