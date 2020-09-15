package mockito;

import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {

    @Test
    public void should_return_90_when_calculate_student_average_grade_and_grade_is_80_and_90_and_100() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        GradeService gradeService = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        assertEquals(90.0, gradeService.calculateAverageGrades(1L));
    }
}
