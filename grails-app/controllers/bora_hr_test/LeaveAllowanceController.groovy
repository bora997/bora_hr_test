package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class LeaveAllowanceController extends SimpleGenericRestfulController<LeaveAllowance>{
    LeaveAllowanceController(){
        super(LeaveAllowance)
    }

}
