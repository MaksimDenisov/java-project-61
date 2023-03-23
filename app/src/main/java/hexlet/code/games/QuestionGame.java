package hexlet.code.games;

public interface QuestionGame {

    default String getGameName() {
        return this.getClass().getSimpleName();
    }

    String getRules();

    Question getNewQuestion();

    record Question(String question, String answer) {

        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }
    }
}
