import java.lang.*;
public class Cricketer 
{
    private String name;
    private int age;
    private String team;
    private int matches;

    public Cricketer()
	{
		 System.out.println("Empty Constructor");	
	}

    public Cricketer(String name, int age, String team, int matches) 
	{
         setName(name);
         setAge(age);
         setTeam(team);
		 setMatches(matches);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public int getMatches() {
        return matches;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
        System.out.println("Matches: " + matches);
    }
}
