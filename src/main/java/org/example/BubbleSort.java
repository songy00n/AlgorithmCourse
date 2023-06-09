package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 시간 제한 2초
// 버블 정렬할 때 중간에 끝나면 멈추기
public class BubbleSort {

    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()); // 5
        mData[] a = new mData[n];
        for(int i=0; i<n; i++) {
          a[i] =  new mData(Integer.parseInt(reader.readLine()), i);
        }
        Arrays.sort(a); // a라는 배열의 자료가 정렬이 됨 기준은 사용자가 정의한 것으로
        int max=0;
        for(int i=0; i<n; i++){
            if(max<a[i].index-i) max = a[i].index -i;
        }
        System.out.println(max + 1);
    }
}
        class mData implements Comparable<mData> {
            int value;
            int index;

            public mData(int value, int index) {
                super();
                this.value = value;
                this.index = index;
            }

            @Override
            public int compareTo(mData o) {
                // 정렬기준
                System.out.println();

            }

        }


