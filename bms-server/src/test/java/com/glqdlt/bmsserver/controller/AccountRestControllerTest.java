package com.glqdlt.bmsserver.controller;

import com.glqdlt.bmsserver.controller.api.AccountRestController;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import com.glqdlt.bmscommon.persistence.members.entity.User;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
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
 * On 2018-04-02
 */
@WebAppConfiguration
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class AccountRestControllerTest {

    @Autowired
    @InjectMocks
    private AccountRestController accountRestController;

    private MockMvc mockMvc;

    @Before
    public void mockInit(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(accountRestController).build();
    }

    @Test
    public void contextLoads(){


    }

    @Test
    public void joinMember() throws Exception {
        Member user = new User("user","password","username");
        user.changeEmail("hello@hello.com");

        String jsonString = new Gson().toJson(user);
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/account/user/join").contentType(MediaType.APPLICATION_JSON)
                .content(jsonString))
                .andReturn();

        Assert.assertEquals(201,mvcResult.getResponse().getStatus());
    }


}