import java.lang.*;
public class Teacher
{
	private String name;
	private int  id;
	private double salary;
	
	public Teacher()
	{
		
	}
	public Teacher(String name,int id,double salary)
	{
		setName(name);
		setId(id);
		setSalary(salary);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(double salary)
	{
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void display()
	{
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher ID:"+id);
		System.out.println("Teacher monthly salary:"+salary);
	}
	public void yearlySalary()
	{
		System.out.println("Teacher yearly Salary:"+(salary*12));
	}
	public void YearlySalaryWithBonus()
	{
		double bonus=2*(salary*0.5);
		double TotalSalary=(salary*12)+bonus;
		System.out.println("Teacher yearly Salary with bonus:"+TotalSalary);
	}
}