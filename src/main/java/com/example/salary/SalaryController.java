package com.example.salary;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class SalaryController {
    @GetMapping("/namee/{id}")
    public String getSalary(@PathVariable("id") String id) throws InterruptedException{
        Thread.sleep(4000);
        if(id.equals("user_1"))
            return "70,000";
        throw new RuntimeException();
    }
    @PostMapping("/salary")
    public salary saveSalary(@RequestBody salary salary){
       salary salary1= new salary();
       salary1.setSalaryId(salary.getSalaryId());
       salary1.setAmount(salary.getAmount());
       return salary1;

    }
    @GetMapping("/userdata")
    public salary get(){
     salary salary = new salary();
     salary.setSalaryId(1);
     salary.setAmount(2000);
     return salary;
    }
}
