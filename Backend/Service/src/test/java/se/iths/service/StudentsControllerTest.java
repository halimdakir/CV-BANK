package se.iths.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest(controllers = StudentsController.class)
public class StudentsControllerTest {

    @MockBean
    StudentsRepository repository;

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setup() {
        when(repository.findAll()).thenReturn(List.of(
                new Student(1, "Anton", "Johansson", "Java"),
                new Student(2, "Patrik", "Andersson", "Web")));
        when(repository.findById(1)).thenReturn(Optional.of(new Student(1, "Anton", "Johansson", "Java")));

    }

    @Test
    @DisplayName("Calls GET method with url /api/v1/students")
    void getAllReturnsListOfAllStudents() throws Exception {

        mockMvc.perform(
                get("/api/v1/students").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content()
                        .json("[{\"id\"=1,\"firstName\"=\"Anton\",\"lastName\"=\"Johansson\",\"education\"=\"Java\"},{\"id\"=2,\"firstName\"=\"Patrik\",\"lastName\"=\"Andersson\",\"education\"=\"Web\"}]"));
    }

    @Test
    @DisplayName("Calls Get method with url /api/v1/students/1")
    void getOneStudentWithIdOne() throws Exception {
        mockMvc.perform(get("/api/v1/students/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(content()
                        .json("{\"id\"=1,\"firstName\"=\"Anton\",\"lastName\"=\"Johansson\",\"education\"=\"Java\"}"));
    }

    @Test
    @DisplayName("Calls Get method with url /api/v1/students/3")
    void getOneStudentWithIdThree() throws Exception {
        mockMvc.perform(get("/api/v1/students/3").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
