package bora_hr_test

class HolidayGroup {
    String name
    String description
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
    static mapping = {
        description sqlType: 'text'
    }
}
