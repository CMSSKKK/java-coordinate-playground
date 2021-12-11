package view;

import domain.Point;

import java.util.List;

public class OutputView {
    private static final String HORIZONTAL = "----";
    private static final String VERTICAL = "|";
    private static final String BLANK = "    ";
    private static final String RESULT_ORDER = "두 점 사이 거리는 ";
    private static final String MARK = ".";
    private static final String START_POINT = "+";

    public static void printResult(List<Point> list) {
        String answer = String.format("%.6f", getAnswer(list));
        System.out.println(RESULT_ORDER + answer);
    }

    private static double getAnswer(List<Point> list) {
        return list.get(0).getDistance(list.get(1));
    }

    public static void showResult(List<Point> list) {
        printVertical(list);
        printHorizontal();
        printHorizontalNumber();
    }

    private static void printVertical(List<Point> list) {
        for (int y = 24; y >= 1 ; y--) {
            printCoordinateNumber(y);
            System.out.print(VERTICAL);
            showPoint(list, y);
            System.out.println();
        }
    }

    private static void printHorizontal() {
        System.out.print(BLANK+START_POINT);
        for (int x = 1; x <= 24 ; x++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println();
    }
    private static void printHorizontalNumber() {
        for (int x = 0; x <= 24 ; x++) {
            printCoordinateNumber(x);
        }
        System.out.println();
    }

    private static void showPoint(List<Point> list, int y) {
        for (int x = 1; x <= 24 ; x++) {
            int tempX = x;
            if(list.stream().anyMatch(point -> point.isSame(tempX,y))) {
                System.out.print(String.format("%4s", MARK));
                continue;
            }
            System.out.print(BLANK);
        }
    }

    private static void printCoordinateNumber(int number) {
        if(number % 2 == 0) {
            System.out.print(String.format("%4d",number));
            return;
        }
        System.out.print(BLANK);
    }
}
