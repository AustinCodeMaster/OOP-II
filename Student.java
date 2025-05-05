public class Student{
    private int marks;

    //add a constructor student
    public Student(int marks){
        this.marks=marks;
    }

    public String getGrade(){
        if(marks>=80){
            return "A";
        }else if(marks>=70){
            return "B";
        }else if (marks >= 60) {
            return "C";
        }else if (marks >= 50) {
        return "D";
       } else {
        return "F";
    }
}
}

