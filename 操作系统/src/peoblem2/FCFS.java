package peoblem2;

import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        int i;
        int j = 0;
        double total = 0;
        double min = 1000;
        System.out.println("请输入进程数！");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[] at = new double[number];    //到达时间
        double[] bt = new double[number];    //服务时间
        System.out.println("请输入到达时间！");
        for (i = 0; i < number; i++) {
            at[i] = sc.nextInt();
        }
        System.out.println("请输入服务时间！");
        for (i = 0; i < number; i++) {
            bt[i] = sc.nextInt();
        }
//判断第一个到达的程序
            for (i = 0; i < number; i++) {
                if (at[i] < min) {
                    min = at[i];
                    j = i;
                }
            }
            total = at[j] + bt[j];
            i = j;
            at[i] = 10000;
            min = 1000;

        for(int a = 0;a < number - 1;a++) {
            for (i = 0; i < number; i++) {
                if (at[i] < min) {
                    min = at[i];
                    j = i;
                }
            }
            total += bt[j] ;
            i = j;
            at[i] = 10000;
            min = 1000;
        }
        System.out.println(total);
    }
}
