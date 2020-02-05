package repro1

import geb.spock.GebSpec
import grails.gorm.transactions.Rollback
import grails.plugins.rest.client.RestBuilder
import grails.testing.mixin.integration.Integration
import org.springframework.http.HttpStatus

@Integration
@Rollback
class FooSpec extends GebSpec {
    void "test foo"() {
        when:
        def fooResponse = restBuilder().post("${baseUrl}/Foos") {
            json {
                message = "Bar"
            }
        }

        then:
        fooResponse.statusCode == HttpStatus.CREATED
    }

    RestBuilder restBuilder() {
        new RestBuilder()
    }
}
