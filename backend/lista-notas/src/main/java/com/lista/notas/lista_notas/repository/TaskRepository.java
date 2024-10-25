package com.lista.notas.lista_notas.repository;


import org.springframework.data.domain.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;
import com.lista.notas.lista_notas.model.Task;

@Repository
public interface TaskRepository  extends MongoRepository<Task, ObjectId> {

    Page<Task> findAll(Pageable pageable);
    Page<Task> findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String title, String category, Pageable pageable);

}
