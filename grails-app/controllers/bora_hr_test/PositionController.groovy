package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class PositionController extends SimpleGenericRestfulController<Position>{
    PositionController(){
        super(Position)
    }

}
