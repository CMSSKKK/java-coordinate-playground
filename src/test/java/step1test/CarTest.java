package step1test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step1.Avante;
import step1.Car;
import step1.K5;
import step1.Sonata;


import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차를 생성할때 여행거리를 넣는다")
    void 자동차_여행거리_생성자() {
        Car sonata = new Sonata(150);
        Car avante = new Avante(300);
        Car k5 = new K5(260);
        assertThat(sonata.getTripDistance()).isEqualTo(150);
        assertThat(avante.getTripDistance()).isEqualTo(300);
        assertThat(k5.getTripDistance()).isEqualTo(260);
    }

    @Test
    @DisplayName("자동차의 연비는 정해져있다.")
    void 자동차_연비_테스트() {
        Car sonata = new Sonata(150);
        Car avante = new Avante(300);
        Car k5 = new K5(260);
        assertThat(sonata.getDistancePerLiter()).isEqualTo(10);
        assertThat(avante.getDistancePerLiter()).isEqualTo(15);
        assertThat(k5.getDistancePerLiter()).isEqualTo(13);
    }

    @Test
    @DisplayName("자동차는 차종이 정해져있다.")
    void 자동차_이름_테스트() {
        Car sonata = new Sonata(150);
        Car avante = new Avante(300);
        Car k5 = new K5(260);
        assertThat(sonata.getName()).isEqualTo("SONATA");
        assertThat(avante.getName()).isEqualTo("AVANTE");
        assertThat(k5.getName()).isEqualTo("K5");
    }

    @Test
    @DisplayName("자동차의 연료를 주입해야하는 양을 구한다.")
    void 자동차_연료_주입_테스트() {
        Car sonata = new Sonata(150);
        Car avante = new Avante(300);
        Car k5 = new K5(260);
        assertThat(sonata.getChargeQuantity()).isEqualTo(15);
        assertThat(avante.getChargeQuantity()).isEqualTo(20);
        assertThat(k5.getChargeQuantity()).isEqualTo(20);
    }
}
