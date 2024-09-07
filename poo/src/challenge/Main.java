package challenge;

import java.util.Scanner;

public class Main {
    public static final int OPTIONS_SIZE = 6;

    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != OPTIONS_SIZE) {
            showMenu();
            option = scanner.nextInt();

            while (!validateMenuOption(option)) {
                System.out.println("Invalid option");
                showMenu();
                option = scanner.nextInt();
            }

            menuOptionHandler(option, scanner, player);
        }

        System.out.println("Thank you for using FySpot! See you next time.");
    }

    private static void showMenu() {
        System.out.println("\nWelcome to FySpot, what do you want to do today?");
        System.out.println("1. See the available audios");
        System.out.println("2. Listen to a specific audio");
        System.out.println("3. Listen to a random audio");
        System.out.println("4. Check the status of a Song/Podcast");
        System.out.println("5. Rate an Song/Podcast");
        System.out.println("6. Leave");
        System.out.print("Choose an option: ");
    }

    private static boolean validateMenuOption(int option) {
        return option > 0 && option <= OPTIONS_SIZE;
    }

    private static void menuOptionHandler(int option, Scanner scanner, Player player) {
        switch (option) {
            case 1:
                handleShowAudios(player);
                break;
            case 2:
                handlePlaySpecificAudio(scanner, player);
                break;
            case 3:
                handleRandomPlay(player);
                break;
            case 4:
                handleCheckAudioStatus(scanner, player);
                break;
            case 5:
                handleRateAudio(scanner, player);
            default:
                break;
        }
    }

    private static void handleShowAudios(Player player) {
        System.out.println("\nAvailable audios:");
        player.showAudios();
    }

    private static void handlePlaySpecificAudio(Scanner scanner, Player player) {
        System.out.println("\nAvailable audios:");
        player.showAudios();
        System.out.print("Which audio do you want to play? Enter the number: ");
        int audioOption = scanner.nextInt();
        player.playSelectedAudio(audioOption);
    }

    private static void handleRandomPlay(Player player) {
        System.out.println("\nPlaying a random audio:");
        player.randomPlay();
    }

    private static void handleCheckAudioStatus(Scanner scanner, Player player) {
        System.out.println("\nAvailable audios:");
        player.showAudios();
        System.out.print("Which audio do you want to check? Enter the number: ");
        int audioOption = scanner.nextInt();
        player.showAudioStatus(audioOption);
    }

    private static void handleRateAudio(Scanner scanner, Player player) {
        System.out.println("\nAvailable audios:");
        player.showAudios();
        System.out.print("Which audio do you want to rate? Enter the number: ");
        int audioOption = scanner.nextInt();
        System.out.print("Enter a rating (0.0 to 5.0): ");
        double rating = scanner.nextDouble();
        player.rateAudio(audioOption, rating);
        System.out.println("Thank you for your rating!");
    }
}
