package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class NewsController extends SimpleGenericRestfulController<News>{
    NewsController(){
        super(News)
    }

}
