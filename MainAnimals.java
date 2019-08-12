package GBTheme4oopRazbor;

public class MainAnimals {
    public static void main(String[] args) {
        Animal[] animalsArray = new Animal[3];
        animalsArray[0]=new Cat("Барсик ");
        animalsArray[1]=new Dog("Трезор ");
        animalsArray[2]=new SuperCat("вАСЬКА",350,3);
        for (Animal pointEl:animalsArray){
            pointEl.run(150);
            pointEl.jump(2.5);
            pointEl.swim(5);
        }
    }
}
