package step1test;

import org.junit.jupiter.api.Test;
import step1.Avante;
import step1.K5;
import step1.RentCompany;
import step1.Sonata;

import static org.assertj.core.api.Assertions.assertThat;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create();
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();

        assertThat(report).isEqualTo(
                "SONATA : 15리터" + NEWLINE +
                "K5 : 20리터" + NEWLINE +
                "SONATA : 12리터" + NEWLINE +
                "AVANTE : 20리터" + NEWLINE +
                "K5 : 30리터" + NEWLINE
        );
    }
}