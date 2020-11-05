
public class P41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test = new int[5];
		
		test[0]=80;
		test[1]=60;
		test[2]=77;
		test[3]=82;
		test[4]=78;
		
		test[10]=78;
		for(int i=0;i<=5;i++)
		{
			System.out.println("第"+(+i)+"個人分數"+test[i]+"分");
		}
	}

}
