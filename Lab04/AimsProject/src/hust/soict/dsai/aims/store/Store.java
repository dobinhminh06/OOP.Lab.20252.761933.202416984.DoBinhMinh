package Lab04.AimsProject.src.hust.soict.dsai.aims.store;

import Lab04.AimsProject.src.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList; //
import java.util.List;
public class Store {
    private static final int MAX_NUMBER_ITEMS = 40;
    private List<Media> itemsInStore = new ArrayList<Media>();
    public int numberItems = 0;
    public Store(){

    }

    public void addMedia(Media d){
        if(numberItems < MAX_NUMBER_ITEMS){
            itemsInStore.add(d);
            numberItems++;
            System.out.println("The media has been added: " + d.getTitle());
        }
        else{
            System.out.println("The store is almost full");
        }
    }
    // Tìm kiếm Media theo tên (trả về đối tượng)
    public Media searchByTitle(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
    public void removeMediabyTitle(String title){
        boolean found = false;
        for(Media m : itemsInStore){
            if(m.getTitle().equals(title)){
                itemsInStore.remove(m);
                numberItems--;
                System.out.println("The media has been removed: " + m.getTitle());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Media not found in store.");
        }
    }
    public void printStore(){
        System.out.println("*******************************STIORE******************************");
        System.out.println("Ordered items: ");
        for(Media d : itemsInStore){
            System.out.println(d.toString());
        }
        System.out.println("*******************************************************************");
    }
}
