import java.lang.*;
public class Bowler extends Cricketer {
    private int totalWkts;
    private int ballsBowled;
    private int runsConceded;

    public Bowler()
	{
		System.out.println("Empty Constructor");
	}

    public Bowler(String name, int age, String team, int matches, int totalWkts, int ballsBowled, int runsConceded) 
	{
        super(name, age, team, matches);
        this.totalWkts = totalWkts;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public void setTotalWkts(int totalWkts) {
        this.totalWkts = totalWkts;
    }

    public void setBallsBowled(int ballsBowled) {
        this.ballsBowled = ballsBowled;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded = runsConceded;
    }

    public int getTotalWkts() {
        return totalWkts;
    }

    public int getBallsBowled() {
        return ballsBowled;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public double avgWkt() {
        return (double) totalWkts / getMatches();
    }

    public double economyRate() {
        return (double) runsConceded * 6 / ballsBowled;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Wickets: " + totalWkts);
        System.out.println("Balls Bowled: " + ballsBowled);
        System.out.println("Runs Conceded: " + runsConceded);
        System.out.println("Bowling Average: " + avgWkt());
        System.out.println("Economy Rate: " + economyRate());
    }
}
