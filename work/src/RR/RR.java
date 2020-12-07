//package RR;
//
//import java.util.Scanner;
//
//public class RR {
//    public static void main(String[] args) {
//        int time;
//        int number;
//        int i = 0;
//        double min = 10000;
//        int j = 0;
//        double total = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入时间片");
//        time = sc.nextInt();
//        System.out.println("请输入进程数");
//        number = sc.nextInt();
//        double[] at = new double[number];
//        double[] bt = new double[number];
//        int[] flag = new int[number];
//        double[] completeTime = new double[number];
//        double[] arr = new double[number];
//        double[] ser = new double[number];
//        double[] line = new double[100];
//        System.out.println("请输入到达时间！");
//        for (i = 0; i < number; i++) {
//            at[i] = sc.nextInt();
//            flag[i] = 0;
//        }
//        System.out.println("请输入服务时间！");
//        for (i = 0; i < number; i++) {
//            bt[i] = sc.nextInt();
//        }
//        for (i = 0; i < number; i++) {
//            if (at[i] < min) {
//                min = at[i];
//                j = i;
//            }
//        }
//
////        先找到第一个要服务的进程
////        如果第一个进程的时间大于时间片，则将它放在line队列的第一个
//        if(at[j]>time){
//            total = at[j] + bt[j] - time;
//            line[0] = bt[j] - time;
//        }
//        else total = at[j] +bt[j];
////            判断上一个进程结束后已经到达的进程
//        for (i = 0; i < number; i++) {
////            if (flag[i] == 0) {
//                if (at[i] < total)
//
////                    flag[i] = 1;
//                else flag[i] = 0;
////            }
//        }
//    }
//}
