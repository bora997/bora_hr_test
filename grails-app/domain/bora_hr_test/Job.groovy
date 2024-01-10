package bora_hr_test

class Job {
    String code
    String name
    String salaryRange
    String description
    static constraints = {
    }
    static mapping = {
        description sqlType: 'text'
    }
}
