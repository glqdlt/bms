package com.glqdlt.bmsserver.controller.api.account;

import com.glqdlt.bmsserver.common.errors.ApiErrorMessage;
import com.glqdlt.bmsserver.common.errors.ApiException;
import com.glqdlt.bmscommon.persistence.members.entity.User;
import com.glqdlt.bmscommon.persistence.members.repo.MemberRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */
// TODO Spring 의 valid 구현
@Slf4j
@RequestMapping(value = "/account")
@RestController
public class AccountRestController {

    @Autowired
    MemberRepo memberRepo;

    @PostMapping(value = "/user/join")
    public ResponseEntity saveUser(@RequestBody User member) {

        log.debug("Request body : " + member.toString());

        if (member != null) {
            if (memberRepo.findById(member.getId()) == null) {
                memberRepo.save(member);
                return new ResponseEntity(HttpStatus.CREATED);
            }
        }
        throw new ApiException(ApiErrorMessage.BAD_REQUEST);
    }

    @GetMapping(value= "/user/detail/{userId}")
    public ResponseEntity findDetailUser(@PathVariable("userId") String id){
        return new ResponseEntity(HttpStatus.OK);
    }


}
