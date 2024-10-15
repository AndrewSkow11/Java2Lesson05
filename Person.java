public class Person {
    private String name;
    private int age;
    private int phoneNumber;

    public Person(String name, int age, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age + ", номер телефона: " + phoneNumber;
    }
}
