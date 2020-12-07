package test;

public class test {
    public static void main(String[] args) {
        String s = "aaa";
        String c = new String("aaa");
        String d = new String("aaa");
        String b = "aab";

        System.out.println(s==b);
        System.out.println(s==c);
        System.out.println(b==c);
        System.out.println(d==c);
    }
}
