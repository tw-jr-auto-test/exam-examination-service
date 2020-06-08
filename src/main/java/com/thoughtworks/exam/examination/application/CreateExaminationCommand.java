package com.thoughtworks.exam.examination.application;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

/**
 * @author gitqh
 */
@Getter
@AllArgsConstructor
public class CreateExaminationCommand {
    private String paperId;
    private LocalDate startDate;
}
