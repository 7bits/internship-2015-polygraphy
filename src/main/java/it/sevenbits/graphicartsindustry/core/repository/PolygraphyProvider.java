package it.sevenbits.graphicartsindustry.core.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PolygraphyProvider {

    public static String findPolygraphies(final Map params) {
        String query = params.get("query").toString();

        String services = params.get("services").toString();
        List<Integer> service_id = new ArrayList<Integer>();
        if (services!=null) {
            char services_id_c[];
            String strEnd = services.replaceAll("\\D", "");
            services_id_c = strEnd.toCharArray();
            for (int index = 0; index < services_id_c.length; index++)
                service_id.add(Integer.parseInt(String.valueOf(services_id_c[index])));
        }

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
        sqlQuery.append("SELECT p.id AS polygraphy_id, p.name, p.displayed, c.address, c.phone");
//        if (service_id.size()!=0)
//            sqlQuery.append(", s.id");
        if (payment_id!=0)
            sqlQuery.append(", ppm.payment_method_id");
        if (writes_the_check==true)
            sqlQuery.append(", writes_the_check");
        if (delivery_id!=0)
            sqlQuery.append(", pdm.delivery_method_id");
        if (order_by_email==true)
            sqlQuery.append(", order_by_email");


        sqlQuery.append(" FROM polygraphy AS p");
        if (payment_id!=0)
            sqlQuery.append(" LEFT JOIN polygraphies_payment_methods AS ppm ON p.id=ppm.polygraphy_id ");
        if (delivery_id!=0)
            sqlQuery.append(" LEFT JOIN polygraphies_delivery_methods AS pdm ON p.id=pdm.polygraphy_id ");
        sqlQuery.append(" LEFT JOIN contact AS c ON p.id=c.polygraphy_id");


        sqlQuery.append(" WHERE p.displayed=true AND");
        if (!query.isEmpty()) {
            sqlQuery.append(" LOWER(p.name) ILIKE '%" + query + "%'");
            somethingBefore = true;
        }

        if (service_id.size()!=0) {
            if (service_id.get(0)!=0) {
                if (somethingBefore)
                    sqlQuery.append(" AND");
                sqlQuery.append(" (SELECT COUNT(*) FROM polygraphies_services AS ps " +
                        "WHERE ps.polygraphy_id=p.id AND ps.service_id in (");
                for (int index = 0; index < service_id.size(); index++) {
                    sqlQuery.append(service_id.get(index));
                    if (index < service_id.size() - 1)
                        sqlQuery.append(",");
                }
                sqlQuery.append("))=" + service_id.size());
                somethingBefore = true;
            }
        }

        if (payment_id!=0) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" ppm.payment_method_id=" + payment_id);
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
            sqlQuery.append(" pdm.delivery_method_id=" + delivery_id);
            somethingBefore = true;
        }

        if (order_by_email==true) {
            if (somethingBefore)
                sqlQuery.append(" AND");
            sqlQuery.append(" order_by_email=true");
        }

        if (query.isEmpty() && service_id.size()==0 && payment_id==0 && writes_the_check==false &&
                delivery_id==0 && order_by_email==false) {
            sqlQuery.append(" p.id=0");
        }

        return sqlQuery.toString();
    }
}
