package com.create;

import com.create.service.ForeignInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 🛴-Create by: Mr.Z.J
 * ⏰-Date: 2021.01.20
 * 🍊-岂不尔思、子不我即
 **/
public class TestMain {

    public static void main(String[] args) {
        //api调用
//        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
//        Client client = factory.createClient("http://11.205.56.96:8080/ws/foreign?wsdl");
//        try {
//            Object[] result = client.invoke("Query");
//            for (Object res : result) {
//                if (res instanceof User){
//                    System.out.println("I am "+((User) res).getUsername());   //传送的对象在客户端和服务端全限定名一致
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //spring调用
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:application.xml");
        ForeignInterface foreign = ((ForeignInterface) context.getBean("foreign"));
        String queryUser = foreign.queryUser("");
        System.out.println(queryUser);
    }
}
