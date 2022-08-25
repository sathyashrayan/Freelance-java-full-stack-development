// Java program to swap two variables without temp var add / sub
public class BoxSwapAddSub {
	public static void main(String[] args)
	{
		int boxA = 20, boxB = 30;
        boxA = boxA + boxB;
        boxB = boxA - boxB;
        boxA = boxA - boxB;
        System.out.println("After swapping:"
                           + " boxA = " + boxA + ", boxB = " + boxB);
	}
}
