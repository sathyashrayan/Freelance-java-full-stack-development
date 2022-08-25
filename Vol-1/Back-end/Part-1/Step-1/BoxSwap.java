// Java program to swap two variables
public class BoxSwap {

	public static void main(String[] args)
	{

		int boxA = 20, boxB = 30;

		System.out.println("Before Swap");
		System.out.println("boxA = " + boxA);
		System.out.println("boxB = " + boxB);

		int boxC = boxA;
		boxA = boxB;
		boxB = boxC;

		System.out.println("After Swap");
		System.out.println("boxA = " + boxA);
		System.out.println("boxB = " + boxB);
	}
}
