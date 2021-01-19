import java.util.Random;
class I_RandomNum
{
//method1
	public static void main(String[] args)
	{
		Random rn = new Random();
		for(int i=0;i<5;i++)
		{
			System.out.println("Integer random : "+rn.nextInt());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Double random : "+rn.nextDouble());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Boolean random : "+rn.nextBoolean());
		}
	}
}


//method 2 - Using Math.random() method, you can generate only random doubles.
//method 3 - java.util.concurrent.ThreadLocalRandom class is introduced in Java 7.
//	      System.out.println("Random Integers : "+ThreadLocalRandom.current().nextInt());


