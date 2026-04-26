@ExtendWith(MockitoExtension.class)
class DeleteMovieHandlerTest {

    @Mock
    private MovieRepository repository;

    @InjectMocks
    private DeleteMovieHandler handler;

    @Test
    void shouldDeleteMovie() {

        Movie movie = new Movie(1L,
                new MovieTitle("Matrix"),
                new Genre("SCI_FI"),
                new Rating(9.0),
                new Description("AI world"));

        when(repository.findById(1L)).thenReturn(Optional.of(movie));

        handler.handle(new DeleteMovieCommand(1L));

        verify(repository).delete(movie);
    }
}