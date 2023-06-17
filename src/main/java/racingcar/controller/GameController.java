package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.PowerGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {

    private final PowerGenerator powerGenerator;
    private final InputView inputView;
    private final OutputView outputView;

    public GameController(PowerGenerator powerGenerator, InputView inputView, OutputView outputView) {
        this.powerGenerator = powerGenerator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        Cars cars = getCar();
        int tryCount = getTryCount();
        System.out.println();

        repeat(cars, tryCount);
    }

    public Cars getCar() {
        List<String> name = inputView.getCarName();
        try {
            return new Cars(name);
        } catch (IllegalStateException e) {
            return getCar();
        }
    }

    public int getTryCount() {
        try {
            return inputView.getTryCount();
        } catch (IllegalStateException e) {
            return getTryCount();
        }
    }

    public void repeat(Cars cars, int tryCount) {
        while (tryCount != 0) {
            cars.move(powerGenerator);
            tryCount--;
            outputView.printStateMessage(cars.getStateMessage());
        }
        outputView.printWinnerMessage(cars.getWinnersNames());
    }
}
