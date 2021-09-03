package java;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc
public class PaisControllerTest {

    @Autowired
    MockMvc mockMvc;

    Gson gson = new Gson();

    @Test
    public void testePaisCadastradoComSucesso() throws Exception {

        CategoriaForm form = new CategoriaForm("smartphone");

        mockMvc.perform( MockMvcRequestBuilders
                        .post("/categorias")
                        .content(gson.toJson(form))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());


    }



