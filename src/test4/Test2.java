package src.test4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入两套体系不能混用
        //先用nextInt，再用nextline会导致下面的nextline接受不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);
    }
}
