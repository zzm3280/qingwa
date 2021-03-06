package net.qinghr.qingwa.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import net.qinghr.qingwa.dao.CompanyPicDAO;
import net.qinghr.qingwa.util.Pager;
import net.qinghr.qingwa.vo.CompanyPic;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * Companypic entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see net.qinghr.qingwa.vo.CompanyPic
 * @author MyEclipse Persistence Tools
 */
@Repository("companyPicDAO")
public class CompanyPicDAOImpl implements CompanyPicDAO{
	private static final Logger log = LoggerFactory
			.getLogger(CompanyPicDAOImpl.class);
	// property constants
	public static final String TITLE = "title";
	public static final String PIC = "pic";
	@Resource
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(CompanyPic transientInstance) {
		log.debug("saving Companypic instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CompanyPic persistentInstance) {
		log.debug("deleting Companypic instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CompanyPic findById(java.lang.Integer id) {
		log.debug("getting Companypic instance with id: " + id);
		try {
			CompanyPic instance = (CompanyPic) getCurrentSession().get(
					"net.qinghr.qingwa.vo.Companypic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CompanyPic instance) {
		log.debug("finding Companypic instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("net.qinghr.qingwa.vo.Companypic")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Companypic instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Companypic as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByPic(Object pic) {
		return findByProperty(PIC, pic);
	}

	public List findAll() {
		log.debug("finding all Companypic instances");
		try {
			String queryString = "from Companypic";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CompanyPic merge(CompanyPic detachedInstance) {
		log.debug("merging Companypic instance");
		try {
			CompanyPic result = (CompanyPic) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CompanyPic instance) {
		log.debug("attaching dirty Companypic instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CompanyPic instance) {
		log.debug("attaching clean Companypic instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CompanyPicDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (CompanyPicDAOImpl) ctx.getBean("CompanypicDAO");
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