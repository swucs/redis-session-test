package com.example.redistest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class SessionTestController {

    private final HttpSession httpSession;

    @GetMapping("/setSession")
    public String setSession() {

        String userId = "swucs";
        httpSession.setAttribute("userId", userId);
        return "success";
    }


    @GetMapping("/getSession")
    public String getSession() {
        String userId = (String) httpSession.getAttribute("userId");
        return userId;
    }
}
