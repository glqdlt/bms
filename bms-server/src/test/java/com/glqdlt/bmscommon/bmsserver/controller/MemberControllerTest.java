package com.glqdlt.bmscommon.bmsserver.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import com.glqdlt.bmscommon.persistence.members.entity.User;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 3:57
 */
@WebAppConfiguration
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class MemberControllerTest {

    @Autowired
    @InjectMocks
    private MemberController memberController;

    private MockMvc mockMvc;

    @Before
    public void mockInit(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(memberController).build();
    }

    @Test
    public void contextLoads(){


    }

    @Test
    public void joinMember() throws Exception {
//        this use jackson-datbind ..

        Member user = new User().setEmail("test-email@com").setName("uset-user").setPassword("password").setId("user123");

        String jsonString = new Gson().toJson(user);

        log.info(jsonString);
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/member/join").content(jsonString))
                .andReturn();
        log.info(""+mvcResult.getResponse().getStatus());
        log.info(mvcResult.getResponse().getContentAsString());
    }


}