package it.develhope.swaggerTwo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.develhope.swaggerTwo.entity.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/math")

public class MathController {
    @GetMapping(value = "")
    public String welcomeMathMsg(){
        return "Welcome to the localhost:5050/swagger-ui/";
    }
    @GetMapping(value = "/division-info")
    public ArithmeticOperation divisionDetails(){
        String[] properties = {"Division by 1", "Division by 0", "Division by itself", "Division of 0 by any number"};
        return new ArithmeticOperation("Division",0, "Basic division arithmetic operation",properties);
    }
    @GetMapping(value = "/multiplication")
    public int getMultiplication(
            @ApiParam(value = "The first operand") @RequestParam(required = true) int operand1,
            @ApiParam(value = "The second operand") @RequestParam(required = true) int operand2
    ){
        return operand1 * operand2;
    }

    @GetMapping(value = "/square/{n}")
    public int getSquare(@ApiParam(value = "The number that needs to be squared") @PathVariable() Integer n){
        return n * n;
    }


}
