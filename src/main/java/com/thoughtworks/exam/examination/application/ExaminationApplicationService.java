package com.thoughtworks.exam.examination.application;

import com.thoughtworks.exam.examination.domain.model.examination.Examination;
import com.thoughtworks.exam.examination.domain.model.examination.ExaminationId;
import com.thoughtworks.exam.examination.domain.model.examination.ExaminationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExaminationApplicationService {
    private ExaminationRepository examinationRepository;

    public ExaminationId create(final CreateExaminationCommand command) {
        Examination examination = Examination.create(command.getPaperId(), command.getStartDate());
        examinationRepository.save(examination);
        return examination.getId();
    }
}
