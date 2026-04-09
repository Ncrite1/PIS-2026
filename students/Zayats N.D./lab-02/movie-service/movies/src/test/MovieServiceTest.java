import com.example.movies.application.service.MovieService;
import com.example.movies.application.port.out.MovieRepository;
import com.example.movies.domain.model.Movie;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MovieServiceTest {

    @Test
    void testSearchAndGet() {
        MovieRepository repo = mock(MovieRepository.class);
        Movie movie = new Movie(1L, "Action", "Action", 2021, 7.5, "Exciting");
        when(repo.findByFilters("Action", 2021, 7.0)).thenReturn(List.of(movie));
        when(repo.findById(1L)).thenReturn(Optional.of(movie));
        when(repo.findById(999L)).thenReturn(Optional.empty());

        MovieService service = new MovieService(repo);

        assertEquals(1, service.search("Action", 2021, 7.0).size());
        assertEquals("Action", service.getById(1L).getTitle());
        assertThrows(RuntimeException.class, () -> service.getById(999L));
    }
}