package 二十三丶面向对象基本特征;

public class Penguin extends Pet{
    private boolean Sex;
    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public void print(){
        System.out.println(getName() + "\t" + getHealth() + "\t" + getLove() + "\t" + this.Sex);
    }
}
