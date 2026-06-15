package com.example.demo_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Calci {
    
    @GetMapping("/calculator/{a}/{b}")
    public String calc2(@PathVariable int a, @PathVariable int b){
        StringBuilder sb = new StringBuilder();
        sb.append("add ").append(a+b).append("\n");
         sb.append("Sub ").append(a-b).append("\n");
         sb.append("mul ").append(a*b).append("\n");
         if(b !=0){
              sb.append("Quo ").append(a/b).append("\n");
         sb.append("Remainder  ").append(a%b).append("\n");
         }else{
            sb.append("Quotient Division by zero not allowed \n");
            sb.append("Remainder  Division by zero not allowed\n");
         }

         return "<pre>" + sb.toString() +"</pre>";//<pre> preserves formatting
         //String s = sb.toString() ;
         // return s;


    }
}
