package src.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.创建一个数组用来存三个汽车对象
        Car[] arr = new Car[3];

        //2.创建汽车对象，数据来自输入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}
