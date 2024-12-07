import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("top100streams.txt");
        Scanner text = new Scanner(file);
        String title;
        String artist;
        String album;
        int x = 1;

        System.out.println("Top streams of 2016:");
        while (text.hasNextLine()) {
            String line = text.nextLine();
            
            int titlePos = line.indexOf("|")+1;
            int artistPos = line.indexOf("|", titlePos)+1;
            int albumPos = line.indexOf("|", artistPos)+1;
            int somethingPos = line.indexOf("|", albumPos)+1;
            int year = Integer.valueOf(line.substring(line.length()-4));

            if (year == 2016) {
                System.out.println("#" + x);
                title = line.substring(titlePos, artistPos-1);
                artist = line.substring(artistPos, albumPos-1);
                year = Integer.valueOf(line.substring(line.length()-4));

                if (line.substring(albumPos, somethingPos-1).equals("none")) {
                    album = "Non-album single";
                }
                else {
                    album = line.substring(albumPos, somethingPos-1);
                }
                Song music = new Song(title, artist, album, year);
                System.out.println(music.toString());
                x++;
           }

        }
        
    }
}