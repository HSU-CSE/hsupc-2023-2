# A. 가위바위보

| 시간 제한 | 메모리 제한 |
| --- | --- |
| 1초 | 256MB |

## 문제

상상부기는 가위바위보를 굉장히 좋아한다.

상상부기는 친구들이 '가위바위보'라고 정확하게 말하지 않고 '가위bawebo'처럼 다르게 말하는 경우엔 가위바위보를 하지 않으려고 한다.

상상부기가 가위바위보를 하는 횟수를 구해보자.


## 입력
첫째 줄에는 테스트 케이스가 주어지고, 다음 줄에 단어의 개수 $N$이 주어지고, 이후 $N$개의 줄에 단어가 주어진다.

단어의 길이는 30을 넘지 않는다. 단어 사이에 공백이 존재하지 않는다.

$1 \leq N \leq 10\,000$


## 출력

상상부기가 가위바위보를 하는 횟수를 출력형식에 맞게 출력해보자.

## 예제 입력

```
4
4
가위바위보
가위바위보
가위바위보
가위바위보
3
가워바워븨
가위바위뵤
가위바위뽀
4
rockscissorpaper
가위방위보
가위bawebo
가위바위보
2
가위바위보가위바위보
위가위바위보가
```

## 예제 출력

```
Case #1 : 4
Case #2 : 0
Case #3 : 1
Case #4 : 0
```