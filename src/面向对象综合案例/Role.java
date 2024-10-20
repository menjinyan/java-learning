package src.面向对象综合案例;

import java.util.Random;

public class Role {

    //需求：格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候，（new对象的时候），这些信息就应该被确定下来。
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的
    String[] boyfaces = {"玉树临风", "风流倜傥", "五官端正", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "闭月羞花", "亭亭玉立"};

    //attack 攻击描述:
    String[] attack_desc = {
            "%使出了一招【背心打】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的问%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    //injured 受伤描述
    String[] injured_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果「轰」的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
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
        Random R = new Random();
        //长相是随机的
        if (gender == '男') {
            //从Boy里面随机长相
            int index = R.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            //从Girl里面随机长相
            int index = R.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
        this.face = face;
    }

    public Role() {

    }

    public String getNname() {
        return name;
    }

    public void setNname(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定有一个方法用于攻击别人
    //那么谁攻击谁？
    //创建角色对象:
    //Role r1 = new Role();
    //Role r2 = new Role ();
    //r1攻击r2=r1.攻击(r2);也就是方法的调用者去攻击参数
    public void attack(Role role) {
        Random R = new Random();
        int index = R.nextInt(attack_desc.length);
        String KungFu = attack_desc[index];
        //输出一个攻击的效果
        System.out.printf(KungFu, this.getNname(), role.getNname());
        System.out.println();
        //计算造成的伤害:1~100
        int hurt = R.nextInt(100) + 1;

        //那个被打的人剩余的血量
        int remainBoold = role.getBlood() - hurt;
        //对剩余的血量做一个验证,如果为负数就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改被打的人的血量
        role.setBlood(remainBoold);
        //受伤的描述
        //血量>90索引的描述
        //80~90 1索引的描述
        //70~80 2索引的描述
        //60~70 3索引的描述
        //40~60 4索引的描述
        //20~40 5索引的描述
        //10~20 6索引的描述
        //小于10的 7索引的描述
        if (remainBoold > 90) {
            System.out.printf(injured_desc[0], role.getNname());
        } else if (remainBoold > 80 && remainBoold <= 90) {
            System.out.printf(injured_desc[1], role.getNname());
        } else if (remainBoold > 70 && remainBoold <= 80) {
            System.out.printf(injured_desc[2], role.getNname());
        } else if (remainBoold > 60 && remainBoold <= 70) {
            System.out.printf(injured_desc[3], role.getNname());
        } else if (remainBoold > 40 && remainBoold <= 60) {
            System.out.printf(injured_desc[4], role.getNname());
        } else if (remainBoold > 20 && remainBoold <= 40) {
            System.out.printf(injured_desc[5], role.getNname());
        } else if (remainBoold > 10 && remainBoold <= 20) {
            System.out.printf(injured_desc[6], role.getNname());
        } else {
            System.out.printf(injured_desc[7], role.getNname());
        }
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为:" + getNname());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getGender());
        System.out.println("性别为:" + getFace());
    }
}


