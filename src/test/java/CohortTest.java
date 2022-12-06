import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CohortTest {

    @Test
    public void checkStudentAddToCohort(){

        Cohort testCohort = new Cohort();
        Student Isaiah = new Student("Isaiah", 1);
        testCohort.addStudent(Isaiah);
        Assert.assertEquals("Isaiah", testCohort.getStudents().get(0).getName());
        Student Abe = new Student("Abe", 2);
        testCohort.addStudent(Abe);
        Assert.assertEquals(2, testCohort.getStudents().size());
        Isaiah.addGrade(90);
        Abe.addGrade(100);
        Assert.assertEquals(95, testCohort.getCohortAverage(), 0);
    }
}
