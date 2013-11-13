package jugsample

class Todo {

	String content
	Boolean completed
	Date dateCreated

    static constraints = {
    	content maxSize: 30
    }
}
