package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CarsTest {

    @DisplayName("자동차의 이름 중복 일때")
    @Test
    void duplicationNames() {
        assertThatThrownBy(() -> new Cars(List.of("aaa", "aaa", "ccc")))
                .isInstanceOf(IllegalArgumentException.class);
    }
}