package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class HolidayGroupController extends SimpleGenericRestfulController<HolidayGroup>{
    HolidayGroupController(){
        super(HolidayGroup)
    }

}
