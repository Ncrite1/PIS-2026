package org.example.src.infrastructure.adapter.in;


// класс реализации обработки входящих запросов для работы с бронями



import lombok.Data;
import org.example.src.application.command.CreateWatchListCommand;
import org.example.src.application.port.in.CreateWatchListUseCase;
import org.example.src.domain.model.aggregates.WatchList;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/WatchLists")
public class WatchListController {

  private final CreateWatchListUseCase WatchListService;

  public WatchListController(CreateWatchListUseCase WatchListService) {
    this.WatchListService = WatchListService;
  }

  @PostMapping
  public WatchList create(@RequestBody CreateWatchListRequest request) {
    CreateWatchListCommand cmd = new CreateWatchListCommand(
      request.getWatchId(),
      request.getUserId(),
      request.getStartTime(),
      request.getEndTime()
    );
    return WatchListService.create(cmd);
  }
}
@Data
class CreateWatchListRequest {

  private Long WatchId;
  private Long userId;

  private LocalDateTime startTime;
  private LocalDateTime endTime;

  public CreateWatchListRequest() {}

  public Long getWatchId() {
    return WatchId;
  }

  public void setWatchId(Long WatchId) {
    this.WatchId = WatchId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
  }
}





