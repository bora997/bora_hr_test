package bora_hr_test

class EmployeeExperience {

    Long employeeId
    String companyName
    String companyWebsite
    String jobTitle
    String description
    static constraints = {
        description nullable: true
    }
    static mapping = {
        description sqlType: 'text'
    }
}
