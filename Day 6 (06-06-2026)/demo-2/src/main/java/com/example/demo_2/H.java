package com.example.demo_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class H {
 @GetMapping("/hi/{name}")
 public String display(@PathVariable String name){
    return "Hi " + name;
 }
 @GetMapping("/add1/{a}/{b}")
 public String display2(@PathVariable int a,@PathVariable int b){
   int s = a+b;
   return "Addition is : "+s;
  
 }
 @GetMapping("/calc/{op}/{a}/{b}")
    public String calculate(@PathVariable String op,
                            @PathVariable int a,
                            @PathVariable int b) {

        if(op.equals("add")) {
            return "Addition is : " + (a + b);
        }
        else if(op.equals("sub")) {
            return "Subtraction is : " + (a - b);
        }
        else if(op.equals("mul")) {
            return "Multiplication is : " + (a * b);
        }
        else if(op.equals("div")) {
            return "Division is : " + (a / b);
        }

        return "Invalid Operation";
    }
     @GetMapping("calc/oe/{a}/{b}")
      public String oddOrEven(@PathVariable int a,@PathVariable int b){
         int s = a+b;
         if(s%2==0){
            return "Sum is Even";
         }
         return "Sum is odd";
      }
     
      @GetMapping("/name/{name}")
         public String mine(@PathVariable String name) {

            String s = name.toLowerCase();

            if(s.equals("dhivyasri")) {
               return "This is my name";
            }

            return "This is not my name";
         }
         @GetMapping("/climate/{n}")
         public String climate(@PathVariable int n){
            if(n<=0){
               return "Shivering";
            }else if(n>=0 && n<=15){
               return "Chill";
            }
            else if(n>15 && n<24){
               return "Happy😁";
            }
            else if(n>24 && n<30){
               return "Towards Hot";
            }else if(n>30 && n<32){
               return "Hottter";
            }else{
               return "OMG😱";
            }
         }

         @GetMapping("/intro/{name}/{city}/{course}")
         public String intro(@PathVariable String name, @PathVariable String city,@PathVariable String course){
               return "Hello,I am"+name+" from"+city+",welcome to"+ course;
         }
      }
