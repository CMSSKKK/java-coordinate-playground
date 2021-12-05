package step2test;

import domain.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.OutputView;

import java.util.Arrays;
import java.util.List;

public class OutputViewTest {

    @Test
    @DisplayName("InputView에서 point 리스트를 받아서 결과를 출력한다.")
    void printResult() {
        List<Point> list = Arrays.asList(new Point(10, 10), new Point(11, 11));
        OutputView.printResult(list);
    }
}
