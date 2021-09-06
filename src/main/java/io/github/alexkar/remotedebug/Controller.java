package io.github.alexkar.remotedebug;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/info")
    public String info() {
        return "Debugging Spring Application";
    }

}
