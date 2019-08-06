import java.util.ArrayList;

public class AlbumTest{
    public static void main(String[] agrs){
        Album ourSickNewRecord = new Album();
        ourSickNewRecord.addTracks("Crotch Rock", "YEEEOOWWWW! Crotch-Rocking, every day! Crotch-Rocking, every night!");
        ourSickNewRecord.addTracks("Hey Jude", "NA... Na... Na... Na Na Na NA");
        ourSickNewRecord.addTracks("Music", "I like music! it's great! music music music all day!");
        ourSickNewRecord.addTracks("Binary", "0000111001010110001010111000000110001011000001111101010010101001");
        System.out.println(ourSickNewRecord.lyrics("Binary"));
        ArrayList<String> tracksAndLyrics = ourSickNewRecord.tracksWithLyrics();
        for(String track : tracksAndLyrics){
            System.out.println(track);
        }
    }

}