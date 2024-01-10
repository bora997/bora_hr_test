package bora_hr_test

import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
        JSON.registerObjectMarshaller(Date) {
            return it?.format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        }
    }
    def destroy = {
    }
}
