package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface PolygraphyContactMapper {

    @Insert("INSERT INTO contact(polygraphy_id, address, email, website, phone) " +
            "VALUES (#{polygraphyId}, #{address}, #{email}, #{website}, #{phone})")
    void insertPolygraphyContacts(@Param("polygraphyId") final int polygraphyId,
                                  @Param("address") final String address,
                                  @Param("phone") final String phone,
                                  @Param("email") final String email,
                                  @Param("website") final String website);


    @Update("UPDATE contact " +
            "SET address=#{address} " +
            "WHERE polygraphy_id=#{id}")
    void updatePolygraphyAddress(@Param(value = "id") final int polygraphyId,
                                 @Param(value = "address") final String address);

    @Update("UPDATE contact " +
            "SET phone=#{phone} " +
            "WHERE polygraphy_id=#{id}")
    void updatePolygraphyPhone(@Param(value = "id") final int polygraphyId,
                               @Param(value = "phone") final String phone);

    @Update("UPDATE contact " +
            "SET email=#{email} " +
            "WHERE polygraphy_id=#{id}")
    void updatePolygraphyEmail(@Param(value = "id") final int polygraphyId,
                               @Param(value = "email") final String email);

    @Update("UPDATE contact " +
            "SET website=#{website} " +
            "WHERE polygraphy_id=#{id}")
    void updatePolygraphyWebsite(@Param(value = "id") final int polygraphyId,
                                 @Param(value = "website") final String website);


    @Delete("DELETE FROM contact " +
            "WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyContacts(@Param(value = "polygraphyId") final int polygraphyId);
}
