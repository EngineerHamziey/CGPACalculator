import java.util.Scanner;//import the scanner utility


public class App {
  static Scanner scannerInput = new Scanner(System.in);//add the static keyword to make the scannerInput available to all functions 
  public static Student student1 = new Student();

  static String contOrStop = "";
  static boolean 
      runApp = true,
      keepAddingCourse = true;
  static int currentCourseIndex = 0;//static makes it available to all fuctions
      
  
  // static String[] offeredCourses = new String[20];

  // public static void addNewCourse() {}

  private static void runTheApp() {
    addNewStudent();
    addAllCoursesTaken();
  }

  private static void addAllCoursesTaken() {
    System.out.println("Hello Mr/Mrs " + student1.name + ", let's add all courses you have taken this semester");


    while (keepAddingCourse) {
      // how to display a table in java console, I want my final output to look similar to our school results
      addNewCourse();

      // ask if student is done adding courses
      areYouDoneAddingCourse();
      }
      //save the total number of courses registered
      student1.totalCoursesRegistered = currentCourseIndex - 1;//subtracting the one used 

      // sum up the qualityPoint and sum up the creditUnit

      for (int count = 0; count < student1.totalCoursesRegistered; count++){
        student1.totalCreditUnit += student1.courseCreditUnits[count];
        student1.totalQualityPoint += student1.qualityPointQP[count];
      }
      // compute the GPA
      student1.computedCGPA = student1.totalQualityPoint / student1.totalCreditUnit;
      System.out.println("Congrats " + student1.name + ", your GPA for this semester is " + student1.computedCGPA);
  }

  private static void areYouDoneAddingCourse() {
    // Prompt user to keep adding course or stop adding course
    System.out.println("Press A to another Course or E to stop adding courses ");
    contOrStop = scannerInput.nextLine();
    System.out.println("contOrStop == " + contOrStop);
    keepAddingCourse = (contOrStop.equals("e") || contOrStop.equals("E")) ? false : true;
  }

  private static void addNewStudent() {
    doTheIntro();
    System.out.println("What's your name?");
    student1.name = scannerInput.nextLine();
  }

  private static void addNewCourse() {
    System.out.println("\nEnter the course code?");
    // add course title
    student1.courses[currentCourseIndex] = scannerInput.nextLine();
    int courseCount = currentCourseIndex +1;
    System.out.println("Course " + courseCount +" is " + student1.courses[currentCourseIndex]);
    
    // prompt course credit unit(CU) for the course
    System.out.println("How many unit was course " + student1.courses[currentCourseIndex] + "?");
    student1.courseCreditUnits[currentCourseIndex] = scannerInput.nextInt();
    
    // prompt Student score(%) in the course
    System.out.println("what was your score(in percentage) in the course?");
    student1.scorePercentage[currentCourseIndex] = scannerInput.nextInt();
    

    // determine letter grade of the student's score in the course(A, B, C, etc)
    determineGradeLetterAndPoint();
    // determine the corresponding quality point(QP = CU * GP) for each course
    determineQualityPoint();
    currentCourseIndex++;

    scannerInput.nextLine();  // to Consume newline left-over to fix the scanner.nextLine() not working
  }

  private static void determineQualityPoint() {
    System.out.println("Determine the quality point");
    student1.qualityPointQP[currentCourseIndex] = (student1.gradePoint[currentCourseIndex]) * (student1.courseCreditUnits[currentCourseIndex]);
  }

  private static void determineGradeLetterAndPoint() {
    System.out.println("determine grade point and letter");
    // determine and store the grade point and grade letter
    if (student1.scorePercentage[currentCourseIndex] >= 70) {
      student1.letterGrade[currentCourseIndex] = 'A';
      student1.gradePoint[currentCourseIndex] = 5;
    }else if (student1.scorePercentage[currentCourseIndex] >= 60) {
      student1.letterGrade[currentCourseIndex] = 'B';
      student1.gradePoint[currentCourseIndex] = 4;   
    }else if (student1.scorePercentage[currentCourseIndex] >= 50) {
      student1.letterGrade[currentCourseIndex] = 'C';  
      student1.gradePoint[currentCourseIndex] = 3;    
    }else if (student1.scorePercentage[currentCourseIndex] >= 45) {
      student1.letterGrade[currentCourseIndex] = 'D';      
      student1.gradePoint[currentCourseIndex] = 2;
    }else if (student1.scorePercentage[currentCourseIndex] >= 40) {
      student1.letterGrade[currentCourseIndex] = 'E';    
      student1.gradePoint[currentCourseIndex] = 1;  
    }else {
      student1.letterGrade[currentCourseIndex] = 'F';  
      student1.gradePoint[currentCourseIndex] = 0;    
    }
    System.out.println("The grade Letter for this course is " + student1.letterGrade[currentCourseIndex]);
  }

  private static void doTheIntro() {
    System.out.println(
      "\nHello there, This code is written By Lawal Hamzat Ademola 201934\n\n"
    );
  }

  private static void askUserToCloseAppOrContinue() {
    System.out.println("press \"X\" to cancel or \"C\" to continue");            
    String response = scannerInput.nextLine();
    runApp = (response.equals("X") || response.equals("x")) ? false : true;
  }
  public static void main(String[] args) {//find out throw Exception meaning
      
    
    while (runApp) {//keep running the app while the runApp variable is true
      runTheApp();

      // prompt user to close app or continue running app
      askUserToCloseAppOrContinue();
      //print out all object at once, I'll now override this toString method in my Student.class
      // System.out.println(student1.toString());
      doTheIntro();
    }

    // scannerInput.close();//close when app stops
  }
}
