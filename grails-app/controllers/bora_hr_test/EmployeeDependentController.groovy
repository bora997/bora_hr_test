package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class EmployeeDependentController extends SimpleGenericRestfulController<EmployeeDependent>{
    EmployeeDependentController(){
        super(EmployeeDependent)
    }


}
