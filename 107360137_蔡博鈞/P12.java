import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("輸入整數");
	
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num==1)
		{
			System.out.println("輸入的是1");
		}
		else if(num==2)
		{
			System.out.println("輸入的是2");
		}
		else
		{
				System.out.println("輸入的是1或2");
		}
		
	

	}

}
