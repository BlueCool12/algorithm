
class P8958_OX퀴즈 {
    public static int get(String quiz) {
        quiz = quiz.replace("X", " ");
        String[] answers = quiz.split("\\s+");
        int score = 0;
        for (String answer : answers) {
            for (int i = 1; i <= answer.length(); i++) {
                score += i;
            }            
        }
        return score;
    }
}
