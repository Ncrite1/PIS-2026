package org.example.src.infrastructure.config;

import org.example.src.application.command.handler.CreateWatchListHandler;
import org.example.src.application.projection.WatchListProjection;
import org.example.src.application.projection.ReviewProjection;
import org.example.src.application.service.WatchListService;
import org.example.src.infrastructure.adapter.out.WatchListRepository;
import org.example.src.infrastructure.adapter.out.repository.WatchListReadJpaRepository;
import org.example.src.infrastructure.adapter.out.repository.ReviewReadJpaRepository;
import org.example.src.infrastructure.eventsbus.SimpleEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// класс для описания внедрения зависимостей

@Configuration
public class DependencyInjectionConfig {


    private final WatchListRepository bRepository;
    private final SimpleEventBus eventBus;
    private final WatchListReadJpaRepository br;
    private final ReviewReadJpaRepository rr;

    public DependencyInjectionConfig(@Autowired WatchListRepository bRepository, @Autowired  SimpleEventBus eventBus,@Autowired WatchListReadJpaRepository br,@Autowired ReviewReadJpaRepository rr) {
        this.bRepository = bRepository;
        this.br = br;
        this.rr = rr;
        eventBus.register(new WatchListProjection(br));
        eventBus.register(new ReviewProjection(rr));
        this.eventBus = eventBus;
    }
    @Bean
    public WatchListService getWatchListService(){
        CreateWatchListHandler handler = new CreateWatchListHandler(bRepository,eventBus);
        return new WatchListService(handler);
    }
}
