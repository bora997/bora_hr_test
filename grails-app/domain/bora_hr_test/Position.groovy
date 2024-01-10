package bora_hr_test

class Position {
    String name
    String description
    Boolean isActive = true
    Date dateCreated
    Date lastUpdated
    static constraints = {
        description nullable: true
    }
    static mapping = {
        description sqlType: 'text'
    }
}
