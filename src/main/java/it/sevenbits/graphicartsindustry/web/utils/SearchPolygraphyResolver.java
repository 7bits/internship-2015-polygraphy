package it.sevenbits.graphicartsindustry.web.utils;

public class SearchPolygraphyResolver {
    private int limitPolygraphies;
    private int limitServices;

    public SearchPolygraphyResolver() {
    }

    public SearchPolygraphyResolver(int limitPolygraphies, int limitServices) {
        this.limitPolygraphies = limitPolygraphies;
        this.limitServices = limitServices;
    }

    public int getLimitPolygraphies() {
        return limitPolygraphies;
    }

    public void setLimitPolygraphies(int limitPolygraphies) {
        this.limitPolygraphies = limitPolygraphies;
    }

    public int getLimitServices() {
        return limitServices;
    }

    public void setLimitServices(int limitServices) {
        this.limitServices = limitServices;
    }
}
