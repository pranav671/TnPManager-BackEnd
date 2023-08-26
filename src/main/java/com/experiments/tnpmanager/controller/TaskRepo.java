package com.experiments.tnpmanager.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.experiments.tnpmanager.model.Task;

public interface TaskRepo extends MongoRepository <Task, Integer> {
    
}
