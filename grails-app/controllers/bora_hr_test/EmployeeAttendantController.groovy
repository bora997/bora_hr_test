package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class EmployeeAttendantController extends SimpleGenericRestfulController<EmployeeAttendant>{
    EmployeeAttendantController(){
        super(EmployeeAttendant)
    }


}
