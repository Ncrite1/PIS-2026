package org.example.src.infrastructure.adapter.in;

import org.example.src.application.port.in.SearchWatchsUseCase;
import org.example.src.domain.model.aggregates.Watch;
import org.example.src.infrastructure.adapter.out.entity.WatchReadEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import java.util.List;

@RestController
@RequestMapping("/api/watch")
public class WatchController {

  private final SearchWatchsUseCase searchService;

  public WatchController(SearchWatchsUseCase searchService) {
    this.searchService = searchService;
  }

  @GetMapping
  public List<WatchReadEntity> search(@RequestParam String query) {
    return searchService.search(query);
  }
}
