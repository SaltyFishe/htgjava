package src.test1;

public class GameTest {
    public static void main(String[] args) {
        //player1
        Role r1 = new Role("黄天戈",100);
        //player2
        Role r2 = new Role("个天皇",100);
        //start
        while (true){
            //r1攻击r2
            r1.attack(r2);
            //判断r2剩余血量
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "击败了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "击败了" +r1.getName());
                break;
            }
        }

    }
}
