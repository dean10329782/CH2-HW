import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("請問選擇哪條路線");
		System.out.println("輸入整數");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		 
		char ans=(num ==1)? 'A' : 'B';
			System.out.println("選擇了"+ans+"路線");
	}

}
