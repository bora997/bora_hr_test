package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class LeaveRequestController extends SimpleGenericRestfulController<LeaveRequest>{
    LeaveRequestController(){
        super(LeaveRequest)
    }

}
