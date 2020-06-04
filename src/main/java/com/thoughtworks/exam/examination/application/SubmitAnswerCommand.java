package com.thoughtworks.exam.examination.application;

import com.thoughtworks.exam.examination.domain.AnswerSheet;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SubmitAnswerCommand {
    private AnswerSheet answerSheet;
}
