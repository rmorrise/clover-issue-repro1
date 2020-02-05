package repro1

import com.mycompany.oldjava.excessive.packagename.length.OldJavaParentClass
import com.newthing.NewGroovyInterface

class ApplicationController {
    static responseFormats = ['json']

    def index() {
        def parent = new OldJavaParentClass()
        def parentAsNew = parent as NewGroovyInterface
        def child = parentAsNew.getOldThing()
        respond([success: !!child])
    }
}
