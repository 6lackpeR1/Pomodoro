package com.github.blythe

class TaskController {

	static scaffold = true

	def index = {
		def tasks = Task.findAllByStatus("Open", [sort: "deadline", order: "asc"])
		def tags = Tag.list(sort: "name", order: "asc")

		return [tasks: tasks, tags: tags]
	}
}
