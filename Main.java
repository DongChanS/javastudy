package tutorial;
import tutorial.MyLotto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<20;i++) {
			int[] lo = new int[6];
			MyLotto lotto = new MyLotto(lo);
			lotto.selectLotto();
			lotto.print();	
		}
	}

}
