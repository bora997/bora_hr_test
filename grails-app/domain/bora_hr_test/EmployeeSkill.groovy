package bora_hr_test

class EmployeeSkill {

    Long employeeId
    String name
    String description
    String experience
    static constraints = {
    }
    static mapping = {
        description sqlType: 'text'
    }
}
