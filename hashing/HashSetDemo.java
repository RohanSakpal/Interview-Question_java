import java.util.*;
class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(1,"rohan","civil"));
		hs.add(new Student(2,"rohit","elec"));
		hs.add(new Student(3,"ram","Managment"));
		hs.add(new Student(4,"vrutik","comp"));
		hs.add(new Student(5,"sachin","sport"));
		hs.add(new Student(6,"virat","sport"));
		hs.add(new Student(4,"umesh","bowler"));
		hs.add(new Student(6,"gayle","civil"));

		Iterator<Student> it = hs.iterator();
		while(it.hasNext())
		{
			Student student = (Student)it.next();
			System.out.println(student);
		}
	}
}

class Student
{
	int rn;
	String name,depa;
	Student(int rn , String name , String depa)
	{
		this.rn = rn;
		this.name = name;
		this.depa = depa;
	}
	public int hashCode()
	{	
		return rn;
	}
	public boolean equals(Object o)	
	{
		Student student = (Student)o;
		return (rn == student.rn);
	}
	public String toString()
	{
		return rn +","+name+","+depa;
	}
}