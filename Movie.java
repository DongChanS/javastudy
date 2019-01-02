package tutorial;

public class Movie {
	
	/* <pre>
	 * 회원 정보(Data)와 기능을 구현한 클래스
	 * </pre>
	 * 
	 * @author 홍길동
	 * @version
	 * @see
	 */
	
	String title,director,genre,summary;
	int grade;
	
	Movie(String title,String director,String genre,String summary,int grade){
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.summary = summary;
		this.grade = grade;
	}
	
	private void movieInfo() {
		System.out.println(this.title);
		// ....
	}
	
}
