public class PrintService {
    public void print(Person [] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }


    public void print(Customer [] customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void print(Gamer [] gamers) {
        for (Person gamer : gamers) {
            System.out.println(gamer);
        }
    }

}
