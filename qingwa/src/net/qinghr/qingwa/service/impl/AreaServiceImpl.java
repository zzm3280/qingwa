package net.qinghr.qingwa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.qinghr.qingwa.dao.AreaDAO;
import net.qinghr.qingwa.service.AreaService;
import net.qinghr.qingwa.util.Pager;
import net.qinghr.qingwa.vo.Area;
@Transactional
@Service("areaService")
public class AreaServiceImpl implements AreaService {
	@Resource
	private AreaDAO areaDAO;

	@Override
	public void save(Area object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Area object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Area object) {
		// TODO Auto-generated method stub

	}

	@Override
	public Area findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> findAll() {
		List<Area> areas = areaDAO.findAll();
		return areas;
	}

	@Override
	public List<Area> findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> findAll(Pager pager, Area object) {
		// TODO Auto-generated method stub
		return null;
	}

}
