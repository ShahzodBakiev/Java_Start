import java.util.Scanner;

public class student {
    private static int counter = 0;
    private int id;
    private String name;
    private String lastName;
    private String login;
    private String password;
    private String email;

    // Конструктор без параметров
    public student() {
        this.id = ++counter;
        this.name = "";
        this.lastName = "";
        this.login = "";
        this.password = "";
        this.email = "";
    }

    // Конструктор с параметрами
    public student(int id, String name, String lastName, String login, String password, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        counter = Math.max(counter, id);
    }

    // Конструктор с частичными параметрами
    public student(String name, String lastName, String login, String password, String email) {
        this.id = ++counter;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // Метод для вывода информации о студенте
    public void info() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать символ новой строки после ввода числа

        for (int i = 0; i < n; i++) {
            System.out.println("\nВведите данные для студента " + (i + 1) + ":");

            System.out.print("Имя: ");
            String name = scanner.nextLine();

            System.out.print("Фамилия: ");
            String lastName = scanner.nextLine();

            System.out.print("Логин: ");
            String login = scanner.nextLine();

            System.out.print("Пароль: ");
            String password = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            student student = new student(name, lastName, login, password, email);
            System.out.println("Информация о студенте " + (i + 1) + ":");
            student.info();
        }
        scanner.close();
    }
}
