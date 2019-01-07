public class D extends GameGrid implements IGameTime {
    private int vertical;
    private int horizontal;
    int counting;

    public D(int vertical,int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
        gameTime();
    }

    public D(IGameTime iGameTime) {
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
        if(counting == 0){

        }
    }

    @Override
    public int counting() {
        return 1;
    }
}
