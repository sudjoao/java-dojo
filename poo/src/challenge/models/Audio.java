package challenge.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Audio  implements  Playable {
    protected final String title;
    protected final int durationInSeconds;
    protected final String genre;
    protected final LocalDate releaseDate;
    protected int playCount;
    protected final List<Double> rating;

    public Audio(LocalDate releaseDate, String genre, int durationInSeconds, String title) {
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.durationInSeconds = durationInSeconds;
        this.title = title;
        this.rating = new ArrayList<>();
    }

    public int getPlayCount() {
        return playCount;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public void addRate(double rate){
        if(rate < 0.0 || rate > 5.0){
            System.out.println("Invalid rate");
            return;
        }
        rating.add(rate);
    }

    public double getRateAverage(){
        return rating.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public void increasePlayCount(){
        playCount++;
    }

    @Override
    public void play() {
        increasePlayCount();
    }

    @Override
    public String toString() {
        return "%s - %s".formatted(title, releaseDate);
    }
}
