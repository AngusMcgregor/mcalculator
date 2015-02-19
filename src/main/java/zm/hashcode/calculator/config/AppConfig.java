package zm.hashcode.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zm.hashcode.calculator.Calculator;
import zm.hashcode.calculator.Impl.CalculatorImpl;
import zm.hashcode.calculator.Impl.ModularCalculatorImpl;

/**
 * Created by hashcode on 2015/02/19.
 */
@Configuration
public class AppConfig {
    @Bean(name="retcalc")
    public Calculator getCalculator(){
        return new CalculatorImpl();
    }

    @Bean(name="calc")
    public Calculator getModularCalculator(){

        return new ModularCalculatorImpl();
    }
}
