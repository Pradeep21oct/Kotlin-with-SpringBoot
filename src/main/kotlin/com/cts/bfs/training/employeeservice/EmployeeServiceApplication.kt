package com.cts.bfs.training.employeeservice

import com.cts.bfs.training.model.Employee
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@RestController
@RequestMapping("/employee")
@EnableSwagger2
class EmployeeServiceApplication {


    @RequestMapping("/hi")
    fun syaHello(): String {
        return "Hello"
    }

    @RequestMapping("/{id}")
    fun getEmpById(@PathVariable id:String):Employee{
       return EmpoyeeData().findEmployeeById(id)

    }
}
fun main(args: Array<String>) {
    runApplication<EmployeeServiceApplication>(*args)
}
