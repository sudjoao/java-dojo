package challenge;

import java.time.LocalDate;
import java.util.Optional;

public class Podcast extends Audio {
    private final String host;
    private final int episodeNumber;
    private final String seriesName;
    private final Optional<String> guest;

    public Podcast(LocalDate releaseDate, String genre, int durationInSeconds, String title, String host, int episodeNumber, String seriesName, String guest) {
        super(releaseDate, genre, durationInSeconds, title);
        this.host = host;
        this.episodeNumber = episodeNumber;
        this.seriesName = seriesName;
        this.guest = Optional.ofNullable(guest);
    }

    @Override
    public void play() {
        super.play();
        String guestMessage = guest.map("with the guest %s"::formatted).orElse("");
        System.out.printf("Playing the episode %d - %s of %s %s\n", episodeNumber, getTitle(), seriesName, guestMessage);
    }

    @Override
    public String toString() {
        return "Episode %d - %s from %s".formatted(episodeNumber, getTitle(), host);
    }
}
