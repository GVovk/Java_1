public class HW2{
    public static void main(String[] args) {
        System.out.println(within10and20(2, 5));
        isPositiveOrNegative(-6);
        System.out.println(isNegative(-17));
        printWordNTimes("Example", 3);
    }
//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean within10and20(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

//2. Написать метод, которому в качестве параметра передается целое число, метод должен
//напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
//считаем положительным числом.
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен
//вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        else {
            return false;
        }
    }

//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
//отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordNTimes(String str, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}
