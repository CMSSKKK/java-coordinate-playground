package domain;


import view.InputView;
import view.ResultView;

import java.util.List;
import java.util.Scanner;

public class CoordinateCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        InputView.inputOrder();
        List<Point> points = InputView.generatePoints(scanner.nextLine());
        ResultView.printResult(points);
    }

}
