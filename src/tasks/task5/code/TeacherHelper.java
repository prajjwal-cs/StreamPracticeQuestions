package tasks.task5.code;

import java.util.List;
import java.util.Set;

public class TeacherHelper {
    public List<Teacher> findSubjectTeacher(List<Teacher> allTeachers, String subjectName) {
        return allTeachers.stream()
                .filter(e -> e.getTeacherSubject().contains(subjectName))
                .toList();
    }

    public Set<Teacher> getBusyTeachers(List<Teacher> allTeachers) {
        return Set.of();
    }
}
