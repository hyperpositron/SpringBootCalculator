package pro.sky.SpringBootCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    @GetMapping
    public String hello() {
        return "Вы попали в Калькулятор";


    }
}
