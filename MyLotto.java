package tutorial;
import java.util.Random;
import java.util.Arrays;


public class MyLotto {
	int[] lo = new int[6];
	// 로또는 1부터 46까지임.
	
	public MyLotto(int[] lo) {
		this.lo = lo;
	}
	
	public void selectLotto() {
		for (int i=0; i<6; i++) {
			this.lo[i] = uniqueNumber(i);
		}
		//System.out.print(Arrays.toString(lo));
	}
	
	private int uniqueNumber(int index) {
		/*
		 * 1. 랜덤하게 숫자 생성
		 * 2. 랜덤하게 생성한 숫자와 this.lo의 원소들을 비교
		 * 3. 같은 원소가 존재하면 안되므로 다시 뽑기
		 * 4. 모두 봤는데 다르면 다시 뽑지 않아도 됨.
		 * 	 
		 */
		
		Random generator = new Random();
		int next = 0;
		boolean bool = true;
		
		while(bool){
			bool = false;
			next = generator.nextInt(46) + 1;
			for (int s : this.lo) {
				if ( s == next ) {
					bool = true;
					System.out.println("NEXT : "+next+" lo :"+Arrays.toString(this.lo));
					System.out.println("다시뽑기");
					break;
				}
			}
			break;
		}
		
		return next;
		}
	
	void print() {
		System.out.println("로또 당첨 번호는 "+Arrays.toString(this.lo));
	}
}
