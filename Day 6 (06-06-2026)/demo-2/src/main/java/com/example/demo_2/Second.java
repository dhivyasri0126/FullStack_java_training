package com.example.demo_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Second {

    @GetMapping("/myhtml")
    public String sayHello() {
        
        return """
            <header style="color:red;background-color:pink;   
    background: #8F6067; 
    backdrop-filter: blur(10px);
    -webkit-backdrop-filter: blur(10px); 
    border: 1px solid rgba(255, 255, 255, 0.2);
    border-radius: 16px;
    box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1); text-align: center;"><h1>Rose Festival</header>
            <body bgcolor = "#FFE5B4">
            <p style="font-size:20px;text-align: justify;">
                A rose is either a woody perennial flowering plant of the genus Rosa, 
                in the family <i><b>Rosaceae</b></i>, or the flower it bears. 
                There are over three hundred species and tens of thousands of cultivars. 
                The plants range in size and form, from trailing and erect shrubs to 
                climbers up to 7 metres (23 ft) in height. Sharp prickles appear on 
                the stems of many species. Their flowers vary in size and shape and 
                are usually large and showy, in colours ranging from white through 
                pinks, reds, oranges and yellows.
            </p>
            <img src="https://cdn.britannica.com/99/96099-050-486AAD3A/tea-rose-garden-roses-plants-stem-flowers.jpg" 
                 width="500" height="450" align = "left"style="margin: 10px;">
                 <img src="rose_2.jpg" 
                 width="500" height="450" align = "right"style="margin: 10px;">
                 </body>
            """;
    }
}
