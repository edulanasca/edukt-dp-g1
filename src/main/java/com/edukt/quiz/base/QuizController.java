package com.edukt.quiz.base;

import com.edukt.quiz.user.UserQuiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/quizzes", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuizController {

  private BaseQuizRepository quizRepository;

  @Autowired
  public void setQuizRepository(BaseQuizRepository quizRepository) {
    this.quizRepository = quizRepository;
  }

  @PostMapping("/revisar")
  public UserQuiz revisarQuiz(@RequestBody UserQuiz userQuiz) {

    Quiz quiz = this.quizRepository.findById(userQuiz.getQuiz_id()).orElseGet(Quiz::new);

    UserQuiz userQuiz1 = new UserQuiz(userQuiz.getPreguntas(),
        userQuiz.getUsername(),
        userQuiz.getQuiz_id());

    userQuiz1.revisar(quiz);

    return userQuiz1;
  }

}
