package view;

import domain.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_ORDER = "좌표를 입력하세요.";
    private static final String POINT_REGEX = "\\(([0-9]{1,2}),([0-9]{1,2})\\)";
    private static final String INPUT_REGEX = "(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}";

    public static void inputOrder() {
        System.out.println(INPUT_ORDER);
    }


    public static Point generatePoint(String input) {
        Pattern pattern = Pattern.compile(POINT_REGEX);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            return new Point(x,y);
        }
        throw new IllegalArgumentException();
    }

    public static List<Point> generatePoints(String input) {
        checkValidInput(input);
        String[] splited = input.split("-");
        List<Point> points = new ArrayList<>();
        for (String s : splited) {
            points.add(generatePoint(s));
        }
        return points;
    }

    private static void checkValidInput(String input) {
        Pattern pattern = Pattern.compile(INPUT_REGEX);
        Matcher matcher = pattern.matcher(input);
        if(!matcher.matches()) {
            throw new IllegalArgumentException();
        }
    }

    public static double getAnswer(List<Point> points) {
        return points.get(0).getDistance(points.get(1));
    }
}
