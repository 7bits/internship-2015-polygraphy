package it.sevenbits.graphicartsindustry.core.repository;

import java.util.Map;

public class PolygraphyProvider {

    // Polygraphy name

    public static String findPolygraphiesByName(final Map params) {
        String result = "SELECT id, name, addres, phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE name ILIKE '%" + params.get("query") + "%' ";
        return result;
    }

    // Polygraphy name and service

    public static String findPolygraphiesByService(final Map params) {
        String result = "SELECT p.id AS idp, p.name, s.id, c.addres, c.phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id " +
                "LEFT JOIN service AS s ON ps.service_id=s.id " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE s.id=" + params.get("id");
        return result;
    }

    public static String findPolygraphiesByNameAndService(final Map params) {
        String result = "SELECT p.id AS idp, p.name, s.id, c.addres, c.phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id " +
                "LEFT JOIN service AS s ON ps.service_id=s.id " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE p.name ILIKE '%" + params.get("query") + "%' AND s.id=" + params.get("id");
        return result;
    }

    // Polygraphy name, service, check

    public static String findPolygraphiesByCheck() {
        String result = "SELECT id , name, writes_the_check, addres, phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE writes_the_check=true";
        return result;
    }

    public static String findPolygraphiesByNameAndCheck(final Map params) {
        String result = "SELECT id, name, addres, phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE name ILIKE '%" + params.get("query") + "%' AND writes_the_check=true";
        return result;
    }

    public static String findPolygraphiesByServiceAndCheck(final Map params) {
        String result = "SELECT p.id AS idp, p.name, s.id, c.addres, c.phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id " +
                "LEFT JOIN service AS s ON ps.service_id=s.id " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE s.id=" + params.get("id") + " AND writes_the_check=true";
        return result;
    }

    public static String findPolygraphiesByNameAndServiceAndCheck(final Map params) {
        String result = "SELECT p.id AS idp, p.name, s.id, c.addres, c.phone " +
                "FROM polygraphy AS p " +
                "LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id " +
                "LEFT JOIN service AS s ON ps.service_id=s.id " +
                "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
                "WHERE p.name ILIKE '%" + params.get("query") + "%' AND s.id=" + params.get("id") +
                " AND writes_the_check=true";
        return result;
    }
}
