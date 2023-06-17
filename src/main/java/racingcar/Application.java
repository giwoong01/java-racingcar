package racingcar;

import racingcar.controller.GameController;
import racingcar.domain.RandomPowerGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        GameController gameController = new GameController(new RandomPowerGenerator(),new InputView(), new OutputView());
        gameController.run();
    }
}
