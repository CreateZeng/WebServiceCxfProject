package com.create.service;

import com.create.pojo.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceClient;

/**
 * 🛴-Create by: Mr.Z.J
 * ⏰-Date: 2021.01.20
 * 🍊-岂不尔思、子不我即
 **/
@WebServiceClient
public interface ForeignInterface {

    @WebMethod
    public String queryUser(@WebParam(name = "username") String username);

    @WebMethod
    public String SaveUser(@WebParam(name = "age")Integer age,@WebParam(name = "username")String username);

    @WebMethod
    public User Query();
}
