package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController

class NewsTypeController extends SimpleGenericRestfulController<NewsType>{

    NewsTypeController(){
        super(NewsType)
   }

}
