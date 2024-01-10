package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class LeaveTypeController extends SimpleGenericRestfulController<LeaveType> {
    LeaveTypeController(){
        super(LeaveType)
    }

}
