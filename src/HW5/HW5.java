package HW5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class HW5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Kim Irina", "Seller", "123@gmail.com", "85972549634",15000,50);
        empCorp[1] = new Employee("Sever Katerina", "Babysitter", "123@mail.ru", "89875429631",60000,49);
        empCorp[2] = new Employee("Bikanova Svetlana", "Teacher", "123@yandex.com", "89875326911",40000,37);
        empCorp[3] = new Employee("Eremeeva Anastasia", "Engineer", "123@bk.ru", "89541026210",10000,18);
        empCorp[4] = new Employee("Medvedev Mikhail", "Driver", "123@yahoo.com", "89875263900",13000,65);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
