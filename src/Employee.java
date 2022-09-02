public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private int id;

    public static int counter = 1;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.id = counter;
        counter = counter + 1;

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + " Ф.И.О. " + surname + " " + name + " " + patronymic + " отдел " + department + "  зарплата " + salary + " рублей";
    }
}
