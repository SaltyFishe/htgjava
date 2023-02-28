package src.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt();接受整数
        //nextDouble();接受小数
        //next();接受字符串
        //遇到空格，\t,回车停止接受

        //第二套体系:
        //nextLine();接受字符串
        //可以接受空格\t，遇到回车停止接受


//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        int num1= sc.nextInt();
//        System.out.println(num1);
//        System.out.println("请输入第二个整数:");
//        int num2 = sc.nextInt();
//        System.out.println(num2);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        String str1= sc.next();
//        System.out.println(str1);
//        System.out.println("请输入第二个整数:");
//        String str2 = sc.next();
//        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line1 = sc.nextLine();
        System.out.println(line1);
        System.out.println("请输入第二个字符串");
        String line2 = sc.nextLine();
        System.out.println(line2);

    }
}
