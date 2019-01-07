import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GameGrid {
    private ArrayList<String[]> gameGridArray= new ArrayList<>();

    public ArrayList<String[]> getGameGridArray() {
        return gameGridArray;
    }

    public void setGameGridArray(ArrayList<String[]> gameGridArray) {
        this.gameGridArray = gameGridArray;
    }

    public void readText() {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("gameGrid.txt")))) {
            gameGridArray.clear();
            while (sc.hasNextLine()) {
                String bilgiler = sc.nextLine().trim();
                gameGridArray.add(bilgiler.split(" "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
