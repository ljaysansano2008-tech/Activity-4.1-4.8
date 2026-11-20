public class DevideEvenly {
	
	public static void main(String[] args) {
		final int NUMBER = 100;
		int val;
		
		System.out.println(NUMBER + " is evenly divisible by ");
		for (val = 1; val <= NUMBER; ++val)
		{
			if(NUMBER % val == 0)
				System.out.println(val + " ");
		}
		System.out.println();
	}
}
