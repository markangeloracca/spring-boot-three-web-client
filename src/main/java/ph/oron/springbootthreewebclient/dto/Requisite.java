package ph.oron.springbootthreewebclient.dto;

public class Requisite {

    private String requisiteId;

    private String options;

    public Requisite() {
    }

    public Requisite(String requisiteId, String options) {
        this.requisiteId = requisiteId;
        this.options = options;
    }

    public String getRequisiteId() {
        return requisiteId;
    }

    public void setRequisiteId(String requisiteId) {
        this.requisiteId = requisiteId;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
