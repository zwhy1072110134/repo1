package 二十四丶接口.Door;

import 二十四丶接口.Door.Door;
import 二十四丶接口.Door.Lock;

//java是单继承、多实现的，也就是可以实现多个接口   即implements A,B,C  实现的多个接口之间用","隔开
public  class TheftProofDoor extends Door implements Lock {
    @Override
    void openDoor() {
        System.out.println("开门");
    }

    @Override
    void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }

    @Override
    public void closeLock() {
        System.out.println("关锁");
    }
}
