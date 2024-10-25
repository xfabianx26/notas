package com.lista.notas.lista_notas.service;



import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lista.notas.lista_notas.model.Task;
import com.lista.notas.lista_notas.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Page<Task> findAll(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    public Optional<Task> findById(String id) {
        if (!ObjectId.isValid(id)) {
            return Optional.empty();
        }
        return taskRepository.findById(new ObjectId(id));
    }

    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(new ObjectId().toHexString());
        }
        return taskRepository.save(task);
    }

    public void deleteById(String id) {
        if (ObjectId.isValid(id)) {
            taskRepository.deleteById(new ObjectId(id));
        }
    }
    public Page<Task> searchTasks(String searchTerm, Pageable pageable) {
        return taskRepository.findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(searchTerm, searchTerm, pageable);
    }
}