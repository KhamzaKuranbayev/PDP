package pdp_lessons.module2.extraTask.task10;

import java.util.List;

public class Vocabulary {

    private String fromKey;
    private String toKey;
    private Word word;
    private List<Word> wordList;

    public Vocabulary(String fromKey, String toKey, String from_word, String to_word) {

    }

    public String getFromKey() {
        return fromKey;
    }

    public void setFromKey(String fromKey) {
        this.fromKey = fromKey;
    }

    public String getToKey() {
        return toKey;
    }

    public void setToKey(String toKey) {
        this.toKey = toKey;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
}
