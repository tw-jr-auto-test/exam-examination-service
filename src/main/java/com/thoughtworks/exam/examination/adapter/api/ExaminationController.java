package com.thoughtworks.exam.examination.adapter.api;

import com.thoughtworks.exam.examination.application.CreateExaminationCommand;
import com.thoughtworks.exam.examination.application.ExaminationApplicationService;
import com.thoughtworks.exam.examination.domain.model.examination.ExaminationId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/examinations")
public class ExaminationController {
    private final ExaminationApplicationService examinationApplicationService;

    public ExaminationController(ExaminationApplicationService examinationApplicationService) {
        this.examinationApplicationService = examinationApplicationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExaminationDto create(@RequestBody final CreateExaminationCommand command) {
        ExaminationId examinationId = examinationApplicationService.create(command);
        return ExaminationDto.from(examinationId.toString());
    }
}
