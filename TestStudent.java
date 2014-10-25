
public class TestStudent {
	
	public static void printBook(Student[] s){
		System.out.printf("%s       %s       %s       %s      %s       %s \n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
		System.out.println("---------------------------------------------------------------");
		for(int i = 0; i < s.length; i++){
			if(s[i] == null){
				i++;
			}else{
				System.out.printf("%-14s %6d %8d %8d %7d %8d \n", s[i].getName()+":", s[i].getQuiz(1), s[i].getQuiz(2), s[i].getQuiz(3), s[i].getQuiz(4), s[i].getQuiz(5));
			}
		}
	}
	
	public static void replaceName(Student[] s, String name, String newName){
		for(int i = 0; i < s.length; i++){
			if(s[i] == null){
				i++;
			}else if(s[i].getName().equalsIgnoreCase(name)){
				s[i] = new Student(newName, s[i].getQuiz(1), s[i].getQuiz(2), s[i].getQuiz(3), s[i].getQuiz(4), s[i].getQuiz(5));
			}
		}
	}
	
	//I added a param for the student name because without it, multiple students' quiz grades would be changed 
	//and I don't think that is correct
	public static void replaceQuiz(Student[] s, String name, int quizNumber, int newQuiz){
		for(int i = 0; i < s.length; i++){
			if(s[i] == null){
				i++;
			}else if(s[i].getName().equalsIgnoreCase(name)){
				s[i].setQuiz(quizNumber, newQuiz);
			}
		}
	}
	
	public static void replaceStudent(Student[] s, String name, String newName, int qz1, int qz2, int qz3, int qz4, int qz5){
		for(int i = 0; i < s.length; i++){
			if(s[i] == null){
				i++;
			}else if(s[i].getName().equalsIgnoreCase(name)){
				s[i] = new Student(newName, qz1, qz2, qz3, qz4, qz5);
			}
		}
	}
	
	public static void insertStudent(Student[] s, String name, String newName, int qz1, int qz2, int qz3, int qz4, int qz5){
		for(int i = 0; i < s.length; i++){
			if(s[i] == null){
				i++;
			}else if(s[i].getName().equalsIgnoreCase(name)){
				for(int e = s.length - 1; e > i; e--){
					s[e] = s[e - 1];
				}
				s[i] = new Student(newName, qz1, qz2, qz3, qz4, qz5);
				i = s.length - 1;
			}
		}
	}
	
	public static void deleteStudent(Student[] s, String name){
		for(int i = 0; i < s.length; i++){
			if(s[i] == null){
				i++;
			}else if(s[i].getName().equalsIgnoreCase(name)){
				for(int e = i; e < s.length - 1; e++){
					s[e] = s[e + 1];
				}
				s[s.length - 1] = null;
			}
		}
	}
	
	public static void main(String[] args){
		
		Student[] myClass = new Student[5];
		
		myClass[0] = new Student("Mark Kennedy", 70, 80, 90, 100, 90);
		myClass[1] = new Student("Max Gerard", 80, 85, 90, 85, 80);
		myClass[2] = new Student("Jean Smith", 50, 79, 89, 99, 100);
		myClass[3] = new Student("Betty Farm", 85, 80, 85, 88, 89);
		myClass[4] = new Student("Dilbert Gamma", 70, 70, 90, 70, 80);
		
		printBook(myClass);
		
		System.out.println();
		System.out.println("Changing Betty's name to Betty Boop:");
		System.out.println();
		
		replaceName(myClass, "Betty Farm", "Betty Boop");
		printBook(myClass);
		
		System.out.println();
		System.out.println("Changing Jean's quiz 1 score to 80:");
		System.out.println();
		
		replaceQuiz(myClass, "Jean Smith", 1, 80);
		printBook(myClass);
		
		System.out.println();
		System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90:");
		System.out.println();
		
		replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
		printBook(myClass);
		
		System.out.println();
		System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100 before Betty:");
		System.out.println();
		
		insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
		printBook(myClass);
		
		System.out.println();
		System.out.println("Deleting Max Gerard:");
		System.out.println();
		
		deleteStudent(myClass, "Max Gerard");
		printBook(myClass);
		
	}
}
