package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pointer2 {



    public static void main(String[] args) {

        BufferdReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.ParseInt(bf.readLine());
        int m = Integer.ParseInt(bf.readLine());


        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(a);

        int count = 0;
        int i=0, j=n-1;
        while(i<j) {
            if(a[i]+a[j]<m) i++;
            else if(a[i] + a[j]>m) j--;
            else {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }

}
