package hexlet.code.games;

public interface QuestionGame {

    default String getGameName() {
        return this.getClass().getSimpleName();
    }

    String getRules();

    Question getNewQuestion();

    record Question(String question, String answer) {
        @Override
        public String toString() {
            return "Question{"
                    + "question='" + question + '\''
                    + ", answer='" + answer + '\''
                    + '}';
        }
    }
}
