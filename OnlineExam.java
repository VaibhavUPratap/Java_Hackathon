
import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        Question[] questions = new Question[10];
        initializeQuestions(questions);

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int correctCount = 0;
        int wrongCount = 0;

        System.out.println("Welcome to the Online Exam!");
        System.out.println("There are 10 multiple choice questions.");
        System.out.println("Please enter the number corresponding to your answer (1-4).");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question " + (i + 1) + ": " + q.getQuestionText());
            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            int userAnswer = -1;
            while (true) {
                System.out.print("Your answer: ");
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    if (userAnswer >= 1 && userAnswer <= 4) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Consume invalid input
                }
            }

            if (userAnswer - 1 == q.getCorrectOptionIndex()) {
                System.out.println("Correct!");
                score++;
                correctCount++;
            } else {
                System.out.println("Wrong! The correct answer was: " + options[q.getCorrectOptionIndex()]);
                wrongCount++;
            }
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n==================================================");
        System.out.println("Exam Finished!");
        System.out.println("==================================================\n");
        System.out.println("Final Score: " + score + " / 10");
        System.out.println("Correct Answers: " + correctCount);
        System.out.println("Wrong Answers: " + wrongCount);
        System.out.println("Percentage: " + (score / 10.0) * 100 + "%");
        System.out.println("==================================================\n");
        if (score >= 8) {
            System.out.println("Result: EXCELLENT! 🎉");
        } else if (score >= 6) {
            System.out.println("Result: GOOD! 👍");
        } else if (score >= 4) {
            System.out.println("Result: AVERAGE!");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT!");
        }
        System.out.println("==================================================\n");

        scanner.close();
    }

    private static void initializeQuestions(Question[] questions) {
        questions[0] = new Question("When was DSU officially established as a university (as a private university)?",
                new String[]{"2005", "2010", "2014", "2018"}, 2);
        questions[1] = new Question("Who founded the parent institution of DSU (the original institutions)?",
                new String[]{"Mahatma Gandhi Vidya Peetha Trust", "Late Sri Dayananda Sagar", "Government of Karnataka", "AICTE"}, 1);
        questions[2] = new Question("Which trust governs DSU and its institutions?",
                new String[]{"Visvesvaraya Technological Trust", "Karnataka Private University Trust", "Mahatma Gandhi Vidya Peetha Trust", "Dayananda Sagar Academic Trust"}, 2);
        questions[3] = new Question("On which road is DSU’s main campus (Harohalli / Devarakaggalahalli) located?",
                new String[]{"Hosur Road", "Kanakapura Road", "Mysore Road", "Outer Ring Road"}, 1);
        questions[4] = new Question("Which of these streams is not among the broad categories of courses offered by DSU (UG/PG/PhD)?",
                new String[]{"Engineering", "Pharmacy / Health Sciences", "Law", "Veterinary Sciences"}, 3);
        questions[5] = new Question("Which accreditation / recognition does DSU hold?",
                new String[]{"UGC only", "AICTE only", "NAAC A+", "None of the above"}, 2);
        questions[6] = new Question("From which academic year did DSU begin its academic activities (after establishment)?",
                new String[]{"2013–14", "2014–15", "2015–16", "2016–17"}, 2);
        questions[7] = new Question("Which of the following programs are offered by DSU as per its schools?",
                new String[]{"B.Tech, MBA, B.Pharm, M.Sc", "B.Tech only", "MBA only", "M.Phil and MBBS only"}, 0);
        questions[8] = new Question("Under which act / law was DSU created as a private university?",
                new String[]{"Karnataka Act No. 20 of 2013", "Karnataka Act No. 15 of 2010", "UGC Private Universities Act 2009", "Indian Universities Act 1956"}, 0);
        questions[9] = new Question("Which of these is part of DSU’s vision or core emphasis (as per its institutional objectives)?",
                new String[]{"Only teaching", "Teaching and Research only", "Teaching, Research, Innovation and Entrepreneurship", "Sports and Entertainment only"}, 2);
    }
}
