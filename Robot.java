package tutorial;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Robot {
	/*
	 * 1. BLOCK를 전부 받아서 이중배열에 저장한다.
	 * 2. BLOCK의 원소를 전부 읽으면서 A,B,C에 따라 행동을 달리한다. 
	 * 3. 읽기 편하게 하기 위해서 BLOCK의 S인것과 아닌것만 구분해보자.
	 */
	
	static int N;
	static int[][] is_S;
	static char[][] block;
	
	
	static int[][] is_S(){
		int len = block[0].length;
		int[][] spaces = new int[len][len];
		for (int i=0;i<len;i++) {
			for (int j=0;j<len;j++) {
				if (block[i][j] == 'S') {
					spaces[i][j] = 1;
				}
			}
		}
		return spaces;
	}
	
	static int Count_A(int j, int k) {
		int count = 0;
		for (int x=k+1;x<N;x++) {
			if (is_S[j][x] == 0) break;
			count ++;
		}
		return count;
	}
	
	static int Count_B(int j, int k) {
		int count = Count_A(j,k);
		for (int x=k-1;x>=0;x--) {
			if (is_S[j][x] == 0) break;
			count ++;
		}
		return count;
	}
	
	static int Count_C(int j, int k) {
		int count = Count_B(j,k);
		for (int x=j-1;x>=0;x--) {
			if (is_S[x][k] == 0) break;
			count ++;
		}
		for (int x=j+1;x<N;x++) {
			if (is_S[x][k] == 0) break;
			count ++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int i=0;i<T;i++) {
			N  = Integer.parseInt(bf.readLine());
			block = new char[N][N];
			int count = 0;
			for (int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				for (int k=0;k<N;k++) {
					block[j][k] = st.nextToken().charAt(0);
				}
			}
			is_S = is_S();
			for (int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					switch(block[j][k]) {
					case 'A':
						count += Count_A(j,k);
						System.out.println(Count_A(j,k));
						break;
					case 'B':
						count += Count_B(j,k);
						System.out.println(Count_B(j,k));
						break;
					case 'C':
						count += Count_C(j,k);
						System.out.println(Count_C(j,k));
						break;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+count);
		}
	}
}
