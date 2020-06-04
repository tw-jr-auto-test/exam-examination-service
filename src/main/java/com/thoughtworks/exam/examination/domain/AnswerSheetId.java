package com.thoughtworks.exam.examination.domain;

import java.util.UUID;

public class AnswerSheetId {
    private String value;

    public AnswerSheetId(String value) {
        this.value = value;
    }

    public AnswerSheetId generate() {
        return new AnswerSheetId("answersheet-" + UUID.randomUUID().toString());
    }
}
