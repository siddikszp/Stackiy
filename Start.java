public class Start {
    public static void main(String[] args) 
	{
        //Batsman objects
        Batsman batsman1 = new Batsman("Afridi", 30, "Pakistan", 100, 5000, 120, 20);
        Batsman batsman2 = new Batsman ("Smith", 28, "Australia", 80, 4000, 100, 15);

        //Bowler objects
        Bowler bowler1 = new Bowler("Bret Lee", 25, "Australia", 90, 150, 3600, 2500);
        Bowler bowler2 = new Bowler("Amir", 27, "Pakistan", 70, 120, 3000, 2200);

        // Display details for Batsmen
        batsman1.displayDetails();
        System.out.println();
        batsman2.displayDetails();
        System.out.println();

        // Display details for Bowlers
        bowler1.displayDetails();
        System.out.println();
        bowler2.displayDetails();
    }
}
