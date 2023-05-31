package org.example;

/*
        시간 제한 2.4초

        문제)
        N개의 수 A1, A2, ... An과 L이 주어진다. Ai-l+1 ~ Ai중 최소값을 D1라고 할 때 D에 저장된 수를 출력하는 프로그램을 작성하시오.
        이때 i <= 0인 Ai는 무시하고 D를 구해야 한다     */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Min {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(bf.readLine()); // "1 2 3"

    int n = Integer.parseInt(st.nextToken()); // 숫자의 개수 12
    int l = Integer.parseInt(st.nextToken()); // 슬라이딩 윈도우 크기 3

    st = new StringTokenizer(br.readLine()); // " 1 5 2 3 ..."

    Deque<Node> mydeque = new LinkedList<>();

    for(int i=0; i<n; i++){
        int now = Integer.parseInt(st.nextToken()); // 1 5 2 ...
        while(!mydeque.isEmpty()&&mydeque.getLast().value > now){
            mydeque.removeLast();
        }
        mydeque.addLast(new Node(now, i));
        if(mydeque.getFirst().index<=i-l){
            mydeque.removeFirst();
        }  // 인덱스를 벗어난 것 재외
        bw.write(mydeque.getFirst().value+"");
    }

    bw.flush();
    bw.close();


}

static class Node{
    public int value;;
    public int index;

    Node(int value, int index){}
    this.value = value;

}
