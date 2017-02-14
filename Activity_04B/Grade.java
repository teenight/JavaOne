/**
 * The grade.
 *
 * Project_04B.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/13/2017
 */
public class Grade {
/**
 * Grade.
 * @param args Commandline arguments - not used.
 */
   // Instance variables.
   private double exam1, exam2, finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private String studentName;
   /**
    * Constants.
    */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   /**
    * Constructor.
    * @param studentNameIn the input student name.
    */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
   /**
    * Methods.
    * @param activityAvgIn the input activity score.
    * @param quizAvgIn the input quiz score.
    */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   /**
    * @param projectAvgIn the input average project score.
    */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
   /**
    * @param examType the exam type.
    * @param examScoreIn the exam score.
    */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
   /**
    * @return the calculated grade.
    */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
                     + finalExam * FINAL_WEIGHT
                     + activityAvg * ACT_WEIGHT
                     + quizAvg * QUIZ_WEIGHT
                     + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /**
    * @return the string to be printed out.
    */
   public String toString() {
      return "Name: " + studentName + "\n"
            + "Course Grade: " + calculateGrade();
   }
}