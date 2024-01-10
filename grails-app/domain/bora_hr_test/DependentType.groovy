package bora_hr_test

class DependentType {
    String name
    String description
    Boolean isActive = true
    Date dateCreated
    Date lastUpdated
    static constraints = {
        description nullable: true
    }
}
