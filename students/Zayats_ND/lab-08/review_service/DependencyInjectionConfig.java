package org.example.src.infrastructure.config;

import org.example.src.application.command.handler.CreateWatchListHandler;
import org.example.src.application.command.handler.CreateReviewHandler;
import org.example.src.application.port.in.SearchWatchsUseCase;
import org.example.src.application.port.out.WatchRepository;
import org.example.src.application.projection.WatchListProjection;
import org.example.src.application.projection.ReviewProjection;
import org.example.src.application.query.handler.GetWatchScheduleHandler;
import org.example.src.application.query.handler.SearchWatchsHandler;
import org.example.src.application.service.WatchListService;
import org.example.src.application.service.WatchService;
import org.example.src.application.service.ReviewService;
import org.example.src.application.service.ScheduleService;
import org.example.src.domain.model.aggregates.Review;
import org.example.src.infrastructure.adapter.in.WatchController;
import org.example.src.infrastructure.adapter.out.WatchListRepository;
import org.example.src.infrastructure.adapter.out.WatchRepository;
import org.example.src.infrastructure.adapter.out.repository.WatchListReadJpaRepository;
import org.example.src.infrastructure.adapter.out.repository.ReviewReadJpaRepository;
import org.example.src.infrastructure.adapter.out.reviewRepository;
import org.example.src.infrastructure.adapter.out.scheduleRepository;
import org.example.src.infrastructure.eventsbus.SimpleEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// класс для описания внедрения зависимостей

@Configuration
public class DependencyInjectionConfig {


    private final reviewRepository rRepository;

    private final SimpleEventBus eventBus;
    private final WatchListReadJpaRepository br;
    private final ReviewReadJpaRepository rr;

    public DependencyInjectionConfig( @Autowired WatchRepository cRepository, @Autowired reviewRepository rRepository,  @Autowired  SimpleEventBus eventBus,@Autowired WatchListReadJpaRepository br,@Autowired ReviewReadJpaRepository rr) {
        this.rRepository = rRepository;
        this.br = br;
        this.rr = rr;
        eventBus.register(new WatchListProjection(br));
        eventBus.register(new ReviewProjection(rr));
        this.eventBus = eventBus;
    }

    @Bean
    public ReviewService getReviewService(){
        CreateReviewHandler handler = new CreateReviewHandler(rRepository,eventBus);
        return new ReviewService(handler);
    }

}
