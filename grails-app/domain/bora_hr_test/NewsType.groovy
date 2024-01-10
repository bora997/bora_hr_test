package bora_hr_test

class NewsType {
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
