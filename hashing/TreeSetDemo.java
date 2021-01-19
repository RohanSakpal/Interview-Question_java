import java.util.*;
class TreeSetDemo
{
	public static void main(String[] args)
	{	
		MyComparator comparator = new MyComparator();
		TreeSet<Student> ts = new TreeSet<Student>(comparator);
		ts.add(new Student(1,"rohan",78));
		ts.add(new Student(2,"rohit",57));
		ts.add(new Student(3,"vrutik",67));
		ts.add(new Student(4,"sachin",88));
		ts.add(new Student(5, "Peter", 83));
		ts.add(new Student(4,"rohan",98));
		ts.add(new Student(6,"dekok",56));
		ts.add(new Student(7,"virat",99));
		ts.add(new Student(7,"lynn",78));

		Iterator<Student> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

class Student
{
	int rn,mark;
	String name;
	public Student(int rn, String name , int mark)
	{
		this.rn = rn;
		this.name = name;
		this.mark = mark;
	}
	public String toString()
	{
		return rn+","+name+","+mark;
	}
}

class MyComparator implements Comparator<Student>
{
	public int compare(Student s1 , Student s2)
	{
		if(s1.rn == s2.rn)
			return 0;
		else
		{
			return s2.mark - s1.mark;
		}
	}
}