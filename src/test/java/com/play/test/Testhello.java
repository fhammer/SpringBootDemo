package com.play.test;


import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.play.boot.SpringBootApp;

@SpringBootTest
public class Testhello {
	private MockMvc mockMvc;

	  @Before
	  public void setUp() throws Exception {
	    mockMvc = MockMvcBuilders.standaloneSetup(new SpringBootApp()).build();
	  }

	  @Test
	  public void getHello() throws Exception {
	    mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
	    .andExpect(content().string(equalTo("Hello World!")));
	  }

	  @Test
	  public void getHello2() throws Exception {
	    mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
	    .andExpect(content().string(equalTo("[\"A\",\"B\",\"C\"]")));
	  }
}
