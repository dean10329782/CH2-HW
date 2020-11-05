import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("輸入整數");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
	switch(num)
	{
	case 1:
	{		
		System.out.println("輸入的是1");
		break;}
	case 2:{
		System.out.println("輸入的是2");	
		break;}
	default:{
		System.out.println("輸入的是1或2");	
		break;}
		}
	}

}
