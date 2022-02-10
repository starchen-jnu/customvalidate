package com.star.customvalidate.validate;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author StarC
 * @Date 2022/2/10 14:54
 * @Description:
 */
@RestController
@RequestMapping("/test")
@Validated
public class ValidateController {
    @PostMapping("/user")
    @SneakyThrows
    public ReturnMsg createUser(@UniqueUser @NotConflictUser @Valid User user){
        return ReturnMsg.ok();
    }
}
