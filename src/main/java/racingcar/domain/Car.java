package racingcar.domain;

public class Car {

    public static final int MIN_NAME_LENGTH = 1;
    public static final int MAX_NAME_LENGTH = 5;
    public static final int MOVE_LOWER_BOUND_INCLUSIVE = 4;

    private final String name;
    private int position;

    public Car(String name, int position) {
        validateNameLength(name);
        this.name = name;
        this.position = position;
    }

    // 추가 기능 구현
    public void validateNameLength(String name) {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 1 ~ 5 글자여야 합니다.");
        }
    }

    public int getPosition() {
        return position;
    }

    public void move(int number) {
        if (number >= MOVE_LOWER_BOUND_INCLUSIVE) {
            position++;
        }
    }

}
