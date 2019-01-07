import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCase {
    private ArrayList<String[]> testCaseArray= new ArrayList<>();

    public ArrayList<String[]> getTestCaseArray() {
        return testCaseArray;
    }

    public void setTestCaseArray(ArrayList<String[]> testCaseArray) {
        this.testCaseArray = testCaseArray;
    }



    public void readText() {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("test_case1.txt")))) {
            testCaseArray.clear();
            while (sc.hasNextLine()) {
                String bilgiler = sc.nextLine().trim();
                testCaseArray.add(bilgiler.split(" "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void commands(){
        GameGrid gameGrid = new GameGrid();
        gameGrid.readText();
        for(String[] command : testCaseArray){
            if(command.length == 2){
                try {
                    Class.forName(gameGrid.getGameGridArray().get(Integer.parseInt(command[0]))[Integer.parseInt(command[1])])
                            .getConstructor(int.class,int.class).newInstance(Integer.parseInt(command[0]),Integer.parseInt(command[1]));
                }  catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
