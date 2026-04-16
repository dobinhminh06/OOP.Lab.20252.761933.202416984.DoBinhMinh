package Lab03.AimsProject;

public class Cart {
    private DigitalVideoDisc[] items = new DigitalVideoDisc[20]; 
    private int qtyOrdered = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            items[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more DVDs.");
        }
    }

    // public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
    //     for(DigitalVideoDisc disc : dvdList){
    //         addDigitalVideoDisc(disc);
    //     }
    // }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
        for(DigitalVideoDisc disc: dvdList){
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1); 
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += items[i].getCost();
        }
        return total;
    }

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++){
            System.out.println((i + 1) + ". " + items[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].getId() == id) {
                System.out.println("Found: " + items[i].toString());
                matchFound = true;
                break;
            }
        }
        if (!matchFound) {
            System.out.println("No match found for ID: " + id);
        }
    }

    public void searchByTitle(String title){
        boolean matchFound = false;
        for(int i = 0; i < qtyOrdered; i++){
            if(items[i].isMatch(title)){
                System.out.println("Found: " + items[i].toString());
                matchFound = true;
            }
        }
        if(!matchFound){
            System.out.println("No match found for title: \" + title)");
        }
    }
}

