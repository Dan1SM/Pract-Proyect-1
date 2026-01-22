package com.example.taskmanager;
import com.example.taskmanager.model.Tarea;
import com.example.taskmanager.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    public Tarea createtarea(Tarea tarea){
        return tareaRepository.save(tarea);
    }

    public Tarea getTareaById(Long id){
        Optional<Tarea> optionalTarea = tareaRepository.findById(id);
        return optionalTarea.get();
    }

    public List<Tarea> getAllTarea(){
        return tareaRepository.findAll();
    }

    public void deleteTarea(Long id){
        tareaRepository.deleteById(id);
    }

}
