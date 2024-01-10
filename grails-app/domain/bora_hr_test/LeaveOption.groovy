package bora_hr_test

class LeaveOption {
    Long departmentId
    Boolean isHaftDayRequest
    Boolean isAllowLeaveTransfer
    Boolean isSkipHoliday
    String description
    Date dateCreated
    Date lastUpdated
    static constraints = {
        description nullable: true
    }
    static mapping = {
        description sqlType: 'text'
    }
}
