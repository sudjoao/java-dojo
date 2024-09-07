package challenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Player {
    List<Audio> audioList;

    public Player() {
        Song song1 = new Song(LocalDate.of(2020, 5, 1), "Pop", 210, "Blinding Lights", "The Weeknd", "After Hours", 1);
        Song song2 = new Song(LocalDate.of(2015, 3, 10), "Rock", 180, "Adventure of a Lifetime", "Coldplay", "A Head Full of Dreams", 5);
        Song song3 = new Song(LocalDate.of(2017, 7, 20), "Hip-Hop", 240, "HUMBLE.", "Kendrick Lamar", "DAMN.", 3);

        Podcast podcast1 = new Podcast(LocalDate.of(2021, 10, 15), "Technology", 3600, "The Future of AI", "John Doe", 1, "Tech Talk", "Jane Smith");
        Podcast podcast2 = new Podcast(LocalDate.of(2022, 1, 25), "Business", 2700, "How to Start a Business", "Sarah Lee", 2, "Business Insights", null);
        Podcast podcast3 = new Podcast(LocalDate.of(2023, 4, 7), "Science", 4200, "Exploring the Universe", "Dr. Neil", 5, "Science Today", "Dr. Carl");

        audioList = new ArrayList<>();
        audioList.add(song1);
        audioList.add(song2);
        audioList.add(song3);
        audioList.add(podcast1);
        audioList.add(podcast2);
        audioList.add(podcast3);
    }

    public void playSelectedAudio(int position) {
        if (checkInvalidPosition(position)) {
            return;
        }
        audioList.get(position).play();
    }

    public void showAudioStatus(int position) {
        if (checkInvalidPosition(position)) {
            return;
        }

        Audio audio = audioList.get(position);
        System.out.println(audio + "Average: " + audio.getRateAverage());
    }

    public void rateAudio(int position, double rate) {
        if (checkInvalidPosition(position)) {
            return;
        }
        audioList.get(position).addRate(rate);
    }

    boolean checkInvalidPosition(int position) {
        if (position < 0 || position >= audioList.size()) {
            System.out.println("Invalid option");
            return true;
        }
        return false;
    }



    public void randomPlay(){
        Random random = new Random();
        int option = random.nextInt(audioList.size());
        playSelectedAudio(option);
    }

    public void showAudios(){
        IntStream.range(0, audioList.size())
                .forEach(i -> System.out.println(i + ": " + audioList.get(i)));
    }
}
