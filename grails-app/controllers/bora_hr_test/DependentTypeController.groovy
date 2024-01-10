package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class DependentTypeController extends SimpleGenericRestfulController<DependentType>{
    DependentTypeController(){
        super(DependentType)
    }

}
