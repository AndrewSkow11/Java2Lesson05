public class Customer extends Person {
    private int cardNumber;

    public Customer(String name, int age, int phoneNumber, int cardNumber) {
        super(name, age, phoneNumber);
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", номер карты: " + cardNumber;
    }
}
