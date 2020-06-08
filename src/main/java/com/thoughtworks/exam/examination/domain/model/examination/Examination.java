package com.thoughtworks.exam.examination.domain.model.examination;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Builder
public class Examination {
    private ExaminationId id;
    private String paperId;
    private LocalDate startDate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public static Examination create(final String paperId, final LocalDate startDate) {
        return Examination.builder()
                .id(ExaminationId.generate())
                .paperId(paperId)
                .startDate(startDate)
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();
    }
}
