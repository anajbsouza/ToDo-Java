package todo.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import todo.todo.entity.Todo;
import todo.todo.service.TodoService;

@RestController
@RequestMapping("/todos")
@Tag(name = "Tarefas", description = "API para gerenciamento de tarefas")
public class TodoController {
    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @Operation(summary = "Criar uma nova tarefa", description = "Cria uma nova tarefa e a adiciona à lista")
    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }

    @Operation(summary = "Buscar todas as tarefas", description = "Retorna a lista de tarefas ordenadas por prioridade")
    @GetMapping
    List<Todo> read() {
        return todoService.read();
    }

    @Operation(summary = "Atualizar uma tarefa", description = "Atualiza os dados de uma tarefa existente")
    @PutMapping("{id}")
    List<Todo> update(@PathVariable("id") Long id, @RequestBody Todo todo) {
        return todoService.update(id, todo);
    }

    @Operation(summary = "Deletar uma tarefa", description = "Remove uma tarefa pelo ID")
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
