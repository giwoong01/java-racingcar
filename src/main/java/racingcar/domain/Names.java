package racingcar.domain;

public class Names {
    public static final int MIN_NAME_LENGTH = 1;
    public static final int MAX_NAME_LENGTH = 5;

    private final String value;

    public Names(String value) {
        value = nameTrim(value);

        validateNameLength(value);
        this.value = value;
    }

    public void validateNameLength(String value) {
        if (value.length() < MIN_NAME_LENGTH || value.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 1 ~ 5 글자여야 합니다.");
        }
    }

    public String nameTrim(String value) {
        return value.trim();
    }
}
