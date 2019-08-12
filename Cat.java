package GBTheme4oopRazbor;

public class Cat extends Animal {
    public Cat(String name) {
        super("Кот  "+name);
        this.runLimit=200;
        jumpLimit=2;
    }

    public void swim(int distance){
        System.err.println("Кот "+this.name+" плавать не умеет! ");
    }
}
