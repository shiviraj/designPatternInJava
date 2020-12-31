package pattern.design.solid.dip;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John");
        Person chris = new Person("Chris");
        Person matt = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(john, chris);
        relationships.addParentAndChild(john, matt);

        new Research(relationships);

    }
}
