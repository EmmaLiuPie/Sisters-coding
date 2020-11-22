import java.util.ArrayList;


//    军队
class Army {
    private int weaponCount = 0;
    private ArrayList<Weapon> w = new ArrayList<Weapon>();

    Army(int weaponCount) {
        this.weaponCount = weaponCount;
    }

    public void logInfo(String log) {
        System.out.println(log);
    }

    public void addWeapon(Weapon wa) {
        if (w.size() == this.weaponCount) {
            logInfo("添加武器「" + wa.weaponName + "」失败" + " 武器数量已抵达上限");
            return;
        }
        w.add(wa);
    }

    void allAttack() {
        for (int i = 0; i < w.size(); i++) {
            Weapon wp = w.get(i);
            if (wp.canAttack) {
                wp.attack();
            }
        }
    }

    void allMove() {
        for (int i = 0; i < w.size(); i++) {
            Weapon wp = w.get(i);
            if (wp.canMove) {
                wp.move();
            }
        }
    }


    public void report() {
        logInfo("## 当前军队共有武器数量:" + this.weaponCount + " 个");
        String weaponDetail = "## 武器明细为:";
        for (int i = 0; i < w.size(); i++) {
            weaponDetail += w.get(i).weaponName + ";";
        }
        logInfo(weaponDetail);
    }
}

//    武器基类
class Weapon {
    protected String weaponName;

    protected boolean canMove;
    protected boolean canAttack;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    Weapon(String weaponName) {
        this.weaponName = weaponName;
        logInfo("一个" + (weaponName != "" ? weaponName + "" : ""));
    }

    protected void attack() {
    }

    protected void move() {
    }

    public void logInfo(String log) {
        System.out.println(log);
    }
}

// 手枪
class Gun extends Weapon {

    Gun(String weaponName) {
        super(weaponName);
        super.setCanMove(true);
        super.setCanAttack(true);
    }

    public void attack() {
        super.attack();
        logInfo(weaponName + " attack");
    }

    public void move() {
        super.move();
        logInfo(weaponName + " move");
    }
}

//大炮
class Cannon extends Weapon {

    Cannon(String weaponName) {
        super(weaponName);
        super.setCanMove(false);
        super.setCanAttack(true);
    }

    public void attack() {
        logInfo(weaponName + " attack");
    }
}

public class ArmyTest {
    public static void main(String[] args) {
        buildArmy();
    }

    private static void buildArmy() {
        final int weaponLimit = 10;
        Army army = new Army(weaponLimit);

        for (int i = 0; i < 50; i++) {
            Weapon gun = new Gun("手枪 No." + i);
            Weapon cannon = new Cannon("大炮 No." + i);

            army.addWeapon(gun);
            army.addWeapon(cannon);
        }

        army.report();

        army.allAttack();
        army.allMove();
    }


}
