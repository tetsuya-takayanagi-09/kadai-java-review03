package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;


    public BaseBallTeam() {

    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate(int win, int lose){
        return (double)win / (win + lose);
    }

    public void report() {
        int win = this.getWin();
        int lose = this.getLose();
        int draw = this.getDraw();
        System.out.printf(
                "%sの2022年の成績は %d勝 %d敗 %d分、勝率は%fです。%n",
                this.getName(),
                win,
                lose,
                draw,
                this.getRate(win, lose)
                );
    }
}
