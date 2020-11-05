import java.lang.reflect.Array;

public class P40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = (int[] )Array.newInstance(int.class,3);
		
		Array.set(intArray, 0, 123);
		Array.set(intArray, 1, 321);
		Array.set(intArray, 2, 132);

			System.out.println("intArray"+Array.get(intArray, 0));
			System.out.println("intArray"+Array.get(intArray, 1));
			System.out.println("intArray"+Array.get(intArray, 2));
	}
	}

