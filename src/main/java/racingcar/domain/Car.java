package racingcar.domain;

public class Car {
    public static final int MOVE_LOWER_BOUND_INCLUSIVE = 4;

    private final Names name;
    private int position;

    public Car(Names name, int position) {
        this.name = name;
        this.position = position;
    }

    // 추가 기능 구현
    public void move(int number) {
        if (number >= MOVE_LOWER_BOUND_INCLUSIVE) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public Names getName() {
        return name;
    }
}
