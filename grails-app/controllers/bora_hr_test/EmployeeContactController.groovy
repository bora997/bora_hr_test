package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class EmployeeContactController extends SimpleGenericRestfulController<EmployeeContact>{
    EmployeeContactController(){
        super (EmployeeContact)
    }

}
