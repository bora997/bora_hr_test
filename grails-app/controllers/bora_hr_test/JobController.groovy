package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class JobController extends SimpleGenericRestfulController<Job>{
    JobController(){
        super(Job)
    }

}
