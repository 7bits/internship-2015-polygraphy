package it.sevenbits.graphicartsindustry.core.repository;

import java.util.Map;

public class PolygraphyProvider {

    public static String findPolygraphies(final Map params) {
        String query = params.get("query").toString();

        String service = params.get("service").toString();
        int service_id = Integer.parseInt(service);

        String payment = params.get("payment").toString();
        int payment_id = Integer.parseInt(payment);

        String check = params.get("check").toString();
        boolean writes_the_check = Boolean.parseBoolean(check);

        String delivery = params.get("delivery").toString();
        int delivery_id = Integer.parseInt(delivery);

        String order = params.get("order").toString();
        boolean order_by_email = Boolean.parseBoolean(order);

        boolean somethingBefore = false;

        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("SELECT p.id AS polygraphy_id, p.name, c.addres, c.phone");
        if (service_id!=0)
            sqlQuery.append(", s.id");
        if (payment_id!=0)
            sqlQuery.append(", pm.id");
        if (writes_the_check==true)
            sqlQuery.append(", writes_the_check");
        if (delivery_id!=0)
            sqlQuery.append(", dm.id");
        if (order_by_email==true)
            sqlQuery.append(", order_by_email");

        sqlQuery.append(" FROM polygraphy AS p");
        if (service_id!=0)
            sqlQuery.append(" LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id " +
                    "LEFT JOIN service AS s ON ps.service_id=s.id");

        if (payment_id!=0)
            sqlQuery.append(" LEFT JOIN polygraphies_payment_methods AS ppm ON p.id=ppm.polygraphy_id " +
                    "LEFT JOIN payment_method AS pm ON ppm.payment_method_id=pm.id");

        if (delivery_id!=0)
            sqlQuery.append(" LEFT JOIN polygraphies_delivery_methods AS pdm ON p.id=pdm.polygraphy_id " +
                    "LEFT JOIN delivery_method AS dm ON pdm.delivery_method_id=dm.id");

        sqlQuery.append(" LEFT JOIN contacts AS c ON p.id=c.polygraphy_id");

        sqlQuery.append(" WHERE");
        if (!query.isEmpty()) {
            sqlQuery.append(" LOWER(p.name) ILIKE '%" + query + "%'");
            somethingBefore = true;
        }

        if (service_id!=0) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" s.id=" + service_id);
            somethingBefore = true;
        }

        if (payment_id!=0) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" pm.id=" + payment_id);
            somethingBefore = true;
        }

        if (writes_the_check==true) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" writes_the_check=true");
            somethingBefore = true;
        }

        if (delivery_id!=0) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" dm.id=" + delivery_id);
            somethingBefore = true;
        }

        if (order_by_email==true) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" order_by_email=true");
        }

        if (query.isEmpty() && service_id==0 && payment_id==0 && writes_the_check==false &&
                delivery_id==0 && order_by_email==false) {
            sqlQuery.append(" p.id=0");
        }

        return sqlQuery.toString();
    }
}
