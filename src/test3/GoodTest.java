package src.test3;

public class GoodTest {
    public static void main(String[] args) {
        //1、创建一个数组
        Goods[] arr = new Goods[3];
        //2、创建三个商品对象
        Goods g1 = new Goods("001","vivos15",3999.0,100);
        Goods g2 = new Goods("001","mi13",5999.0,100);
        Goods g3 = new Goods("001","mi9",1999.0,100);
        //3、把商品添加入数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //4、遍历
        for (int i = 0;i< arr.length;i++){
            Goods goods =arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice()
            + "," + goods.getCount());
        }
    }
}
