package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class HolidayController extends SimpleGenericRestfulController<Holiday>{
    HolidayController(){
        super(Holiday)
    }

}
