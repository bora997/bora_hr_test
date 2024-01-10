package bora_hr_test

class WorkingCalendar {
    Long departmentId
    Long leaveOptionId
    String day
    Double workingDuration
    Boolean isWorkingDay
    Date dateCreated
    Date lastUpdated
    String timeInMorning
    String timeUotMorning
    static constraints = {
        workingDuration nullable: true
        isWorkingDay nullable: true
        timeInMorning nullable: true
        timeUotMorning nullable: true
    }
}
