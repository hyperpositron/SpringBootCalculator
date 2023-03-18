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

    @GetMapping("/plus")
    public String plus() {
        return "плюс";
    }

    @GetMapping("/minus")
    public String minus() {
        return "минус";
    }

    @GetMapping("/multiply")
    public String multiply() {
        return "умножение";
    }

    @GetMapping("/divide")
    public String divide() {
        return "деление"
    }
}
