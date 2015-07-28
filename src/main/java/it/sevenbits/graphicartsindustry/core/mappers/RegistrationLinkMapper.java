package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface RegistrationLinkMapper {
    @Insert("INSERT INTO registration_links (link) VALUES (#{link})")
    void save(@Param(value = "link") final String registrationLink);

    @Delete("DELETE FROM subscriptions WHERE id = #{id}")
    void delete(@Param(value = "link") final String registrationLink);
}
