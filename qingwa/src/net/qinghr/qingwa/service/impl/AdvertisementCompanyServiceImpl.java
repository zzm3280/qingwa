package net.qinghr.qingwa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.qinghr.qingwa.dao.AdvertisementCompanyDAO;
import net.qinghr.qingwa.service.AdvertisementCompanyService;
import net.qinghr.qingwa.util.Pager;
import net.qinghr.qingwa.vo.AdvertisementCompany;
@Transactional
@Service("advertisementCompanyService")
public class AdvertisementCompanyServiceImpl implements
		AdvertisementCompanyService {
	@Resource
	private AdvertisementCompanyDAO advertisementCompanyDAO;
	
	@Override
	public void save(AdvertisementCompany object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(AdvertisementCompany object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(AdvertisementCompany object) {
		// TODO Auto-generated method stub

	}

	@Override
	public AdvertisementCompany findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertisementCompany> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertisementCompany> findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertisementCompany> findAll(Pager pager,
			AdvertisementCompany object) {
		// TODO Auto-generated method stub
		return null;
	}

}
