package baseball;

public class Review03 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        BaseBallTeam[] baseBallTeams = new BaseBallTeam[6];
        baseBallTeams[0] = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        baseBallTeams[1] = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        baseBallTeams[2] = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        baseBallTeams[3] = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        baseBallTeams[4] = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        baseBallTeams[5] = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        for (BaseBallTeam baseBallTeam: baseBallTeams) {
            baseBallTeam.report();
        }

    }

}
