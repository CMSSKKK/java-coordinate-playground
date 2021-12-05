package view;

import domain.Point;

import java.util.List;

public class ResultView {

    private static final String RESULT_ORDER = "두 점 사이 거리는 ";


    public static void printResult(List<Point> list) {
        String answer = String.format("%.6f", getAnswer(list));
        System.out.println(RESULT_ORDER + answer);
    }

    private static double getAnswer(List<Point> list) {
        return list.get(0).getDistance(list.get(1));
    }
}
