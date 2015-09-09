package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.*;

public interface PolygraphyContactMapper {

    @Select("SELECT polygraphy_id FROM contact " +
            "WHERE email=#{email}")
    @Result(column = "polygraphy_id")
    Integer getPolygraphyIdByEmail(@Param(value = "email") final String email);


    @Insert("INSERT INTO contact(polygraphy_id, address, email, website, phone) " +
            "VALUES (#{polygraphyId}, #{address}, #{email}, #{website}, #{phone})")
    void insertContacts(@Param("polygraphyId") final Integer polygraphyId,
                        @Param("address") final String address,
                        @Param("phone") final String phone,
                        @Param("email") final String email,
                        @Param("website") final String website);


    @Update("UPDATE contact " +
            "SET address=#{address} " +
            "WHERE polygraphy_id=#{id}")
    void updateAddress(@Param(value = "id") final Integer polygraphyId,
                       @Param(value = "address") final String address);

    @Update("UPDATE contact " +
            "SET phone=#{phone} " +
            "WHERE polygraphy_id=#{id}")
    void updatePhone(@Param(value = "id") final Integer polygraphyId,
                     @Param(value = "phone") final String phone);

    @Update("UPDATE contact " +
            "SET email=#{email} " +
            "WHERE polygraphy_id=#{id}")
    void updateEmail(@Param(value = "id") final Integer polygraphyId,
                     @Param(value = "email") final String email);

    @Update("UPDATE contact " +
            "SET website=#{website} " +
            "WHERE polygraphy_id=#{id}")
    void updateWebsite(@Param(value = "id") final Integer polygraphyId,
                       @Param(value = "website") final String website);


    @Delete("DELETE FROM contact " +
            "WHERE polygraphy_id=#{polygraphyId}")
    void deleteContacts(@Param(value = "polygraphyId") final Integer polygraphyId);
}
