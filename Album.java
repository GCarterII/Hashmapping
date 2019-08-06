import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Album{
    public HashMap<String, String> albumMap = new HashMap<String, String>();
    public void addTracks(String title, String lyrics){
        albumMap.put(title, lyrics);
    }
    public String lyrics(String title){
        return this.albumMap.get(title);
    }
    public Set<String> trackList(){
        Set<String> tracks = this.albumMap.keySet();
        return tracks;
    }
    public ArrayList<String> tracksWithLyrics(){
        ArrayList<String> output = new ArrayList<>();
        Set<String> titles = trackList();
        for(String title : titles){
            output.add(title + ": " + this.albumMap.get(title));
        }
        return output;
    }
}