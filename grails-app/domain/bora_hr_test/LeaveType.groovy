package bora_hr_test

class LeaveType {
    String name
    String description
    Boolean isActive
    Integer allowanceDay
    Boolean isDeductible
    Date dateCreated
    Date lastUpdated

    static constraints = {
        description nullable: true
    }
    static mapping = {
        description sqlType: 'text'
    }
}
