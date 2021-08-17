package v3;

import java.util.Date;

public class MainBuilderClass {
    public static void main(String[] args) {
        Employee emp = new Employee.Builder()
                .setName("Вася")
                .setBirthday(new Date())
                .setProfession("Tester")
                .build();
        System.out.println(emp);
    }
}
