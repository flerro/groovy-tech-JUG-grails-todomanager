<form action="${createLink(action: 'updateStatus', id: todo.id)}" method="POST" style="display:inline">
	<input type="hidden" name="id" value="${todo.id}">
	<input type="checkbox" onclick="submit()" name="complete" value="true"
		${todo.completed ? 'checked="checked"' : ''}>
</form>