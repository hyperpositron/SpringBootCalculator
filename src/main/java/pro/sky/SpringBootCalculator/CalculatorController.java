package pro.sky.SpringBootCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping

    public String hello() {
        return "Вы попали в Калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + service.sum(num1, num2);
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
        return "деление";
    }
}
