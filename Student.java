import java.lang.*;
public class Student
{
	private String name;
	private int  id;
	private double cgpa;
	public Student()
	{
		
	}
	public Student(String name,int id,double cgpa)
	{
		setName(name);
		setId(id);
		setCgpa(cgpa);
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
	public void setCgpa(double cgpa)
	{
		if(cgpa>=0 && cgpa<=4)
		{
			this.cgpa = cgpa;
		}
		else
		{
			System.out.println("Invalid CGPA");
		}
	}
	
	public double getcgpa()
	{
		return cgpa;
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("Id="+id);
		System.out.println("CGPA="+cgpa);
	}
	public void checkScholarship()
	{
		if(cgpa>=3.75)
		{
			System.out.println("Eligible for Scholarship");
		}
		else
		{
			System.out.println("Not Eligible for Scholarship");
		}
	}
}