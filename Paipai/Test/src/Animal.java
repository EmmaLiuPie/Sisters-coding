public class Animal {
    public void move(){
        System.out.println("Animal move!");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cat move!");
    }
    public void catMouse(){
        System.out.println("cat catch mouse!");
    }

}

class Eagle extends Cat{
    @Override
    public void move() {
        System.out.println("Eagle move!");
    }
}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Birl move");
    }
}