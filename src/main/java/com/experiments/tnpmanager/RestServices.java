package com.experiments.tnpmanager;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.experiments.tnpmanager.controller.TaskRepo;
import com.experiments.tnpmanager.model.Task;

@RestController
public class RestServices {


    private TaskRepo repo;

    @RequestMapping("/getTasks")
    public List<Task> getAllTasks()
    {
        return repo.findAll();
    }

    @PostMapping("/newTask")
    public void newTask(@RequestBody Task task)
    {
        repo.save(task);
    }

    @PostMapping("/updateTask/")
    public String updateTask(@RequestBody Task requested)
    {
        try
        {
            Task task = repo.findById(requested.getId()).get();
            if(requested.getTitle() != null)
            
            return "OK";
        }
        catch(Exception e)
        {
            return "Error";
        }
    }
    
}
