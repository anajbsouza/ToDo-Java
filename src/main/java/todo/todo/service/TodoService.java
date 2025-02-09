package todo.todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import todo.todo.entity.Todo;
import todo.todo.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return read();
    }

    public List<Todo> read() {
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Long id, Todo todo) {
        if(!todoRepository.existsById(id)) throw new IllegalArgumentException("ID inválido: não é possível atualizar um item inexistente.");
        todo.setId(id);
        todoRepository.save(todo);
        return read();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return read();
    }
}
