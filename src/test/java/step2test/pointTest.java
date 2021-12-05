package step2test;

import domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pointTest {

    @Test
    void create() {
        Point point = new Point(1, 2);
        assertThat(point).isEqualTo(new Point(1, 2));

    }

    @Test
    @DisplayName("x,y 좌표는 1부터 24까지 입력 가능하다.")
    void exceedLimit_test() {
        Point point = new Point(1, 2);
        assertThat(Point.exceedLimit(24)).isFalse();
        assertThat(Point.exceedLimit(25)).isTrue();
        assertThat(Point.exceedLimit(1)).isFalse();
        assertThat(Point.exceedLimit(0)).isTrue();

    }

    @Test
    @DisplayName("checkExceed를 포함한 생성자 테스트")
    void exceedLimit_생성자_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new Point(0, 24));
        assertThrows(IllegalArgumentException.class, () -> new Point(1, 25));
        assertThrows(IllegalArgumentException.class, () -> new Point(0, 25));

    }

    @Test
    @DisplayName("두 점 사이의 거리를 계산하는 기능")
    void point_to_point_getDistance() {
        Point origin = new Point(2,2);
        assertThat(origin.getDistance(new Point(3,3))).isEqualTo(1.414,offset(0.00099));

    }
}
