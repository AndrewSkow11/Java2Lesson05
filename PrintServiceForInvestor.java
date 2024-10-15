// непосредственный предок у класса может быть только один
// а реализовывать интерфейсов он может сколько угодно



public class PrintServiceForInvestor implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("\nРаспечатка Person");

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println();
    }


    @Override
    public void print(Customer[] customers) {
        System.out.println("\nРаспечатка Customer");

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println();

    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("\nРаспечатка Gamer");

        for (Person gamer : gamers) {
            System.out.println(gamer);
        }

        System.out.println();

    }

}
