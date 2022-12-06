import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int length = this.grades.size();
        long sum = 0;
        for (long grade : this.grades){
            sum += grade;
        }
        return (sum/length);
    }
}
