package pdp_lessons.module2.extraTask.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionDemo {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    static User onlineUser = null;
    static int indexResult = 0;

    public static void main(String[] args) {

        User[] users = new User[3];
        users[0] = new User("Khamza Kuranbayev", "khamza@mail.ru", "asd123", "user");
        users[1] = new User("Aziz Ahmedov", "aziz@mail.ru", "qwe123", "user");
        users[2] = new User("Mirakbar Tolipov", "mirtolip@mail.ru", "admin123", "admin");

        // Subject lar ro'yhati
        List<Subject> subjects = new ArrayList<>();

        // 1 - Subject ----------------------------------------------------
        //  1 - Subjectning Question lari ro'yhati
        List<Question> questionList1 = new ArrayList<>();

        Subject subject1 = new Subject();

        Question question1 = new Question();
        List<Answer> answers1 = new ArrayList<>();
        answers1.add(new Answer("A", "Modda", false));
        answers1.add(new Answer("B", "Materiya", false));
        answers1.add(new Answer("C", "Kichik massa", true));
        answers1.add(new Answer("D", "Atom", false));

        question1.setId(1);
        question1.setText("Molekula so'zining manosi nima?");
        question1.setAnswerList(answers1);

        Question question2 = new Question();
        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer("A", "Suv", true));
        answers2.add(new Answer("B", "Spirt", false));
        answers2.add(new Answer("C", "Sut", false));
        answers2.add(new Answer("D", "Yog'", false));
        question2.setId(2);
        question2.setText("Qanday modda (suyuqlik) qattiq holatga o'tganda boshqacha nom oladi?");
        question2.setAnswerList(answers2);

        Question question3 = new Question();
        List<Answer> answers3 = new ArrayList<>();
        answers3.add(new Answer("A", "Borometr", false));
        answers3.add(new Answer("B", "Dinometr", false));
        answers3.add(new Answer("C", "Termometr", true));
        question3.setId(3);
        question3.setText("Temperatura nima bilan o'lchanadi?");
        question3.setAnswerList(answers3);

        questionList1.add(question1);
        questionList1.add(question2);
        questionList1.add(question3);

        subject1.setId(1);
        subject1.setName("Fizika");
        subject1.setQuestions(questionList1);

        // 2 - Subject ----------------------------------------------------
        //  2 - Subjectning Question lari ro'yhati
        List<Question> questionList2 = new ArrayList<>();

        Subject subject2 = new Subject();

        question1 = new Question();
        answers1 = new ArrayList<>(3);
        answers1.add(new Answer("A", "1", false));
        answers1.add(new Answer("B", "2", false));
        answers1.add(new Answer("C", "3", false));
        answers1.add(new Answer("D", "4", true));
        question1.setId(1);
        question1.setText("OOP prinsplari nechta");
        question1.setAnswerList(answers1);

        question2 = new Question();
        answers2 = new ArrayList<>(3);
        answers2.add(new Answer("A", "Encapsulation", false));
        answers2.add(new Answer("B", "Inheritance", false));
        answers2.add(new Answer("C", "Array", true));
        question2.setId(2);
        question2.setText("Qaysi biri OOP prinspiga kirmaydi");
        question2.setAnswerList(answers2);

        question3 = new Question();
        answers3 = new ArrayList<>(3);
        answers3.add(new Answer("A", "1", true));
        answers3.add(new Answer("B", "2", false));
        answers3.add(new Answer("C", "Istalgancha", false));
        question3.setId(3);
        question3.setText("Child class nechta Super class dan voris olishi mumkin?");
        question3.setAnswerList(answers3);

        questionList2.add(question1);
        questionList2.add(question2);
        questionList2.add(question3);

        subject2.setId(2);
        subject2.setName("Dasturlash");
        subject2.setQuestions(questionList2);

        subjects.add(subject1);
        subjects.add(subject2);

        Result[] results = new Result[20];

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEmail: ");
                    String email = scanner.next();
                    System.out.print("Password: ");
                    String password = scanner.next();

                    if (checkLogin(users, email, password)) {
                        boolean bool = true;
                        while (bool) {
                            System.out.println("1. Test topshirish");
                            System.out.println("2. Natijalarni ko'rish");
                            System.out.println("3. Chiqish");
                            choice = scanner.nextInt();

                            switch (choice) {
                                case 1:
                                    boolean b = true;
                                    while (b) {
                                        printMenu(subjects);
                                        choice = scanner.nextInt();

                                        switch (choice) {
                                            case 1:
                                                viewQuestionList(subject1, questionList1);
                                                choice = scanner.nextInt();
                                                quizProcess(questionList1, subject1, results);
                                                break;
                                            case 2:
                                                viewQuestionList(subject2, questionList2);
                                                choice = scanner.nextInt();
                                                quizProcess(questionList2, subject2, results);
                                                break;
                                            case 0:
                                                b = false;
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\nHurmatli, " + onlineUser.getName() + " qaysi fanning natijalarini ko'rmoqchisiz?");
                                    System.out.println("-----------------------------------");
                                    getSubjects(subjects);
                                    System.out.println("-----------------------------------");
                                    choice = scanner.nextInt();
                                    Subject subject = subjects.get(choice - 1);
                                    System.out.println();
                                    for (Result result : results) {
                                        if (result != null) {
                                            if (result.getUser().equals(onlineUser) && result.getSubject().equals(subject)) {
                                                printResult(result.getSubject().getQuestions(), subject);
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    bool = false;
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static boolean checkLogin(User[] users, String email, String password) {
        for (User user : users) {
            if (user != null && user.login(email, password)) {
                onlineUser = user;
                System.out.println("\nXurmatli " + user.getName() + " online test tizimiga xush kelibsiz!");
                return true;
            }
        }
        return false;
    }

    private static void quizProcess(List<Question> questionList, Subject subject, Result[] results) {
        if (choice == 1) {
            System.out.println("\n" + subject.getName() + " dan test jarayoni boshlandi... ");
            System.out.println("-----------------------------------");
            for (Question question : questionList) {
                System.out.println(question.getId() + ". " + question.getText());
                for (Answer answer : question.getAnswerList()) {
                    System.out.print(answer.getId() + ". " + answer.getText() + "   ");
                }
                System.out.print("\nJavobingiz: ");
                String userAnswer = scanner.next();
                question.setUserAnswer(userAnswer);

                if (question.checkAnswer(userAnswer)) {
                    question.setCheck(true);
                    System.out.println("Barakalla!");
                } else {
                    System.out.println("Javobingiz noto'gri! To'g'ri javob: " + question.getRightAnswer());
                }
                System.out.println("-----------------------------------\n");
            }

            int score = 0;
            for (Question question : questionList) {
                if (question.isCheck())
                    score++;
            }
            subject.setScore(score);
            results[indexResult++] = new Result(onlineUser, subject);
            printResult(questionList, subject);
        }
    }

    public static void printResult(List<Question> questionList, Subject subject) {
        int result = (100 * subject.getScore()) / questionList.size();
        System.out.println("Xurmatli " + onlineUser.getName() + " sizning " + subject.getName() + "dan test natijangiz: ");
        System.out.println("-----------------------------------");
        System.out.println(questionList.size() + " tadan " + subject.getScore() + "ta; " + result + " %");
        System.out.print("To'g'ri javoblar:      ");
        questionList.forEach(question -> System.out.print(question.getRightAnswer().substring(0, question.getRightAnswer().indexOf('.')) + " "));
        System.out.println();
        System.out.print("Sizning javoblaringiz: ");
        questionList.forEach(question -> System.out.print(question.getUserAnswer() + " "));
        System.out.println("\n-----------------------------------\n");
    }

    public static void viewQuestionList(Subject subject, List<Question> questions) {
        System.out.println("\n" + subject.getName() + " savollari");
        for (Question question : questions) {
            System.out.println(question.getId() + ". " + question.getText());
        }
        System.out.println("\nTest topshirasizmi? 1- Ha 2 - Yo'q");
    }

    public static void printMenu(List<Subject> subjects) {
        System.out.println("\nQaysi fandan test topshirmoqchisiz?");
        System.out.println("-----------------------------------");
        getSubjects(subjects);
        System.out.println("0. Exit\n");
    }

    public static void getSubjects(List<Subject> subjects) {
        for (Subject subject : subjects) {
            System.out.println(subject.getId() + ". " + subject.getName());
        }
    }
}
