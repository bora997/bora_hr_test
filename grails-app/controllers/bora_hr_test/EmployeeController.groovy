package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class EmployeeController extends SimpleGenericRestfulController<Employee> {
    EmployeeController(){
        super (Employee)
    }

}
