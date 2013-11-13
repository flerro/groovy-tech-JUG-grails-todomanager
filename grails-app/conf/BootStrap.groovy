import jugsample.*

class BootStrap {

    def init = { servletContext ->

    	log.info("BootStrapping...")

    	new Todo(content: "Comprare il latte", completed: false).save()

    	new Todo(content: "Preparare il talk", completed: true).save()

    	log.info("Done!")
    }

    def destroy = {
    }
}
