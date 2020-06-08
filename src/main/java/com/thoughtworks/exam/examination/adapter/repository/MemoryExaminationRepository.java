package com.thoughtworks.exam.examination.adapter.repository;

import com.thoughtworks.exam.examination.domain.model.examination.Examination;
import com.thoughtworks.exam.examination.domain.model.examination.ExaminationId;
import com.thoughtworks.exam.examination.domain.model.examination.ExaminationRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("checkstyle:magicnumber")
@Repository
public class MemoryExaminationRepository implements ExaminationRepository {
    private final Set<Examination> examinations = new HashSet<>();

    {
        examinations.add(Examination.builder()
                .id(new ExaminationId("Examination001"))
                .paperId("Paper001")
                .build());
    }

    @Override
    public void save(final Examination examination) {
        boolean existed = examinations.stream().anyMatch(e -> e.equals(examination));
        if (existed) {
            examinations.stream().filter(e -> e.equals(examination)).forEach(
                    o -> {
                        o.setPaperId(examination.getPaperId());
                        o.setStartDate(examination.getStartDate());
                        o.setUpdateTime(LocalDateTime.now());
                    }
            );
        } else {
            examinations.add(examination);
        }
    }
}
