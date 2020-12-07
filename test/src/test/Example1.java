package test;


import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
        ArrayList stu = new ArrayList();
        stu.add("韩文豪");
        stu.add("kissshot");
        stu.add("894");
        System.out.println("学生总数为"+stu.size());
        System.out.println("第二个学生为"+stu.get(1));
        stu.remove(1);
        System.out.println(stu);
        stu.set(0,"kissshot");
        System.out.println(stu);
        Iterator iterator = stu.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
