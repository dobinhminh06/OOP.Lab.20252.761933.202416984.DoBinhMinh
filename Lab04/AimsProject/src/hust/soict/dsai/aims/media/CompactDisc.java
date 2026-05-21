package Lab04.AimsProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public CompactDisc(String title) {
        super(title);
    }
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track t){
        if(tracks.contains(t)){
            System.out.println("Da ton tai bai hat trong dia: " + t.getTitle());
        }
        else{
            tracks.add(t);
            System.out.println("Da them bai hat: " + t.getTitle());
        }
    }
    public void removeTrack(Track t){
        if(!tracks.contains(t)){
            System.out.println("Bai hat khong ton tai trong dia nay: " + t.getTitle());
        }
        else{
            tracks.remove(t);
        }
        
        /*for(int i = tracks.size() - 1; i >= 0; i--){
            if(((tracks.get(i)).getTitle()).equals(t.getTitle()) && t.getLength() == (tracks.get(i)).getLength()){
                tracks.remove(tracks.get(i));
            }
        }*/
    }
    public int getLength(){
        int sum = 0;
        for(Track t : tracks){
            sum += t.getLength();
        }
        this.setLength(sum);
        return sum;
    }
    @Override
    public void play(){
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for(Track t : tracks){
            t.play();
        }
        System.out.println("End of CD: "+ this.getTitle());
    }
}
