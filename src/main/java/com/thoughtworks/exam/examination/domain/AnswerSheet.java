package com.thoughtworks.exam.examination.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
@Builder
public class AnswerSheet {
    private AnswerSheetId id;
    private String studentId;
    private int score;
    private Set<Answer> answers;

    public void review() {
        score = answers.stream()
                .filter(Answer::compare)
                .map(answer -> answer.getBlankQuiz().getScore())
                .mapToInt(Integer::intValue).sum();
    }

    @Data
    @AllArgsConstructor
    @Builder
    public static class Answer {
        private Integer number;
        private BlankQuiz blankQuiz;
        private String answer;
        private String referenceAnswer;

        public boolean compare() {
            return referenceAnswer.contains(answer);
        }
    }

    @Data
    @AllArgsConstructor
    @Builder
    public static class BlankQuiz {
        private String content;
        private Integer score;
    }
}
