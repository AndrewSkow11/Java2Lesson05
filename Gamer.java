public class Gamer extends Person{
    private String platform;

    public Gamer(String name, int age, int phoneNumber, String platform) {
        super(name, age, phoneNumber);
        this.platform = platform;
    }

    @Override
    public String toString() {
        return super.toString() + ", платформа: " + platform;
    }
}
