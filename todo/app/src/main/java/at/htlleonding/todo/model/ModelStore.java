package at.htlleonding.todo.model;

import javax.inject.Inject;

import at.htlleonding.todo.util.store.Store;

public class ModelStore extends Store<Model> {
    @Inject
    ModelStore() {
        super(Model.class, new Model());
    }

    public void setTodos(Todo[] todos) {
        apply(model -> model.todos = todos);
    }

    public void toggleTodoCompleted(Long id) {
        apply(model -> {
            for (Todo todo : model.todos) {
                if (todo.id.equals(id)) {
                    todo.completed = !todo.completed;
                    break;
                }
            }
        });
    }
}
