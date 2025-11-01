package com.unaiz.user.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Admin APIs", description = "Endpoints for managing admin data")
public class AdminController {

    @GetMapping("/api/admin")
    public String adminAccess() {
        return "Welcome ADMIN — this is a restricted area!";
    }
}
