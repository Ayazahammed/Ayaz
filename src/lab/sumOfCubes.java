package lab;

public class sumOfCubes {
	public static int SumOfTheCubes(int n)
	{
		int x=(n*(n+1)/2);
		return x*x;
	}

	public static void main(String[] args) {
	int n=5;
	System.out.println(SumOfTheCubes(n));

	}

}