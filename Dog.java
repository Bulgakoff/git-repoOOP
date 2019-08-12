package GBTheme4oopRazbor;

public class Dog extends Animal {
    public Dog(String name){
        super("Пес "+name);
        runLimit=500;
        jumpLimit=0.5;
        swimLimit=10;
    }
}
