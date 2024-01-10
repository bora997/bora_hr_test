package bora_hr_test

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(controller:'requestmap',action:'error500')
        "404"(view:'/notFound')
        //Employee
        "/api/v1/employee"(resources: "Employee")
        "/api/v1/employeeEducation"(resources: "EmployeeEducation")
        "/api/v1/employeeTraining"(resources: "EmployeeTraining")
        "/api/v1/employeeContact"(resources: "EmployeeContact")
        "/api/v1/employeeSalary"(resources: "EmployeeSalary")
        "/api/v1/employeeExperience"(resources: "EmployeeExperience")
        "/api/v1/employeeResign"(resources: "EmployeeResign")
        "/api/v1/employeeDependent"(resources: "EmployeeDependent")
        "/api/v1/employeeAttendant"(resources: "EmployeeAttendant")
        "/api/v1/employeeSkill"(resources: "EmployeeSkill")
        "/api/v1/employeeOt"(resources: "EmployeeOt")
        //leave
        "/api/v1/leaveAllowance"(resources: "LeaveAllowance")
        "/api/v1/leaveRequest"(resources: "LeaveRequest")
        "/api/v1/leaveSummary"(resources: "LeaveSummary")
        "/api/v1/leaveType"(resources: "LeaveType")
        "/api/v1/leaveOption"(resources: "LeaveOption")
        //holiday
        "/api/v1/holidayGroup"(resources: "HolidayGroup")
        "/api/v1/holiday"(resources: "Holiday")
        //News
        "/api/v1/news"(resources: "News")
        "/api/v1/newsType"(resources: "NewsType")
        //job
        "/api/v1/job"(resources: "Job")
        //master setup
        "/api/v1/dependentType"(resources: "DependentType")
        "/api/v1/position"(resources: "Position")
        "/api/v1/workingCalendar"(resources: "WorkingCalendar")


    }
}
