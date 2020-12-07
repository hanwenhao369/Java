package test;
public class sss {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s =new String("白日依山尽，黄河入海流，欲穷千里目，更上一层楼。");
        String s3=new String("ABCD");
        String s4=new String("abcd");
        System.out.println("“日”这个字在诗中第一次出现的位置："+s.indexOf("日"));//
        System.out.println("“黄”这个字在诗中最后一次出现的位置："+s.lastIndexOf("黄"));//
        System.out.println("黄河这个词在诗中出现的第一次的位置："+s.indexOf("黄河"));//
        System.out.println("“千里”这个词在诗中最后一次出现的位置："+s.lastIndexOf("千里"));//
        System.out.println("输出诗中8位置的字符:"+s.charAt(6));//
        System.out.println("字符串的长度："+s.length());//
        System.out.println("判断字符串是否以“。”结束："+s.endsWith("。"));//
        System.out.println("这首诗是否以“明”开头："+s.startsWith("明"));
        System.out.println("s3转换为小写："+s3.toLowerCase());
        System.out.println("s4转换为大写："+s4.toUpperCase());
        System.out.println("将这首诗中的“日”换成“月”："+s.replace("日", "月"));
    }

}
