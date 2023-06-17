package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @DisplayName("자동차에 이름을 부여한다.")
    @Test
    void createCarName() {
        assertThatCode(() -> new Car(new Names("블루베리"))).doesNotThrowAnyException();
    }

    @DisplayName("자동차 이름의 길이가 5초과할 때, 1미만일 때 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"여섯글자테스트", ""})
    void carNameFalse(String name) {
        assertThatThrownBy(() -> new Car(new Names(name))).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차의 이름의 길이가 1 ~ 5 사이일 때")
    @ParameterizedTest
    @ValueSource(strings = {"네글자", "세글자다", " 양쪽 공백 "})
    void carNameTrue(String name) {
        assertThatCode(() -> new Car(new Names(name))).doesNotThrowAnyException();
    }

    @DisplayName("값이 4 이상일 경우 전진한다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7})
    void move(int number) {
        Car car = new Car(new Names("?"), number);
        int position = car.getPosition();
        car.move(number);

        assertThat(car.getPosition()).isEqualTo(position + 1);
    }

    @DisplayName("값이 4 미만일 경우 전진하지 않는다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void noMove(int number) {
        Car car = new Car(new Names("?"), number);
        int position = car.getPosition();
        car.move(number);

        assertThat(car.getPosition()).isEqualTo(position);
    }

}