package com.example.springboot.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

@RestController
public class MobileAppController {

    @Autowired
    private MobileAppService mobileAppService;

    @RequestMapping(value="/RegisterMobile")
    public String Register() throws GeneralSecurityException, IOException, SQLException {
        return mobileAppService.RegisterMobile();
    }
}
