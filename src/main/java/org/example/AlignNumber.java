package org.example;

import java.util.Scanner;

//시간 제한 2초
//문) N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성
public class AlignNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){ // i=0         1        2
            for(int j=0; j<n; j++) { // j=0, 1,2,3,4 / 0,1,2,3
                if(a[i]>a[j+1]){
                    int temp = a[i];
                    a[i] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
    }
}
