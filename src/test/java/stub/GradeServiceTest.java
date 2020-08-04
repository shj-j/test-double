package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Mock
    private GradeSystem gradeSystem;

    @InjectMocks
    private GradeService mockGradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        long studentID = 1;

        when(gradeSystem.gradesFor(studentID)).thenReturn(Arrays.asList(100.0, 100.0, 100.0));

        Assertions.assertEquals(100.0, mockGradeService.calculateAverageGrades(studentID));
        verify(gradeSystem).gradesFor(studentID);
    }
}
