package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    GradeService gradeService;
    StubGradeSystem stubGradeSystem;

    @BeforeEach
    public void setUp() {
        stubGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        List<Double> testValue = Arrays.asList(80.0, 90.0, 100.0);
        stubGradeSystem.setStubGrade(testValue);
        assertEquals(90.0, gradeService.calculateAverageGrades(1L));
    }
}
