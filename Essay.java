package chapter10_2;

public class Essay extends GradedActivity {
private double grammar;
private double spelling;
private double correctLength;
private double content;

public void setScore(double gr, double sp,double len,double cnt) {
	grammar=gr;
	spelling=sp;
	correctLength=len;
	content=cnt;
	
}
	private void setgrammar(double g) {
		grammar=g;
	}
	private void setspelling(double s) {
		spelling=s;
	}
	private void setcorrectLength(double l) {
		correctLength=l;
		
	}
	private void setcontent(double c) {
		content=c;
	}
	public double getgrammar() {
		return grammar;
	}
	public double getspelling() {
		return spelling;
	}
	public double getcorrectLength() {
		return correctLength;
	}
	public double getcontent() {
		return content;
}
}