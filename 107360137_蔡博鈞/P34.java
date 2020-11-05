import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		System.out.println("要在第幾次結束迴圈(1~10)");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<=10;i++)
		{	if(i==num)
			continue;
			System.out.println("第"+i+"次的處理");		
	}
	}
}
