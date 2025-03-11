public class Student {
    public int  rollNumber;
    protected String  name;
    private double  CGPA;

    Student(){
        rollNumber=10;
        name="abc";
        CGPA=9.89;
    }

    public void getCGPA(){
        System.out.println("CGPA = "+CGPA);
    }

    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }

    public static void main(String[] args) {
        PostGraduateStudents s=new PostGraduateStudents();
        System.out.println("Printing protected member name");
        System.out.println(s.name);

        //accessing cgpa

        s.getCGPA();

        s.setCGPA(8.987);

        s.getCGPA();
    }
}

class PostGraduateStudents extends Student{


}


