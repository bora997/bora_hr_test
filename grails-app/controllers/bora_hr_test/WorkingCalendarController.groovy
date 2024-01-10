package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class WorkingCalendarController extends SimpleGenericRestfulController<WorkingCalendar>{
    WorkingCalendarController(){
        super(WorkingCalendar)
    }
}
