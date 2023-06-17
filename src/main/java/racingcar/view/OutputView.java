package racingcar.view;

public class OutputView {

    public void printStateMessage(String stateMessage) {
        System.out.println(stateMessage);
        System.out.println();
    }

    public void printWinnerMessage(String winnersNames) {
        System.out.println("최종 우승자 : " + winnersNames);
    }
}
