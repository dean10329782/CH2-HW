
public class P49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]test;
		test = new int[2][3];
		
		test[0][0]=80;
		test[0][1]=88;
		test[0][2]=87;
		test[1][0]=68;
		test[1][1]=66;
		test[1][2]=50;
		
		for(int i=0;i<test[1].length;i++)
		{
			System.out.println("第"+(i+1)+"名的國文分數"+test[0][i]);
			System.out.println("第"+(i+1)+"名的數學分數"+test[1][i]);
		}
	}

}
