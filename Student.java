public class Student {

  private String name;
  private int studentId;
  private double gpa;

  public String getName () {
    return name;
  }
  public int getStudentId () {
    return studentId;
  }
  public double getGpa() {
    return gpa;
  }
  public void setName (String Name) {
    this.name = ("Macy Green");
 }
  public void setStudentId(int Id) {
    this.studentId = (114331) ;
}
  public void setGpa (double Gpa) {
   this.gpa = (3.00) ;
}
  public void printStudentDetails() {
    System.out.println("Name: " + getName());
    System.out.println("Student ID: " + getStudentId());
    System.out.println("GPA: " + getGpa());
}
public static void main(String[] args) {
        Student student = new Student();
        student.setName("Macy Green");
        student.setStudentId(114331);
        student.setGpa(3.00);
}       

}
