package com.cts.bfs.training.employeeservice

import com.cts.bfs.training.model.Employee

class EmpoyeeData{
    fun findEmployeeById( empId:String): Employee {
        return when(empId){
            "1"-> Employee("1","One")
            "2"-> Employee("2","Two")
            "3"-> Employee("3","Three")
            "4"-> Employee("4","Four")
            else   ->throw Exception("Unsuppted Extestion ")

        }

    }
}