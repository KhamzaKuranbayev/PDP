package pdp_lessons.module2.extraTask.task10;

import java.util.*;

public class Translator {

    static Scanner scanner = new Scanner(System.in);
    static String wordFrom;

    public static void main(String[] args) {

        int choice;
        HashMap<Integer, String> langMap = new HashMap<>();
        langMap.put(1, "English");
        langMap.put(2, "Russian");
        langMap.put(3, "Uzbek");
        langMap.put(4, "Turk");

        List<Word> wordList = new ArrayList<>();
        wordList.add(new Word(langMap.get(1), "Hello", "sdsds"));
        wordList.add(new Word(langMap.get(1), "Boy", "sdsds"));
        wordList.add(new Word(langMap.get(1), "School", "sdsds"));
        wordList.add(new Word(langMap.get(1), "Programming", "sdsds"));
        wordList.add(new Word(langMap.get(1), "Girl", "sdsds"));
        wordList.add(new Word(langMap.get(3), "Dasturlash", "sdsds"));
        wordList.add(new Word(langMap.get(3), "Maktab", "sdsds"));
        wordList.add(new Word(langMap.get(3), "Bola", "sdsds"));
        wordList.add(new Word(langMap.get(3), "Salom", "sdsds"));
        wordList.add(new Word(langMap.get(3), "Qiz", "sdsds"));

        HashMap<Word, Word> wordsMap = new HashMap<>();
        wordsMap.put(wordList.get(0), wordList.get(8));
        wordsMap.put(wordList.get(1), wordList.get(7));
        wordsMap.put(wordList.get(2), wordList.get(6));
        wordsMap.put(wordList.get(3), wordList.get(5));
        wordsMap.put(wordList.get(4), wordList.get(9));


        while (true) {
            System.out.println("1. Add Vocabulary");
            System.out.println("2. Search");
            System.out.println("3. List");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addVocabulary(langMap, wordList, wordsMap);
                    break;

                case 2:
                    translate(langMap, wordsMap);
                    break;
            }
        }

    }

    private static void addVocabulary(HashMap<Integer, String> langMap, List<Word> wordList, HashMap<Word, Word> wordsMap) {
        System.out.println("\nLang list:");
        langMap.forEach((index, lang) -> {
            System.out.println(lang);
        });
        System.out.println("-------------");
        System.out.println("1. Add new lang");
        String lang = scanner.next();
    }

    private static void translate(HashMap<Integer, String> langMap, HashMap<Word, Word> wordsMap) {
        System.out.println("\nFrom:");
        System.out.println("---------------");
        langMap.forEach((index, lang) -> {
            System.out.println(index + ". " + lang);
        });
        System.out.println("---------------");
        int choice = scanner.nextInt();
        String langFrom = langMap.get(choice);
        System.out.println("Word (" + langFrom + "): ");
        wordFrom = scanner.next();

        System.out.println("\nTo:");
        System.out.println("---------------");
        langMap.forEach((index, lang) -> {
            System.out.println(index + ". " + lang);
        });
        System.out.println("---------------");
        choice = scanner.nextInt();
        String langTo = langMap.get(choice);

        System.out.print("Result (" + langFrom + " - " + langTo + "): " + wordFrom + " ==> ");

        if (langFrom.equals("English")) {
            wordsMap.forEach((word1, word2) -> {
                if (word1.getText().equals(wordFrom)) {
                    System.out.print(word2.getText());
                }
            });
        } else {
            wordsMap.forEach((word1, word2) -> {
                if (word2.getText().equals(wordFrom)) {
                    System.out.print(word1.getText());
                }
            });
        }
        System.out.println("\n\n");
    }
}

