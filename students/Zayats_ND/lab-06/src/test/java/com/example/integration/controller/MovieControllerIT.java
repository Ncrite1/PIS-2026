@SpringBootTest
@AutoConfigureMockMvc
class MovieControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateMovie() throws Exception {

        mockMvc.perform(post("/api/movies")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                        "title": "Interstellar",
                        "genre": "SCI_FI",
                        "rating": 9,
                        "description": "Space"
                    }
                """))
                .andExpect(status().isOk());
    }
}