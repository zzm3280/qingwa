package net.qinghr.qingwa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.qinghr.qingwa.dao.ResumeJobDAO;
import net.qinghr.qingwa.service.ResumeJobService;
import net.qinghr.qingwa.util.Pager;
import net.qinghr.qingwa.vo.ResumeJob;
@Transactional
@Service("resumeJobService")
public class ResumeJobServiceImpl implements ResumeJobService {
	@Resource
	private ResumeJobDAO resumeJobDAO;

	@Override
	public void save(ResumeJob object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ResumeJob object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ResumeJob object) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResumeJob findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResumeJob> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResumeJob> findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResumeJob> findAll(Pager pager, ResumeJob object) {
		// TODO Auto-generated method stub
		return null;
	}

}
