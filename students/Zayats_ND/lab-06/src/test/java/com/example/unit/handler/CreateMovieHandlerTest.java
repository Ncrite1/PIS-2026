@ExtendWith(MockitoExtension.class)
class CreateMovieHandlerTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private CreateMovieHandler handler;

    @Test
    void shouldCreateMovie() {

        CreateMovieCommand command = new CreateMovieCommand(
                "Matrix",
                "SCI_FI",
                9.0,
                "AI world"
        );

        Movie movie = new Movie(
                1L,
                new MovieTitle("Matrix"),
                new Genre("SCI_FI"),
                new Rating(9.0),
                new Description("AI world")
        );

        when(movieRepository.save(any())).thenReturn(movie);

        Movie result = handler.handle(command);

        assertEquals("Matrix", result.getTitle().getValue());
        verify(movieRepository).save(any());
    }
}