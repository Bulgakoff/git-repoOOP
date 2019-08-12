package GBTheme4oopRazbor;

public class EmployeeMain {
    public static void main(String[] args) {
        Employees[] arrayOfEmployees = new Employees[5];
        arrayOfEmployees[0]=new Employees("Иванов В.И.", "Enginer1", "Иванов@bk.ru", 5648, 500, 30);
        arrayOfEmployees[1]= new Employees("Лох В.И.", "Enginer2", "Лох@bk.ru", 5648, 500, 25);
        arrayOfEmployees[2]= new Employees("Жох В.И.", "Enginer3", "Жох@bk.ru", 5648, 500, 35);
        arrayOfEmployees[3]= new Employees("Мох В.И.", "Enginer4", "Мох@bk.ru", 5648, 500, 42);
        arrayOfEmployees[4]= new Employees("Пох В.И.", "Enginer5", "Пох@bk.ru", 5648, 500, 60);

        System.out.println(arrayOfEmployees[0]);//to String
        arrayOfEmployees[0].doInfoEmployees();
    }

}
