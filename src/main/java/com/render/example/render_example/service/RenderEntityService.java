package com.render.example.render_example.service;

import com.render.example.render_example.model.RenderEntity;
import com.render.example.render_example.repository.RenderEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenderEntityService {

    private final RenderEntityRepository repository;

    public RenderEntityService(RenderEntityRepository repository) {
        this.repository = repository;
    }

    public List<RenderEntity> getAllRenderEntities() {
        return repository.findAll();
    }

    public RenderEntity saveRenderEntity(RenderEntity entity) {
        return repository.save(entity);
    }
}
