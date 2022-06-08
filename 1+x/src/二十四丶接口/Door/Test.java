package 二十四丶接口.Door;

public class Test {
    public static void main(String[] args) {
        TheftProofDoor door = new TheftProofDoor();
        door.openLock();
        door.openDoor();
        door.closeDoor();
        door.closeLock();
    }
}
