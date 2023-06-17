package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomPowerGenerator implements PowerGenerator {
    @Override
    public int powerGenerator() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
