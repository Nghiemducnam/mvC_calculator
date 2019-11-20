package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/calculate")
    public String Calculate(@RequestParam("operand1") double operand1,
                            @RequestParam("operand2") double operand2,
                            @RequestParam("operator") String operator, Model model){
        double result = Calculator (operand1, operand2, operator);
        model.addAttribute("result" , result);
        return "home";
        }

    private double Calculator(double operand1, double operand2, String operator){
        switch (operator){
            case "+":
                return operand1+operand2;
            case "-":
                return operand1-operand2;
            case  "*":
                return operand1*operand2;
            case "/":
                if(operand2!=0){
                    return operand1/operand2;
                }else{
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                    throw new RuntimeException("invalid operation");
        }

    }
    }

