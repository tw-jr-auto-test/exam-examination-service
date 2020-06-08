package com.thoughtworks.exam.examination.domain.model.examination;

import com.thoughtworks.exam.examination.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.examination.common.ddd.core.AbstractId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@ValueObject
@EqualsAndHashCode(callSuper = true)
public class ExaminationId extends AbstractId {
    public ExaminationId(final String value) {
        super(value);
    }

    public static ExaminationId generate() {
        return new ExaminationId("exam-" + UUID.randomUUID().toString());
    }
}
