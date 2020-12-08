package problem1;

import java.util.Scanner;

class Process{
    int empty = 1;
    int full = 0;
    int mutex = 1;
    int n = 1000;
    String control;
    public Process(String S) {
        control = S;
    }
    public void Judge(){

        if(this.control.equals("in") && empty!=1) {
            this.empty ++;
            this.full --;
        }
        else if(this.control.equals("in") && empty == 1)
            System.out.println("无法生产进程");

        if(this.control.equals("out") && full!=0) {
            this.empty --;
            this.full ++;
        }
        else if(this.control.equals("out") && full == 0)
            System.out.println("无法消费进程");
    }
}
public class Proceducer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入操作：'in'表示生产者，'out'表示消费者");
        String control = sc.next();
        Process p1 = new Process(control);
        p1.Judge();
        System.out.println("执行操作后进程剩余资源数为"+p1.empty+"占用进程为"+p1.full);
    }
}
