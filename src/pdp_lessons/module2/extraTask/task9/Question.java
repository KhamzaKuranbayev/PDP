package pdp_lessons.module2.extraTask.task9;

import java.util.List;

public class Question {

    private int id;
    private String text;
    private List<Answer> answerList;
    private boolean check;
    private String userAnswer;

    public Question() {
    }

    public Question(int id, String text, List<Answer> answerList) {
        this.id = id;
        this.text = text;
        this.answerList = answerList;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getRightAnswer() {
        for (Answer answer : getAnswerList()) {
            if (answer.isStatus()) {
                return answer.getId() + ". " + answer.getText();
            }
        }
        return "";
    }

    public boolean checkAnswer(String userAnswer) {
        for (Answer answer : getAnswerList()) {
            if (answer.getId().equals(userAnswer) && answer.isStatus()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", answerList=" + answerList +
                '}';
    }
}
