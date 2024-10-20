package src.面向对象综合案例;

public class Test {
    public static void main(String[] args) {
        //1、创建角色
        Role r1 = new Role("小华", 100, '男');
        Role r2 = new Role("小明", 100, '男');
        //展示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();

        //3、开始格斗，回合制游戏
        while (true) {
            //r1开始攻击r2
            r1.attack(r2); //attack:攻击
            //判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getNname() + "K.O" + r2.getNname());
                break;
            }
            //r2攻击r1
            r2.attack(r1);
            if (r2.getBlood() == 0) {
                System.out.println(r2.getNname() + "K.O" + r1.getNname());
                break;
            }
        }
    }
}
