import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Cтепанова", "Ольга", "Николаевна", 1, 200000);
        employees[1] = new Employee("Светлова", "Олеся", "Никаноровна", 1, 100000);
        employees[2] = new Employee("Антонова", "Ирина", "Николаевна", 2, 20000);
        employees[3] = new Employee("Кузьмин", "Владимир", "Сергеевич", 2, 50000);
        employees[4] = new Employee("Санова", "Маргарита", "Владимировна", 3, 120000);
        employees[5] = new Employee("Фролов", "Павел", "Николаевич", 3, 40000);
        employees[6] = new Employee("Кусков", "Сергей", "Дмитриевич", 4, 70000);
        employees[7] = new Employee("Капустина", "Светлана", "Николаевна", 4, 75000);
        employees[8] = new Employee("Cтулов", "Олег", "Васильевич", 4, 80000);
        employees[9] = new Employee("Карпушкин", "Дмитрий", "Михайлович", 5, 90000);

        System.out.println("Список сотрудников:");
        printEmployees(employees);
        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц " + sumSalary(employees) + " рублей");
        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой : " + minSalaryEmoloyee(employees));
        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой : " + maxSalaryEmoloyee(employees));
        System.out.println();

        System.out.println("Среднее значение зарплат " + ovgSalary(employees) + " рублей");
        System.out.println();

        printFios(employees);
        System.out.println();
    }

    private static void printEmployees(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
        }
    }

    private static int sumSalary(Employee[] e) {
        int sum = 0;
        for (int i = 0; i < e.length; i++) {
            sum = sum + e[i].getSalary();
        }
        return sum;
    }

    private static Employee minSalaryEmoloyee(Employee[] e) {
        int minSalary = Integer.MAX_VALUE;
        Employee employee = null;

        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() < minSalary) {
                minSalary = e[i].getSalary();
                employee = e[i];
            }
        }
        return employee;
    }

    private static Employee maxSalaryEmoloyee(Employee[] e) {
        int maxSalary = 0;
        Employee employee = null;

        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() > maxSalary) {
                maxSalary = e[i].getSalary();
                employee = e[i];
            }
        }
        return employee;
    }

    private static int ovgSalary(Employee[] e) {
        return sumSalary(e) / e.length;
    }

    private static void printFios(Employee[] e) {
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].getSurname() + " " + e[i].getName() + " " + e[i].getPatronymic());
        }
    }

}



