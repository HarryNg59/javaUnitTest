import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person person = new Person("HuyND", LocalDate.now().getYear());
        Boolean result = person.checkAge();
        System.out.println(result);
    }
}
