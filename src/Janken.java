import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Janken {
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("コンピュータとじゃんけんをします。");
		System.out.println("グーならG、チョキならC、パーならPと入力してください。");

		String player = br.readLine();
		int r = new java.util.Random().nextInt(2);

		if(player.equals("G") || player.equals("g")){
			if(r == 0){
				System.out.println("コンピュータはグーを出した！");
				System.out.println("引き分け！");
			}

			else if(r == 1){
				System.out.println("コンピュータはチョキを出した！");
				System.out.println("あなたの勝ち！");
			}

			else if(r == 2){
				System.out.println("コンピュータはパーを出した！");
				System.out.println("あなたの負け！");
			}
		}

		else if(player.equals("C") || player.equals("c")){
			if(r == 0){
				System.out.println("コンピュータはグーを出した！");
				System.out.println("あなたの負け！");
			}

			else if(r == 1){
				System.out.println("コンピュータはチョキを出した！");
				System.out.println("引き分け！");
			}

			else if(r == 2){
				System.out.println("コンピュータはパーを出した！");
				System.out.println("あなたの勝ち！");
			}
		}

		else if(player.equals("P") || player.equals("p")){
			if(r == 0){
				System.out.println("コンピュータはグーを出した！");
				System.out.println("あなたの勝ち！");
			}

			else if(r == 1){
				System.out.println("コンピュータはチョキを出した！");
				System.out.println("あなたの負け");
			}

			else if(r == 2){
				System.out.println("コンピュータはパーを出した！");
				System.out.println("引き分け！");
			}
		}
		else{
			System.out.println("G,C,P以外は入力しないでください。");
		}


	}


}
