package src.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"神", "帅", "中", "捞", "丑"};
    String[] girlfaces = {"1", "2", "3", "4", "5"};

    //attack 攻击描述:
    String[] attack_docs = {
            "%s用了黄昏，对%s发起了攻击",
            "%s用了真银斩，对%s发起了攻击",
            "%s用了真金斩，对%s发起了攻击"
    };

    //injured 受伤描述:
    String[] injured_docs = {
            "%s平角裤！平角裤！",
            "%s被攻击了!很痛",
            "%s被锤烂了！死了！",
    };


    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相随机且根据男女不同数组不同
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "丑比";
        }
        this.face = face;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法攻击
    //方法的调用者去攻击参数
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attack_docs.length);
        String gongji = attack_docs[index];
        System.out.printf(gongji, this.getName(), role.getName());
        System.out.println();
        //计算造成的伤害1~20
        int hurt = r.nextInt(20) + 1;
        //挨打的人的血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量进行验证，如果为负数就改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改挨揍人的血量
        role.setBlood(remainBlood);
        //受伤描述
        //血量>90 0索引描述
        if (remainBlood > 90) {
            System.out.printf(injured_docs[0], role.getName());
        } else if (remainBlood > 60) {
            System.out.printf(injured_docs[1], role.getName());
        } else if (remainBlood == 0) {
            System.out.printf(injured_docs[2], role.getName());
        }
        System.out.println();

    }

    public void showRoleInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("长相为：" + getFace());
        System.out.println("性别为：" + getGender());
    }

}
