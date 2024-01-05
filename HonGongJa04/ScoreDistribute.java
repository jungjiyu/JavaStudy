package seq01.score_distribute;

public class ScoreDistribute {

	public static void main(String[] args) {
		//최대한 간결하게 성적 매기기
		
		int score = 69;
		if(score >= 90) {
			System.out.println("점수>=90");
			System.out.println("등급:A");
		}
		
		else if(score >= 80) {
			System.out.println("90>점수>=80");
			System.out.println("등급:b");
		}
		else if(score >= 50) {
			System.out.println("80>점수>=50");
			System.out.println("등급:c");
		}
		else {
			System.out.println("50>점수");
			System.out.println("등급:F");
		}
	}
}