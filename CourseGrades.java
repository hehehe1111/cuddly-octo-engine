package chapter10_2;

public class CourseGrades {
private GradedActivity[]grades;
private static int ng=4;

public CourseGrades() {
	grades= new GradedActivity[ng];
}
public void setLab(GradedActivity Lab1) {
	grades[0]= Lab1;
}
public void setPassFailExam(PassFailExam PassFailExam1) {
	grades[1]= PassFailExam1;
}
public void setEssay(Essay Essay1)
{
    grades[2] = Essay1;
}
public void setFinalExam(FinalExam FinalExam1)
{
    grades[3] = FinalExam1;
}
public String toString()
{
    String result = "";
   
    result = "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade()
            + "\nPass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
            + "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade()
            + "\nFilan Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();
    
    return result;
}



}
