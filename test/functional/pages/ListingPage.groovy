package pages

import geb.Page

class ListingPage extends Page {
		static url = "todo/list"
        
        static at = {
                title ==~ /Todos/
        }

        static content = {
                heading { $("h1") }
                message { $("div.message").text() }
        }
}