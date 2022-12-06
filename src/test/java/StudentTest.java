import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void studentClassMethodTest(){
        ArrayList<Integer> testArrayList = new ArrayList<>();
        Student Isaiah = new Student("Isaiah", 1);
        Assert.assertTrue(Isaiah.getName() == "Isaiah");
        Assert.assertTrue(Isaiah.getId() == 1);
        Assert.assertEquals(testArrayList.size(), Isaiah.getGrades().size());
        Isaiah.addGrade(90);
        Isaiah.addGrade(95);
        Isaiah.addGrade(100);
        Assert.assertTrue(Isaiah.getGradeAverage() == 95);
    }
}
