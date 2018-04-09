package com.example.demo.serviceImpl;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by liupengfei on 2018/4/9.
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "This is Hello words from HESSIAN Server. " + name;
    }
}
