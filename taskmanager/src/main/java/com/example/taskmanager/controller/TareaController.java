package com.example.taskmanager.controller;

import com.example.taskmanager.TareaService;
import com.example.taskmanager.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @PostMapping
    public Tarea createTarea(Tarea tarea){
        return tareaService.createtarea(tarea);
    }

    @GetMapping
    public List<Tarea> getAllTarea(){
        return tareaService.getAllTarea();
    }

    @GetMapping("{id}")
    public Tarea searchTareaById(@PathVariable Long id){
        return tareaService.getTareaById(id);
    }

    @DeleteMapping("{id}")
    public void deleteTareaById(@PathVariable Long id){
        tareaService.deleteTarea(id);
    }
}
