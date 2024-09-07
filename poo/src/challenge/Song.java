package challenge;

import java.time.LocalDate;

public class Song extends Audio {
    private final String artist;
    private final String album;
    private final int trackNumber;

    public Song(LocalDate releaseDate, String genre, int durationInSeconds, String title, String artist, String album, int trackNumber) {
        super(releaseDate, genre, durationInSeconds, title);
        this.artist = artist;
        this.album = album;
        this.trackNumber = trackNumber;
    }

    @Override
    public void play() {
        super.play();
        System.out.printf("Playing the song %d - %s of the album %s from %s\n", trackNumber, getTitle(), album, artist);
    }

    @Override
    public String toString() {
        return "%s (%s) from %s".formatted(getTitle(), album, artist);
    }
}
