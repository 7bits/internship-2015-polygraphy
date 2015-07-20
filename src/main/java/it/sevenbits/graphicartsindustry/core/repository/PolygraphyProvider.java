package it.sevenbits.graphicartsindustry.core.repository;

import java.util.Map;

public class PolygraphyProvider {

    public static String findPolygraphies(final Map params) {
        String query = params.get("query").toString();
        String service = params.get("service").toString();
        int service_id = Integer.parseInt(service);
        String check = params.get("check").toString();
        boolean writes_the_check = Boolean.parseBoolean(check);
        String order = params.get("order").toString();
        boolean order_by_email = Boolean.parseBoolean(order);

        boolean somethingBefore = false;

        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("SELECT p.id AS polygraphy_id, p.name, c.addres, c.phone");
        if (service_id!=0)
            sqlQuery.append(", s.id");
        if (writes_the_check==true)
            sqlQuery.append(", writes_the_check");
        if (order_by_email==true)
            sqlQuery.append(", order_by_email");

        sqlQuery.append(" FROM polygraphy AS p");
        if (service_id!=0)
            sqlQuery.append(" LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id " +
                    "LEFT JOIN service AS s ON ps.service_id=s.id");
        sqlQuery.append(" LEFT JOIN contacts AS c ON p.id=c.polygraphy_id");

        sqlQuery.append(" WHERE");
        if (!query.isEmpty()) {
            sqlQuery.append(" p.name ILIKE '%" + query + "%'");
            somethingBefore = true;
        }

        if (service_id!=0) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" s.id=" + service_id);
            somethingBefore = true;
        }

        if (writes_the_check==true) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" writes_the_check=true");
            somethingBefore = true;
        }

        if (order_by_email==true) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" order_by_email=true");
        }
        return sqlQuery.toString();
    }
}
