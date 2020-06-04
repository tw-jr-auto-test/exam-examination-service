package com.thoughtworks.exam.examination.application;

import com.thoughtworks.exam.examination.domain.AnswerSheet;
import com.thoughtworks.exam.examination.domain.AnswerSheetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AnswerSheetApplicationService {
    private final AnswerSheetRepository answerSheetRepository;

    public void assign() {

    }

    public void submit(final SubmitAnswerCommand command) {
        AnswerSheet answerSheet = answerSheetRepository.findById(command.getAnswerSheet().getId());
        answerSheetRepository.save(answerSheet);
    }

    public void handIn(final HandInCommand command) {
        AnswerSheet answerSheet = answerSheetRepository.findById(command.getId());
        answerSheet.setAnswers(command.getAnswers());
        answerSheetRepository.save(answerSheet);
    }

    public void review(final ReviewAnswerSheetCommand command) {
        AnswerSheet answerSheet = answerSheetRepository.findById(command.getId());
        answerSheet.review();
        answerSheetRepository.save(answerSheet);
    }
}
