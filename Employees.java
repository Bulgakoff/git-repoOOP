package GBTheme4oopRazbor;

public class Employees {
    private String fio;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employees(String fio, String position, String email, int phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    void doInfoEmployees() {
        System.out.println(age + " - летний Сотрудник " + fio + "на должности " + position + "\nс зарплатой " + salary + " руб/день " + " номер телефона и e-mail :" + phoneNumber + "," + email);
    }
}
