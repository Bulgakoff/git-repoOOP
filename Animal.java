package GBTheme4oopRazbor;

public abstract class Animal {
    protected String name;

    protected int runLimit = 0;
    protected double jumpLimit = 0;//доступны только для унаследованных классов
    protected int swimLimit = 0;


    public Animal() {
        this.name = "По умолчанию, без имени ";
    }

    public Animal(String name) {//конструктор с возможностью передачи имени
        this.name = name;
    }

    public void run(int distance) {
        if (runLimit > 0 && distance <= runLimit) {
            System.out.println(this.name + "пробежал " + distance + " метров ");
        } else {
            System.err.println(this.name + "не сможет пробежать  " + distance + " метров! ");
        }
    }

    public void swim(int distance) {
        if (swimLimit > 0 && distance <= swimLimit) {
            System.out.println(this.name + "проплыл " + distance + " метров ");
        }else {
            System.err.println(this.name + "не сможет проплыть  " + distance + " метров! ");
        }
    }
    public void jump (double height) {
        if (jumpLimit > 0 && height <= jumpLimit) {
            System.out.println(this.name + "прыгнул на " + height + " метров ");
        }else {
            System.err.println(this.name + "не сможет прыгнуть на  " + height + " метров! ");
        }
    }


}
