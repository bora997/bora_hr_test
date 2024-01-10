package bora_hr_test

class EmployeeOt {

    Long employeeId
    Date checkInDate
    Date checkUotDate
    String description
    Date dateCreated
    Date lastUpdated
    static constraints = {
    }
    static mapping = {
        description sqlType: 'text'
    }
}
