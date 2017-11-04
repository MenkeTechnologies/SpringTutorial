package com.jakobmenke.spring_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("offersDao")
class OffersDAO {


    private NamedParameterJdbcTemplate dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = new NamedParameterJdbcTemplate(dataSource);
    }


    public Offer getOff(int id){

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id",id);

        return dataSource.queryForObject("select * from offers where id=:id", params, new RowMapper<Offer>() {
            @Nullable
            @Override
            public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return getTheRow(rs);
            }
        });

    }

    public boolean delete(int id){
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

        mapSqlParameterSource.addValue("id",id);
        return dataSource.update("delete from offers where id=:id", mapSqlParameterSource) == 1;

    }

    public List<Offer> getOffers(){

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name","jake");

        return dataSource.query("select * from offers where name=:name", params, new RowMapper<Offer>() {
            @Nullable
            @Override
            public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return getTheRow(rs);
            }
        });
    }

    private Offer getTheRow(ResultSet rs) throws SQLException {
        Offer offer = new Offer();
        offer.setId(rs.getInt("id"));
        offer.setName(rs.getString("name"));
        offer.setEmail(rs.getString("email"));
        offer.setText(rs.getString("text"));

        return offer;
    }
}
