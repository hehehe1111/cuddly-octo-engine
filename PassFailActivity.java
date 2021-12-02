package chapter10_2;

public class PassFailActivity extends GradedActivity {
	private double minimumPassingScore;

	 public PassFailActivity(double minimumPassing)
	   {
	       minimumPassingScore = minimumPassing;
	   }
	 public char getGrade()
	   {      
	       if(super.getScore() >= minimumPassingScore)
	           return 'P';
	       else
	           return 'F';
	   }

}
