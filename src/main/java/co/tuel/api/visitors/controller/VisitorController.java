/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.tuel.api.visitors.controller;

import co.tuel.api.visitors.model.Visitor;
import co.tuel.api.visitors.repository.VisitorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juan.herrera
 */
@RestController
@RequestMapping("/api")
public class VisitorController {

    @Autowired
    VisitorRepository visitorRepository;

    @GetMapping("/visitors/{id}")
    public Visitor getById(@PathVariable("id") String id) {
        return visitorRepository.findById(Long.valueOf(id));
    }

    @GetMapping("/visitors")
    public List<Visitor> getAll() {
        return visitorRepository.findAll();
    }

    @PostMapping("/visitors")
    public Visitor save(@RequestBody Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    @PutMapping("/visitors")
    public Visitor update(@RequestBody Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    @DeleteMapping("/visitors/{id}")
    public void deletetById(@PathVariable("id") String id) {
        visitorRepository.deleteById(Long.valueOf(id));
    }

}
