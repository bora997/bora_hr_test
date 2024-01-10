package bora_hr_test

class LeaveRequest {

    Long leaveTypeId
    Long employeeId
    Date fromDate
    Date toDate
    Integer days
    String reason
    Boolean isFullDay
    String status
    Long reportToId
    Date approvedDate
    Long approveById
    Date rejectDate
    String rejectReason
    Long rejectById
    Date canceledDate
    static constraints = {
        reason nullable: true
        status nullable: true
        rejectDate nullable: true
        rejectReason nullable: true
        rejectById nullable: true
    }
}
