package person;

public class Main {

    public static void main(String[] args) {
        EmployeeBuilder pb = new EmployeeBuilder();
        Person shivi = pb
            .withName("Shivi")
            .worksAt("Developer")
            .build();

        System.out.println(shivi);
    }
}
