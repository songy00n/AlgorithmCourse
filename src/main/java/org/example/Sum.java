package org.example;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Sum {


    public static void main(String[] args) {

        BufferedReader bufferedReader =new BufferedReader(new InputStreamReadr(System.in) );
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine() );

        //System.out.println(stringTokenizer.nextToken());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] s = new long [suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine() );
        for(int i=1; i<=suNo; i++) {
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q=0; q<quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // "1 3", "2 4, "5 5"
            int i = Integer.parseInt(stringTokenizer.nextToken()); // 1
            int j = Integer.parseInt(stringTokenizer.nextToken()); // 3
            System.out.println(s[j] - s[i-1]);
        }
    }

}
