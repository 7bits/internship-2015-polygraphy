package it.sevenbits.graphicartsindustry.web.domain;

import it.sevenbits.graphicartsindustry.web.domain.search.PolygraphyMinModel;

import java.util.List;

public class PolygraphyResponse {
    private List<PolygraphyMinModel> polygraphies;
    private String polygraphiesListIsNull;

    public List<PolygraphyMinModel> getPolygraphies() {
        return polygraphies;
    }

    public void setPolygraphies(List<PolygraphyMinModel> polygraphies) {
        this.polygraphies = polygraphies;
    }

    public String getPolygraphiesListIsNull() {
        return polygraphiesListIsNull;
    }

    public void setPolygraphiesListIsNull(String polygraphiesListIsNull) {
        this.polygraphiesListIsNull = polygraphiesListIsNull;
    }
}
