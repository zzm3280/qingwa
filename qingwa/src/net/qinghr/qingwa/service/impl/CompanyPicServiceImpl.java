package net.qinghr.qingwa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.qinghr.qingwa.dao.CompanyPicDAO;
import net.qinghr.qingwa.service.CompanyPicService;
import net.qinghr.qingwa.util.Pager;
import net.qinghr.qingwa.vo.CompanyPic;
@Transactional
@Service("companyPicService")
public class CompanyPicServiceImpl implements CompanyPicService {
	@Resource
	private CompanyPicDAO companyPicDAO;

	@Override
	public void save(CompanyPic object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(CompanyPic object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(CompanyPic object) {
		// TODO Auto-generated method stub

	}

	@Override
	public CompanyPic findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyPic> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyPic> findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyPic> findAll(Pager pager, CompanyPic object) {
		// TODO Auto-generated method stub
		return null;
	}

}
