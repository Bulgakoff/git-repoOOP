package GBTheme4oopRazbor;

public class MainAnimals {
    public static void main(String[] args) {
        Animal[] animalsArray = new Animal[4];
        animalsArray[0]=new Cat("Барсик ");
        animalsArray[1]=new Dog("Трезор ");
        animalsArray[2]=new SuperCat("вАСЬКА ",350,3);
        animalsArray[3]=new SuperDog("Полкаша ");

        for (Animal pointEl:animalsArray){
            System.out.println();
            pointEl.run(450);
            pointEl.jump(0.5);
            pointEl.swim(5);

        }
    }
}
