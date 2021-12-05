package step2test;

import domain.Point;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputViewTest {

    @Test
    void inputOrder() {
        InputView.inputOrder();
    }

    @Test
    @DisplayName("좌표를 검증하고 Point로 생성한다.")
    void generatePoint() {
        String input = "(10,10)";
        Assertions.assertThat(InputView.generatePoint(input)).isEqualTo(new Point(10,10));
    }

    @Test
    @DisplayName("인풋을 검증하고 List<Point>로 반환한다.")
    void generatePoints() {
        String input = "(10,10)-(11,11)";
        List<Point> points = Arrays.asList(new Point(10,10), new Point(11,11));
        Assertions.assertThat(InputView.generatePoints(input)).isEqualTo(points);
    }

    @Test
    @DisplayName("point 리스트에서 거리를 계산하여 반환한다.")
    void generatePoints_getDistance() {
        String input = "(10,10)-(11,11)";
        List<Point> list = InputView.generatePoints(input);
        double result = list.get(0).getDistance(list.get(1));
        Assertions.assertThat(InputView.getAnswer(list)).isEqualTo(result);
    }
}
