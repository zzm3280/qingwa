package net.qinghr.qingwa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.qinghr.qingwa.dao.PersonalExperienceDAO;
import net.qinghr.qingwa.service.PersonalExperienceService;
import net.qinghr.qingwa.util.Pager;
import net.qinghr.qingwa.vo.PersonalExperience;
@Transactional
@Service("personalExperienceService")
public class PersonalExperienceServiceImpl implements PersonalExperienceService {
	@Resource
	private PersonalExperienceDAO personalExperienceDAO;

	@Override
	public void save(PersonalExperience object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(PersonalExperience object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(PersonalExperience object) {
		// TODO Auto-generated method stub

	}

	@Override
	public PersonalExperience findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonalExperience> findAll() {
		List<PersonalExperience> personalExperiences =  personalExperienceDAO.findAll();
		return personalExperiences;
	}

	@Override
	public List<PersonalExperience> findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonalExperience> findAll(Pager pager,
			PersonalExperience object) {
		// TODO Auto-generated method stub
		return null;
	}

}
