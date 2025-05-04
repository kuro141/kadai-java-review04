package baseball;

public class BaseBallTeam {
	private String name;
	private int win;
	private int lose;
	private int draw;

	public BaseBallTeam(String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}

	public double getRate() {
		double rate = (double) win / (win + lose);
		return rate;
	}

	public void report() {
		System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
	}
}