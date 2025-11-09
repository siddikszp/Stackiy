import java.lang.*;
public class Batsman extends Cricketer {
    private int totalRuns;
    private int innings;
    private int notOuts;

    public Batsman() 
	{
		System.out.println("Empty Constructor");	
	}

    public Batsman(String name, int age, String team, int matches, int totalRuns, int innings, int notOuts) 
	{
        super(name, age, team, matches);
        this.totalRuns = totalRuns;
        this.innings = innings;
        this.notOuts = notOuts;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public void setNotOuts(int notOuts) {
        this.notOuts = notOuts;
    }

  
    public int getTotalRuns() {
        return totalRuns;
    }

    public int getInnings() {
        return innings;
    }

    public int getNotOuts() {
        return notOuts;
    }

    public double avgRun() {
        if (innings > notOuts) {
            return (double) totalRuns / (innings - notOuts);
        }
        return 0.0;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Innings: " + innings);
        System.out.println("Not Outs: " + notOuts);
        System.out.println("Batting Average: " + avgRun());
    }
}

