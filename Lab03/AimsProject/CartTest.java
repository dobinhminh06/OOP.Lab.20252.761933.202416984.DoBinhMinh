package Lab03.AimsProject;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
        "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
        "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 
        "Animation", 18.99);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        System.out.println("\nSearching for DVD with ID 1:");
        cart.searchById(1);

        System.out.println("\nSearching for DVD with ID 5:");
        cart.searchById(5);

        System.out.println("\nSearching for DVD with title 'Aladdin':");
        cart.searchByTitle("Aladdin");

        System.out.println("\nSearching for DVD with title 'Frozen':");
        cart.searchByTitle("Frozen");
    }
}