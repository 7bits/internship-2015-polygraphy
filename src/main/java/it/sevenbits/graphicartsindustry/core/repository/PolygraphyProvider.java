package it.sevenbits.graphicartsindustry.core.repository;

import java.util.Map;

public class PolygraphyProvider {

    public static String findLikePolygraphies(final Map params) {

        String result = "SELECT id, name, addres, phone FROM polygraphy AS p LEFT JOIN contacts AS c " +
        "ON p.id=c.polygraphy_id WHERE name ILIKE '%"+params.get("query")+"%' LIMIT " +params.get("limit");
        return result;
    }
}
