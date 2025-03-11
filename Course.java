public class Course {
    //instance variables
    String CourseName;
    int duration ,fees;

    static String institutionName="ABC University";

    Course(String courseName,int duration,int fees){
        this.CourseName=courseName;
        this.duration=duration;
        this.fees=fees;
    }

    void DisplayCourseDetails(){
        System.out.println("Course Name "+CourseName);
        System.out.println("Course Duration "+duration);
        System.out.println("Course fees "+fees);
    }

    void updateInstitutionName(String newName){
        System.out.println("Name updated to "+newName);
        institutionName=newName;
    }

    public static void main(String[] args) {
        Course c1=new Course("BE CSE",4,800000);
        System.out.println("Name of the institution "+Course.institutionName);

        //updating the name of the institution

        c1.updateInstitutionName("New Name");
        System.out.println("Name of the institution "+Course.institutionName);

        c1.DisplayCourseDetails();
    }
}
