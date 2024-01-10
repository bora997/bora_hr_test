package bora_hr_test

class Employee {
    String code
    String title
    String firstName
    String lastName
    String gender
    Date dateOfBirth
    String maritalStatus
    String nationality
    String language
    String phone
    String email
    String workingStatus
    Date joinedDate
    Date resignDate
    String profilePhoto
    String jobTitle
    Date dateCreated
    Date lastUpdated
    String status
    Integer secUserId

    static constraints = {
        dateOfBirth nullable: true
        code nullable: true
        title nullable: true
        maritalStatus nullable: true
        workingStatus nullable: true
        profilePhoto nullable: true
        status nullable: true
        joinedDate nullable: true
        resignDate nullable: true
        secUserId nullable: true

    }
}
