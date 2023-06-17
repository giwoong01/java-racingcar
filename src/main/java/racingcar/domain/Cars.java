package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> cars) {
        this.cars = cars.stream()
                .map(Names::new)
                .map(Car::new)
                .collect(Collectors.toList());

        validateDuplicationNames(cars);
    }

    public void move(PowerGenerator powerGenerator) {
        cars.forEach(car -> car.move(powerGenerator.powerGenerator()));
    }

    public String getStateMessage() {
        return cars.stream()
                .map(Car::getStateMessage)
                .collect(Collectors.joining("\n"));
    }

    public int getMaxPosition() {
        return cars.stream()
                .map(Car::getPosition)
                .reduce(0, Integer::max);
    }

    public String getWinnersNames() {
        int maxPosition = getMaxPosition();
        return cars.stream()
                .filter(car -> car.isSamePosition(maxPosition))
                .map(Car::getName)
                .map(Names::getValue)
                .collect(Collectors.joining(", "));
    }

    public void validateDuplicationNames(List<String> names) {
        if (new HashSet<>(names).size() != names.size()) {
            throw new IllegalArgumentException("차 이름이 중복될 수 업습니다.");
        }
    }

}