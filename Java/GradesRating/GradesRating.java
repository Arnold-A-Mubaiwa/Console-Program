import java.util.Scanner;

class GradesRating{
	static void finalAverage(){
		Scanner scan = new Scanner(System.in);
		int students, grades;
		String name;
		int average;
		int mark;
		int totalmark = 0;

		System.out.print("Enter The Number Of Students : ");
		students =scan.nextInt();
		System.out.print("Enter The Number Of Grades Per Student To Be Recorded : ");
		grades = scan.nextInt();
		System.out.println();

		for(int numberOfStudents =1;numberOfStudents<=students;numberOfStudents++){
			System.out.print("---------------------------------------------------------------\n");
			System.out.print("Enter Student Name : ");
			name = scan.next();
			// System.out.print(name);
			for (int x=0;x<1 ;x++ ) {
				for(int numberOfGrades =1; numberOfGrades<=grades;numberOfGrades++){
				System.out.print("Enter Grade "+numberOfGrades+" : ");
				mark = scan.nextInt();
				if (validateGrades(mark)==true) {
					totalmark += mark;
				}else{
					System.out.print("Enter Grade "+numberOfGrades+" : ");
				mark = scan.nextInt();
				if(validateGrades(mark)==true){
					totalmark +=mark;
				}
				}
				
			}
			average = (totalmark/grades);
			System.out.println();
			System.out.println("AVERAGE : "+ average);
			totalmark=0;
			}
			System.out.println();
		}
	}
	static boolean validateGrades(int mark){
		if (mark>=0 && mark<=100) {
			return true;
		}else{
			System.out.println("The Grade Value Should be less than 100 and greater than 0");
			return false;
		}
	}
	 public static void main(String[] args) {
	 		finalAverage();
	}
	}
	
