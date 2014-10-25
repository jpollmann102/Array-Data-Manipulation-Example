
public class Student {
	
	private String myName;
	private int qz1, qz2, qz3, qz4, qz5;
	
	public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5){
		myName = name;
		qz1 = quiz1;
		qz2 = quiz2;
		qz3 = quiz3;
		qz4 = quiz4;
		qz5 = quiz5;
	}
	
	public String getName(){
		return myName;
	}
	
	public int getQuiz(int quizNumber){
		if(quizNumber == 1){
			return qz1;
		}else if(quizNumber == 2){
			return qz2;
		}else if(quizNumber == 3){
			return qz3;
		}else if(quizNumber == 4){
			return qz4;
		}else if(quizNumber == 5){
			return qz5;
		}else return -1;
	}
	
	public void setQuiz(int quizNumber, int newQuiz){
		if(quizNumber == 1){
			qz1 = newQuiz;
		}else if(quizNumber == 2){
			qz2 = newQuiz;
		}else if(quizNumber == 3){
			qz3 = newQuiz;
		}else if(quizNumber == 4){
			qz4 = newQuiz;
		}else if(quizNumber == 5){
			qz5 = newQuiz;
		}
	}
	
	public String toString(){
		return  myName + ":     " + qz1 + "     " + qz2 + "     " + qz3 + "     " + qz4 + "     " + qz5;
	}
}
