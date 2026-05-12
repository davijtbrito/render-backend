package com.render.example.render_example.controller;

import com.render.example.render_example.model.RenderEntity;
import com.render.example.render_example.repository.RenderEntityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/render-entities")
public class RenderEntityController {

    private final RenderEntityRepository repository;

    public RenderEntityController(RenderEntityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RenderEntity> getAllRenderEntities() {
        return repository.findAll();
    }

    @PostMapping
    public RenderEntity createRenderEntity(@RequestBody RenderEntity entity) {
        return repository.save(entity);
    }
}