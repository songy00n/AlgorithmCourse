package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AbsHeap {

    public static void main(String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 18 연산의 개수

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
            int first_abs = Math.abs(o1); //1 2 0
            int second_abs = Math.abs(o2); //-1 0 1
            if (first_abs == second_abs) return o1>o2 ? 1: -1; //절대값이 같으면 음수 우선 정렬
            else return first_abs - second_abs; // 2-0=0    0-1=-1
        }); // 정렬 기준을 명시함
        for(int i=0; i<n; i++){
            int request = Integer.parseInt(br.readLine());
            if(request==0){
                if(myQueue.isEmpty()) System.out.println("0");
                else System.out.println(myQueue.poll());
            } else{
                myQueue.add(request);
            }
        }
    }

}
