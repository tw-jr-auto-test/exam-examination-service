package com.thoughtworks.exam.examination.infrustructure;

import com.thoughtworks.exam.examination.domain.AnswerSheet;
import com.thoughtworks.exam.examination.domain.AnswerSheetId;
import com.thoughtworks.exam.examination.domain.AnswerSheetRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("checkstyle:magicnumber")
@Repository
public class AnswerSheetMemRepository implements AnswerSheetRepository {
    private final Set<AnswerSheet> answerSheets = new HashSet<>();

    {
        answerSheets.add(AnswerSheet.builder()
                .id(new AnswerSheetId("answersheet-001"))
                .score(0)
                .studentId("student-001")
                .build());
    }

    @Override
    public void save(final AnswerSheet answerSheet) {
        boolean existed = answerSheets.stream().anyMatch(e -> e.equals(answerSheet));
        if (existed) {
            answerSheets.stream().filter(e -> e.equals(answerSheet)).forEach(
                    o -> {
                        o.setId(answerSheet.getId());
                        o.setScore(answerSheet.getScore());
                        o.setStudentId(answerSheet.getStudentId());
                    }
            );
        } else {
            answerSheets.add(answerSheet);
        }
    }

    @Override
    public AnswerSheet findById(final AnswerSheetId id) {
        return null;
    }
}
