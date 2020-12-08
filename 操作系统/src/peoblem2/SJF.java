package peoblem2;


import java.util.Scanner;

public class SJF {
    public static void main(String[] args) {
//        定义程序所需变量以及数组
        int i = 0;
        double min = 10000;
        int j = 0;
        int number;
        double total = 0;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入进程数！");
        number = sc.nextInt();
        double[] at = new double[number];    //到达时间
        double[] bt = new double[number];    //服务时间
        int[] flag = new int[number];        //判断是否到达标志
        double[] completeTime = new double[number];   //完成时间


//        计算周转时间等值所需的数组与变量
        double[] arr = new double[number];
        double[] ser = new double[number];
        double[] zz = new double[number];
        double[] dqzz = new double[number];
        double pjzz = 0;
        double pjdqzz = 0;
        double c = 0;
        double d = 0;
        System.out.println("请输入到达时间！");
        for (i = 0; i < number; i++) {
            at[i] = sc.nextInt();
            flag[i] = 0;
        }
        System.out.println("请输入服务时间！");
        for (i = 0; i < number; i++) {
            bt[i] = sc.nextInt();
        }


//        确定第一个到达的进程
        for (i = 0; i < number; i++) {
            if (at[i] < min) {
                min = at[i];
                j = i;
            }
        }
        total = at[j] + bt[j];
        completeTime[j] = total;
        i = j;
        arr[i] = at[i];
        ser[i] = bt[i];
        bt[i] = 10000;
        at[i] = 10000;
        min = 10000;

//        第一个进程已经确定，循环n-1次即可
        for (a = 0; a < number - 1; a++) {
//            判断上一个进程结束后已经到达的进程
            for (i = 0; i < number; i++) {
                if (flag[i] == 0) {
                    if (at[i] < total)
                        flag[i] = 1;
                    else flag[i] = 0;
                }
            }


//            加上已到达的最短进程
            for (i = 0; i < number; i++) {
                if (flag[i] == 1) {
                    if (bt[i] < min) {
                        min = bt[i];
                        j = i;
                    }
                }
            }
            i = j;
            total = total + bt[j];
            completeTime[j] = total;
            arr[i] = at[i];
            ser[i] = bt[i];
            bt[i] = 10000;
            min = 10000;
        }

//        输出计算的值
        System.out.println("到达时间\t服务时间\t完成时间\t周转时间\t带权周转时间");
        for (i = 0; i < number; i++) {
            zz[i] = completeTime[i] - arr[i];
            dqzz[i] = zz[i]/ser[i];
            System.out.println(arr[i]+"\t\t"+ser[i]+"\t\t"+completeTime[i]+"      "+zz[i]+"      "+dqzz[i]);
        }
        for (i = 0; i < number; i++) {
            c = c + zz[i];
            d = d + dqzz[i];
            pjzz = c/number;
            pjdqzz = d/number;
        }
        System.out.println("平均周转时间为："+pjzz);
        System.out.println("平均带权周转时间为："+pjdqzz);
        }
    }





