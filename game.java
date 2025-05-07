import java.util.*;

public class WordGuessGame {
    private static ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
    private static int score = 0;

    private static String getRank(int score) {
        if (score >= 30) {
            return "최고 등급";
        } else if (score >= 20) {
            return "중간 등급";
        } else {
            return "초보자 등급";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("rkqtdmf dlqfurgktpdy");

        while (!words.isEmpty()) {
            System.out.println("위치를 입력하세요);
            String input = scanner.nextLine();

            if (words.contains(input)) {
                System.out.println("참! 맞았습니다.");
                words.remove(input);
                score += 10; // 맞추면 점수 +10
            } else {
                System.out.println("틀렸습니다. 다시 시도하세요.");
            }
       
            if (words.isEmpty()) {
                System.out.println("모든 단어를 맞추셨습니다!");
            }
        }

        System.out.println("최종 점수: " + score);
        String rank = getRank(score);
        System.out.println("당신의 등급: " + rank);

        System.out.println("게임 종료.");
    }

    
}
