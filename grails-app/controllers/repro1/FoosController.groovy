package repro1


import grails.rest.RestfulController

class FoosController extends RestfulController<Foo> {
    static responseFormats = ['json']

    FoosController() {
        super(Foo)
    }
}
