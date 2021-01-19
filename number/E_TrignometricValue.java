import java.util.*;
class E_TrignometricValue
{
	public static void main(String[] args)
	{
		double d = 90;
		double d_radian = Math.toRadians(d);
		double sine = Math.sin(d_radian);
		double cosine = Math.cos(d_radian);
		double tangent = Math.tan(d_radian);

		double cosec = (1/sine);
		double sece = (1/cosine);
		double cote = (1/tangent);

		System.out.println("sin("+d+") = "+sine);
		System.out.println("cos("+d+") = "+cosine);
		System.out.println("tan("+d+") = "+tangent);
		System.out.println("cosec("+d+") = "+cosec);
		System.out.println("sec("+d+") = "+sece);
		System.out.println("cot("+d+") = "+cote);
	}
}