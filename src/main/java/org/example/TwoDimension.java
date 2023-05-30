package org.example;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class TwoDimension {



    public static void main(String[] args) {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReadr(System.in) );
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine() ); //������ �������� �ڸ�


        int N = Integer.parseInt(stringTokenizer.nextToken()); //�������� ����
        int M = Integer.parseInt(stringTokenizer.nextToken()); //���� ����

        int A[][] = new int[N+1][N+1];
        for(int i=1; i<=N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine() );
            for(int j=1; j<=N; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int D[][] = new int[N+1][N+1];
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }
        // ���� �о����
        for(int i=0; i<M; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine() );
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(result);
        }
    }

}
