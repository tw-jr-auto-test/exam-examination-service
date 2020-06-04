package com.thoughtworks.exam.examination.application;

import com.thoughtworks.exam.examination.domain.AnswerSheetId;
import lombok.Data;

@Data
public class ReviewAnswerSheetCommand {
    private AnswerSheetId id;
}
