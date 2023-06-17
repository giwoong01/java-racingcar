package racingcar.domain;

public class Car {
    public static final int MOVE_LOWER_BOUND_INCLUSIVE = 4;

    private final Names name;
    private int position;

    public Car(Names name) {
        this.name = name;
    }

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

    public String getStateMessage() {
        StringBuilder stringBuilder = new StringBuilder(String.format("%s : ", name.getValue()));
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public boolean isSamePosition(int maxPosition) {
        return position >= maxPosition;
    }

    public int getPosition() {
        return position;
    }

    public Names getName() {
        return name;
    }
}
