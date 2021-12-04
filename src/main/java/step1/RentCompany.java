package step1;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final RentCompany INSTANCE = new RentCompany();
    private static List<Car> COMPANY_CARS = new ArrayList<>();

    private RentCompany() {
    }

    public static RentCompany create() {
        return INSTANCE;
    }

    public void addCar(Car car) {
        COMPANY_CARS.add(car);
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
//        for (Car companyCar : COMPANY_CARS) {
//            stringBuilder.append(generateStatus(companyCar)).append('\n');
//        }
        COMPANY_CARS.stream()
                .map(car -> this.generateStatus(car))
                .forEach(s -> stringBuilder.append(s).append('\n'));

        return stringBuilder.toString();
    }

    private String generateStatus(Car car) {
        String status = String.format("%s : %.0f리터", car.getName(), car.getChargeQuantity());
        return status;
    }
}
