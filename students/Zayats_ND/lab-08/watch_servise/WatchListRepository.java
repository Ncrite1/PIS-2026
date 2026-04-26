package org.example.src.infrastructure.adapter.out;

import org.example.src.application.port.out.WatchListRepository;
import org.example.src.domain.model.aggregates.WatchList;
import org.example.src.infrastructure.adapter.out.mapers.WatchListMapper;
import org.example.src.infrastructure.adapter.out.repository.WatchListJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// класс реализации обработки исхрдящих запросов для работы с бронями
@Component
public class WatchListRepository implements WatchListRepository {

  private final WatchListJpaRepository jpa;

  public WatchListRepository(@Autowired  WatchListJpaRepository jpa) {
    this.jpa = jpa;
  }

  @Override
  public WatchList save(WatchList WatchList) {
    var entity = WatchListMapper.toEntity(WatchList);
    var saved = jpa.save(entity);
    return WatchListMapper.toDomain(saved);
  }

  @Override
  public boolean isSlotAvailable(Long WatchId, WatchList WatchList) {
    return !jpa.existsByWatchIdAndStartTimeLessThanAndEndTimeGreaterThan(
      WatchId,
      WatchList.getSlot().end(),
      WatchList.getSlot().start()
    );
  }
}

