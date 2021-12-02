package chapter10_2;

public class CourseGradedemo {

	public static void main(String[] args) {
		GradedActivity Lab1 = new GradedActivity();
         Lab1.setScore(85);
         PassFailExam PassFailExam1 = new PassFailExam(12, 4, 90);
         Essay Essay1 = new Essay();
         Essay1.setScore(32,12,15,20);
         FinalExam FinalExam1 = new FinalExam(50, 10);
         CourseGrades crsGrds = new CourseGrades();
         crsGrds.setLab(Lab1);
         crsGrds.setPassFailExam(PassFailExam1);
         crsGrds.setEssay(Essay1);
         crsGrds.setFinalExam(FinalExam1);
         System.out.println(crsGrds);
	}

}
