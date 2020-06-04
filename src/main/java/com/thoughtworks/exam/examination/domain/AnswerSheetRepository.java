package com.thoughtworks.exam.examination.domain;

public interface AnswerSheetRepository {

    void save(AnswerSheet answerSheet);

    AnswerSheet findById(AnswerSheetId id);
}
