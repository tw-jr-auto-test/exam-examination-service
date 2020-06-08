package com.thoughtworks.exam.examination.adapter.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExaminationDto {
    private String examinationId;

    public static ExaminationDto from(final String examinationId) {
        return new ExaminationDto(examinationId);
    }
}
