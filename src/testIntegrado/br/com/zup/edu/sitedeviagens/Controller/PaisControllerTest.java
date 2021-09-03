package br.com.zup.edu.sitedeviagens.Controller;

import br.com.zup.edu.sitedeviagens.controller.form.PaisForm;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.repository.PaisRepository;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PaisControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    PaisRepository paisRepository;

    Gson gson = new Gson();

    @Test
    public void testePaisCadastradoComSucesso() throws Exception {

        PaisForm form = new PaisForm("Brasil");

        mockMvc.perform(MockMvcRequestBuilders.post("/paises")
                .content(gson.toJson(form))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nome").value(form.getNome()));
    }

    @Test
    public void naoDeveCadastrarPaisEmBranco() throws Exception {

        PaisForm form = new PaisForm("");

        mockMvc.perform(MockMvcRequestBuilders.post("/paises")
                        .content(gson.toJson(form))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").doesNotExist())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nome").doesNotExist());
    }
}