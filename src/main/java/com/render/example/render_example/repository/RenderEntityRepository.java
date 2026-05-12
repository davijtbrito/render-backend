package com.render.example.render_example.repository;

import com.render.example.render_example.model.RenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenderEntityRepository extends JpaRepository<RenderEntity, Long> {
}
