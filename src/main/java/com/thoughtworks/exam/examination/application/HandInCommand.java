package com.thoughtworks.exam.examination.application;

import com.thoughtworks.exam.examination.domain.AnswerSheet;
import com.thoughtworks.exam.examination.domain.AnswerSheetId;
import lombok.Data;

import java.util.Set;

@Data
public class HandInCommand {
    private AnswerSheetId id;
    private Set<AnswerSheet.Answer> answers;
}
