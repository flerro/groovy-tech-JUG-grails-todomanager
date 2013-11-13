import geb.spock.GebReportingSpec

import spock.lang.*

import pages.*

@Stepwise
class TodoSpec extends GebReportingSpec {
        
        def "there are two todos"() {
                when:
                to ListPage
                then:
                todoRows.size() == 2
        }
        
        // def "add one todote"() {
        //         when:
        //         to ListPage
        //         then:
        //         todoRows.size() == 2
        // }
}