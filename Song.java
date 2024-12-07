public class Song {
  private String title;
  private String artist;
  private String album;
  private int year;
  
  public Song(String title, String artist, String album, int year) {
      this.title = title;
      this.artist = artist;
      this.album = album;
      this.year = year;
  }

  
  // SETTERS
  public void setTitle(String title) {
      this.title = title;
  }
  public void setArtist(String artist) {
      this.artist = artist;
}
  public void setAlbum(String album) {
      this.album = album;
  }
  public void setYear(int year) {
      this.year = year;
  }
  
  
  // GETTERS
  public String getTitle() {
      return this.title;
  }
  public String getArtist() {
      return this.artist;
  }
  public String getAlbum() {
      return this.album;
  }
  public int getYear() {
      return this.year;
  }
  
  
  // TO STRING
  public String toString() {
      if (album.equals("Non-album single")) {
          return "Artist: " + artist + "\nTitle: " + title + "\n" + album + "\n";
      }
      else {
          return "Artist: " + artist + "\nTitle: " + title + "\nAlbum: " + album + "\n";
      }
  }
  
}