package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class EmployeeResignController extends SimpleGenericRestfulController<EmployeeResign>{
    EmployeeResignController(){
        super(EmployeeResign)
    }

}
