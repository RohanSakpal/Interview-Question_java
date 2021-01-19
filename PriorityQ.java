import java.util.*;
class PriorityQ
{
	public static void main(String[] args)
	{
		MyComparator comparator = new MyComparator();
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>(7, comparator);
		pq.offer(new Employee("aaa",15000));
		pq.offer(new Employee("bbb",9000));
		pq.offer(new Employee("ccc",18000));
		pq.offer(new Employee("ddd",16000));
		pq.offer(new Employee("eee",19000));
		pq.offer(new Employee("fff",11000));
		pq.offer(new Employee("ggg",17000));

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}

class Employee
{
	String name;
	int sal;
	Employee(String name , int sal)
	{
		this.name = name;
		this.sal = sal;
	}
	public String toString()
	{
		return name+" : "+sal;
	}
}
class MyComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.sal - e2.sal; //this for assending and e2-e1 is decending.
	}
}