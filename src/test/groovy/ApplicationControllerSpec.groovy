import grails.testing.web.controllers.ControllerUnitTest
import org.springframework.http.HttpStatus
import repro1.ApplicationController
import spock.lang.Specification

class ApplicationControllerSpec extends Specification implements ControllerUnitTest<ApplicationController> {
	void "index()"() {
		when:
		controller.response.format = 'json'
		controller.index()

		then:
		response.status == HttpStatus.OK.value()
		def responseJson = response.json
		responseJson != null
		responseJson.success == true
	}
}
