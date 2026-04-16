package Lab03.AimsProject;

public class Store {
    private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[100];
    private int qtyInStore= 0;

    public void addDVD(DigitalVideoDisc dvd){
        if(qtyInStore < itemInStore.length){
            itemInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("The DVD '" + dvd.getTitle() + "' has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd){
        for(int i = 0; i < qtyInStore; i++){
            if(itemInStore[i] == dvd){
                for(int j = i; j < qtyInStore - 1; j++){
                    itemInStore[j] = itemInStore[j + 1];
                }
                itemInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                return;
            }
        }
        System.out.println("DVD \"" + dvd.getTitle() + "\" was not found in the store.");
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemInStore[i]);
            }
        }
        System.out.println("***************************************************");
    }
}


