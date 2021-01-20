package com.create.service.impl;

import com.create.pojo.User;
import com.create.service.ForeignInterface;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * 🛴-Create by: Mr.Z.J
 * ⏰-Date: 2021.01.20
 * 🍊-岂不尔思、子不我即
 **/
@WebService(endpointInterface = "com.create.service.ForeignInterface")
@Component("foreignInterfaceImpl")
public class ForeignInterfaceImpl implements ForeignInterface {

    public String queryUser(String username) {
        return "I am Mark.....";
    }

    public String SaveUser(Integer age, String username) {
        return "Save Success....";
    }

    public User Query() {
        System.out.println("有访问者进入");
        User user = new User();
        user.setUsername("Red");
        user.setAge(18);
        System.out.println("访问结束");
        return user;
    }


}
