public class Student {
  private int maxCoursesObtainable = 25;
  int totalCoursesRegistered, totalCreditUnit, totalQualityPoint;
  String name;
  double computedCGPA;
  String courses[] = new String[maxCoursesObtainable];
  int courseCreditUnits[] = new int[maxCoursesObtainable];
  char letterGrade[] = new char[maxCoursesObtainable];
  byte gradePoint[] = new byte[maxCoursesObtainable];
  int scorePercentage[] = new int[maxCoursesObtainable];
  int qualityPointQP[] = new int[maxCoursesObtainable];

  @Override
  public String toString() {
    String returnString = name +
      " \n\t{\n\t\t Student name: " +
      name + "\n\tt Courses Offered: ";

    // name += "";
    
    return returnString;
  }
}
