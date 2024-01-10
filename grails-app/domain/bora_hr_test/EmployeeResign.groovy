package bora_hr_test

class EmployeeResign {

    Long employeeId
    Date resignDate
    String resignReason
    String description
    Date dateCreated

    static constraints = {
      }
    static mapping = {
        description sqlType: 'text'
    }
  }

