package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.RegistrationLink;
import org.apache.ibatis.annotations.*;

public interface RegistrationLinkMapper {
    @Insert("INSERT INTO registration_links (link) VALUES (#{link})")
    void save(@Param(value = "link") final String registrationLink);

    @Delete("DELETE link FROM registration_links WHERE link = #{link}")
    void delete(@Param(value = "link") final String registrationLink);

    @Select("SELECT link FROM registration_links WHERE link = #{link}")
    @Results ({
            @Result (column = "link", property = "hash")
    })
    RegistrationLink find(String link);
}
