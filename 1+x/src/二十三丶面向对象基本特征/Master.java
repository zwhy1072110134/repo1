package 二十三丶面向对象基本特征;

public class Master {
    public void feed(Pet0 pet){
        System.out.println("喂" + pet.getName());
        pet.eat();
    }
//    public void eatBird( Bird bird){
//        System.out.println("喂鸟...");
//        bird.eat();
//    }
//    public void eatCat( Cat cat){
//        System.out.println("喂猫...");
//        cat.eat();
//    }
}
