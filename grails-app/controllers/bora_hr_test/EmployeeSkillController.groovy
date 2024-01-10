package bora_hr_test

import ecoinsoft.corebackend.simplegenericrestfulcontroller.generic.SimpleGenericRestfulController
import net.sf.ehcache.search.parser.MCriteria

class EmployeeSkillController extends SimpleGenericRestfulController<EmployeeSkill>{
    EmployeeSkillController(){
        super(EmployeeSkill)
    }

}
