package it.sevenbits.graphicartsindustry.core.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PolygraphyProvider {

    public static String findPolygraphies(final Map params) {
        String query = params.get("query").toString();
        List<Object> servicesObject = (List<Object>) params.get("servicesId");
        List<Integer> services = new ArrayList<Integer>();
        if (servicesObject != null) {
            for (Object object : servicesObject) {
                services.add(Integer.valueOf(object.toString()));
            }
        }
        Integer paymentMethod = Integer.valueOf(params.get("paymentMethodId").toString());
        Boolean writesTheCheck = Boolean.valueOf(params.get("writesTheCheck").toString());
        Integer deliveryMethod = Integer.valueOf(params.get("deliveryMethodId").toString());
        Boolean orderByEmail = Boolean.valueOf(params.get("orderByEmail").toString());

        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("SELECT DISTINCT ON (p.id) p.id AS polygraphy_id, p.name, p.displayed, c.address, c.phone");
        if (paymentMethod != null && paymentMethod != 0)
            sqlQuery.append(", ppm.payment_method_id");
        if (writesTheCheck != null && writesTheCheck.equals(true))
            sqlQuery.append(", writes_the_check");
        if (deliveryMethod != null && deliveryMethod != 0)
            sqlQuery.append(", pdm.delivery_method_id");
        if (orderByEmail != null && orderByEmail.equals(true))
            sqlQuery.append(", order_by_email");


        sqlQuery.append(" FROM polygraphy AS p");
        if (services.size() == 0) {
            sqlQuery.append(" LEFT JOIN polygraphies_services AS ps ON p.id=ps.polygraphy_id ");
            sqlQuery.append(" LEFT JOIN service AS s ON ps.service_id=s.id ");
        }
        if (paymentMethod != null && paymentMethod != 0)
            sqlQuery.append(" LEFT JOIN polygraphies_payment_methods AS ppm ON p.id=ppm.polygraphy_id ");
        if (deliveryMethod != null && deliveryMethod != 0)
            sqlQuery.append(" LEFT JOIN polygraphies_delivery_methods AS pdm ON p.id=pdm.polygraphy_id ");
        sqlQuery.append(" LEFT JOIN contact AS c ON p.id=c.polygraphy_id");


        sqlQuery.append(" WHERE p.displayed=true");
        if (query != null && !query.isEmpty()) {
            sqlQuery.append(" AND LOWER(p.name) ILIKE CONCAT('%', #{query}, '%')");
            sqlQuery.append(" OR LOWER(c.address) ILIKE CONCAT('%', #{query}, '%')");
        }

        if (services.size() != 0) {
            sqlQuery.append(" AND (SELECT COUNT(*) FROM polygraphies_services AS ps " +
                    "WHERE ps.polygraphy_id=p.id AND ps.service_id in (");
            for (int index = 0; index < services.size(); index++) {
                sqlQuery.append(services.get(index));
                if (index < services.size() - 1)
                    sqlQuery.append(",");
            }
            sqlQuery.append("))=").append(services.size());
        }

        if (services.size() == 0) {
            sqlQuery.append(" OR LOWER(s.name) ILIKE CONCAT('%', #{query}, '%')");
        }

        if (paymentMethod != null && paymentMethod != 0) {
            sqlQuery.append(" AND ppm.payment_method_id=").append(paymentMethod);
        }

        if (writesTheCheck != null && writesTheCheck.equals(true)) {
            sqlQuery.append(" AND writes_the_check=true");
        }

        if (deliveryMethod != null && deliveryMethod != 0) {
            sqlQuery.append(" AND pdm.delivery_method_id=").append(deliveryMethod);
        }

        if (orderByEmail != null && orderByEmail.equals(true)) {
            sqlQuery.append(" AND order_by_email=true");
        }

        return sqlQuery.toString();
    }
}
