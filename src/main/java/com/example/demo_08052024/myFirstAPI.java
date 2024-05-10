package com.example.demo_08052024;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myFirstAPI {
   
      //simple
   @RequestMapping("/hello")
   public String sayHello(){
      return "Hey, this is my first API";
   }

   //name
   @RequestMapping("/hello/{name}")
   public String myName(@PathVariable("name") String name){
      return "My name is "+ name;
   }

   //timesName
   @RequestMapping("/hello/{name}/{repeat}")
   public String nameTimes(@PathVariable("name") String name,
                           @PathVariable("repeat") int repeat){
      String time="";

      for (int i = 0; i < repeat; i++) {
         time += (i + 1 + " Hello " + name + " ");
         time+="<br>";
      }
      return time;

   }





}
