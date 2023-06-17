package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public List<String> getCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputName = sc.nextLine();
        String[] nameArr = inputName.split(",", -1);

        return Arrays.asList(nameArr);
    }

    public int getTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String tryCount = sc.nextLine();

        return Integer.parseInt(tryCount);
    }
}
