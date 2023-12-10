package Week10.LabCode.Exercise4;
//uporediti!
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Song {

    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre){
        this.title=title;
        this.artist=artist;
        this.genre=genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }
    public String toString() {
        return "Song: " + this.title;
    }
}

class GenreFilterIterator implements Iterator<Song>{
    private ArrayList<Song> playlist = new ArrayList<>();;
    private String targetGenre;
    private int currentIndex;


    public GenreFilterIterator(ArrayList<Song> playlist, String targetGenre){
        this.playlist=playlist;
        this.targetGenre=targetGenre;
        this.currentIndex=0;
    }

    @Override
    public boolean hasNext(){
        while(currentIndex< playlist.size() && !playlist.get(currentIndex).getGenre().equals(targetGenre)){
            currentIndex++;
        }
        return currentIndex<playlist.size();
    }

    @Override
    public Song next(){
        if(!hasNext()){
            throw new NoSuchElementException("No more songs with the target genre");
        }
        return playlist.get(currentIndex++);
    }
}

class PlaylistExample {
    public static void main(String[] args) {
        // Create a playlist of songs
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", "Pop"));
        playlist.add(new Song("Song2", "Artist2", "Rock"));
        playlist.add(new Song("Song3", "Artist3", "Pop"));
        playlist.add(new Song("Song4", "Artist4", "Jazz"));
        playlist.add(new Song("Song5", "Artist5", "Rock"));

        // Create an instance of GenreFilterIterator
        String targetGenre = "Jazz";
        GenreFilterIterator iterator = new GenreFilterIterator(playlist, targetGenre);

        // Use the iterator to print the details of songs with the target genre
        System.out.println("Songs with genre '" + targetGenre + "':");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
        }
    }
}
