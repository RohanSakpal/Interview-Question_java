import java.util.*;
class B_SortingAl
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virat");
         	list.add("rohit");
         	list.add("Shikar");
         	list.add("ashwin");
         	list.add("ravindra");
         	list.add("Bhargav");
		System.out.println("before sort : "+list);

		Collections.sort(list);
		System.out.println("after sort: "+list);

		Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
		System.out.println("after sort but case insensitive : "+list);
	}
}

/*Defining our own Comparator
 
class OrderByPercentage implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.percentage - s2.percentage;
    }
}

Collections.sort(listOfStudents, new OrderByPercentage());

*/

/*
//Sorting the list in the reverse order
         
        Collections.sort(list, Collections.reverseOrder());
*/