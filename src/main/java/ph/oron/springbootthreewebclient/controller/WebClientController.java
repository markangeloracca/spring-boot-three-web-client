package ph.oron.springbootthreewebclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ph.oron.springbootthreewebclient.dto.Requisite;
import ph.oron.springbootthreewebclient.service.RequisiteService;

@RestController
public class WebClientController {

    @Autowired
    private RequisiteService requisiteService;

    @PostMapping("/export-message")
    String sendMessage(@RequestBody Requisite requisite) {

        requisiteService.retrieve(requisite);

        return "Hello world!";
    }
}
