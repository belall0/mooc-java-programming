
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        // read file content
        ArrayList<String> scores = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if (row.equals("")) {
                    continue;
                }

                scores.add(row);
            }

        } catch (Exception e) {

        }

        // print how many matches a certain team play
        int cnt = 0;
        int wins = 0;
        int losses = 0;
        for (String score : scores) {
            // preparer the data
            String[] parts = score.split(",");

            String team1Name = parts[0];
            int team1Score = Integer.valueOf(parts[2]);

            String team2Name = parts[1];
            int team2Score = Integer.valueOf(parts[3]);

            // count number of matches for a team
            if (team1Name.equals(teamName)) {
                cnt++;

                // check who won
                if (team1Score > team2Score) {
                    wins++;
                } else if (team1Score < team2Score) {
                    losses++;
                }
            } else if (team2Name.equals(teamName)) {
                cnt++;

                // check who won
                if (team2Score > team1Score) {
                    wins++;
                } else if (team2Score < team1Score) {
                    losses++;
                }
            }

        }
        System.out.println("Games: " + cnt);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
