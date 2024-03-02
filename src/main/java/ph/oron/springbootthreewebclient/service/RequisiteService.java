package ph.oron.springbootthreewebclient.service;

import org.springframework.stereotype.Component;
import ph.oron.springbootthreewebclient.dto.Requisite;
import ph.oron.springbootthreewebclient.dto.RequisiteData;

@Component
public class RequisiteService {

    public RequisiteData retrieve(Requisite requisite) {

        System.out.println("Test retrieve");

        return new RequisiteData();
    }

}
