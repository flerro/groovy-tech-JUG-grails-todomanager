package jugsample

import grails.converters.*

class TodoController {

    def index() { 
        redirect action: 'list'
    }

    def list() {
    	List allTodos = Todo.findAll()
        int totUncompleted = Todo.countByCompleted(false)
    	[todos: allTodos, uncompleted: totUncompleted]
    }

    def add() {
	   Todo todo = new Todo(params)
       todo.save()
	   redirect action: 'list'
    }

aaa
    def destroy(){
        Todo todo = Todo.findById(params.id)

        if (todo) {
            todo.delete()
        } else {
            flash.error = "Todo(${params.id}) NON trovato"
        }

        redirect action: 'list'
    }

    def updateStatus(Long id, boolean complete) {
        Todo todo = Todo.findById(id)

        if (todo) {
            todo.completed = complete
            todo.save()            
        } else {
            flash.error = "Todo(${id}) NON trovato"
        }

	    redirect action: 'list'
    }
}
