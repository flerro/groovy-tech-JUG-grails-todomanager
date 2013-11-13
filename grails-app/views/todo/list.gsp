<!DOCTYPE html>
<html>
<head>
  <title>Todos</title>
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'application.css')}" type="text/css">
</head>  
<body>

<div id="views">
<div id="tasks">
	<h1>JUG Grails Demo</h1>

	<g:if test="${flash.error}">
		<div id="alert">${flash.error}</div>
	</g:if>

	<g:render template="add"/>

	<ul class="items">
		<g:each in="${todos}" var="todo">
			<li class="item ${todo.completed ? 'done' : ''}"> 
				<div class="view">
					<g:render template="updateStatus" model="[todo: todo]"/>
					<span>${todo.content}</span>
					<a class="destroy" 
						href="${createLink(action: 'destroy', id: todo.id)}"></a>
				</div>
			</li>
		</g:each>
	</ul>

	<footer> 
		<div class="count">
			<span class="countVal">${uncompleted}</span> 
			non ${uncompleted != 1 ? "completati" : "completato"}
		</div> 
	</footer>
</div>
</div>

</body>
</html>

