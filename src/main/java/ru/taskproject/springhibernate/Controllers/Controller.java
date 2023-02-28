package ru.taskproject.springhibernate.Controllers;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2RTFDTM;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
@GetMapping("/hello")
    public String sayHello(){
    return null;
}
}
