package step2test;

import domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.List;

public class InputViewTest {

    @Test
    void inputOrder() {
        InputView.inputOrder();
    }

    @Test
    @DisplayName("좌표를 검증하고 분리한다.")
    void split_input() {
        String input = "(10,10)-(14,15)";
        Assertions.assertThat()
    }
}
