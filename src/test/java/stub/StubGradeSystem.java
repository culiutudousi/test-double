package stub;

import java.util.Arrays;
import java.util.List;

public class StubGradeSystem extends GradeSystem{

    private List<Double> stubGrade;

    @Override
    public List<Double> gradesFor(long studentId) {
        return stubGrade;
    }

    public void setStubGrade(List<Double> grade) {
        stubGrade = grade;
    }
}
