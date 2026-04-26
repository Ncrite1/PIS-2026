package org.example.src.infrastructure.adapter.out;



import org.example.src.application.port.out.WatchRepository;
import org.example.src.domain.model.aggregates.Watch;
import org.example.src.infrastructure.adapter.out.entity.WatchReadEntity;
import org.example.src.infrastructure.adapter.out.mapers.WatchMapper;
import org.example.src.infrastructure.adapter.out.repository.WatchJpaRepository;
import org.example.src.infrastructure.adapter.out.repository.WatchReadJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class WatchRepository implements WatchRepository {

  private final WatchJpaRepository jpa;
  private final WatchReadJpaRepository readJpa;
  public WatchRepository(@Autowired WatchJpaRepository jpa,@Autowired WatchReadJpaRepository readJpa) {
      this.jpa = jpa;
      this.readJpa = readJpa;
  }

  @Override
  public Watch findById(Long id) {
    return jpa.findById(id)
      .map(WatchMapper::toDomain)
      .orElse(null);
  }

  @Override
  public List<WatchReadEntity> searchByName(String query) {
    if(query == null || query.isEmpty()){
      return readJpa.findAll()
              .stream()

              .toList();
    }
    return readJpa.findByNameContainingIgnoreCase(query)
      .stream()
      .toList();
  }

  @Override
  public Watch save(Watch Watch) {
    var entity = WatchMapper.toEntity(Watch);
    var saved = jpa.save(entity);
    return WatchMapper.toDomain(saved);
  }
}


