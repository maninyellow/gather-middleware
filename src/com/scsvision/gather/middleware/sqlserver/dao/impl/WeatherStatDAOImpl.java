package com.scsvision.gather.middleware.sqlserver.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.scsvision.gather.middleware.sqlserver.dao.SqlFactory;
import com.scsvision.gather.middleware.sqlserver.dao.WeatherStatDAO;
import com.scsvision.gather.middleware.sqlserver.model.WeatherStat;
import com.scsvision.gather.middleware.sqlserver.model.rowmapper.WeatherStatRowMapper;

/**
 * WeatherStatDAOImpl
 * 
 * @author wangbinyu
 *         <p />
 *         Create at 2014 下午3:44:11
 */
@Repository
public class WeatherStatDAOImpl implements WeatherStatDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<WeatherStat> extract() {
		List<WeatherStat> list = jdbcTemplate.query(SqlFactory.getInstance()
				.listWst(), new WeatherStatRowMapper());
		return list;
	}

}
