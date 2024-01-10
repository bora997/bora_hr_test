package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class LeaveSummaryController extends SimpleGenericRestfulController<LeaveSummary>{
    LeaveSummaryController(){
        super(LeaveSummary)
    }

}
