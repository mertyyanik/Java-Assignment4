public class S extends GameGrid implements IGameTime {
    private int vertical;
    private int horizontal;
    int counting;

    public S(int vertical,int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
        gameTime();
    }

    public S(IGameTime iGameTime) {
        counting += iGameTime.counting();
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    @Override
    public void gameTime() {
        readText();

    }

    @Override
    public int counting() {
        return 1;
    }

}
