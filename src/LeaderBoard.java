import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LeaderBoard {
    private ArrayList<String[]> leaderBoardArray= new ArrayList<>();

    public ArrayList<String[]> getLeaderBoardArray() {
        return leaderBoardArray;
    }

    public void setLeaderBoardArray(ArrayList<String[]> leaderBoardArray) {
        this.leaderBoardArray = leaderBoardArray;
    }

    public void readText() {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("leaderboard.txt")))) {
            leaderBoardArray.clear();
            while (sc.hasNextLine()) {
                String bilgiler = sc.nextLine().trim();
                leaderBoardArray.add(bilgiler.split(" "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
