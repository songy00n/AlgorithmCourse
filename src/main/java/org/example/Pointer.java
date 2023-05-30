package org.example;

import java.util.Scanner;

public class Pointer {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 15
        int count = 1; //����� ��
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N) {
            if(sum == N) {
                count++; // 2 3
                end_index++; // 6 7
                sum = sum + end_index; // 15+6=21
            } else if(sum > N) {
                sum = sum - end_index; // 21-6 = 15
                start_index++; //2
            } else {
                end_index++; // 2 3 4 5
                sum = sum + end_index; // 1+2+3+4+5
            }
        }
    }

}
