package net.qinghr.qingwa.service;

import java.util.List;

import net.qinghr.qingwa.util.Pager;

/**
 * 
 * @author 张子明
 *
 * @param <T> 泛型类型
 * 公共DAO接口，包含所有DAO接口共有的方法，被其它DAO继承
 */
public interface CommonService<T> {
	/**
	 * 
	 * @param object 对象实体
	 * 保存一个对象到数据库
	 */
	void save(T object);
	/**
	 * 
	 * @param object 对象实体
	 * 从数据库删除一个对象
	 */
	void delete(T object);
	/**
	 * 
	 * @param id 标志id
	 * 根据标志id从数据库删除一个对象
	 */
	void delete(Integer id);
	/**
	 * 
	 * @param object 对象实体
	 * 从数据库更新一个对象
	 */
	void update(T object);
	/**
	 * 
	 * @param id 标志id
	 * @return 对象实体
	 * 根据id在数据库查找一个对象并返回
	 */
	T findById(Integer id);
	/**
	 * 
	 * @return 对象的集合
	 * 查出所有对象并以集合的形式返回
	 */
	List<T> findAll();
	/**
	 * 
	 * @param pager 分页对象
	 * @return 对象的集合
	 * 根据分页的参数查找出一页的所有对象并以集合的形式返回
	 */
	List<T> findAll(Pager pager);
	/**
	 * 
	 * @param pager 分页对象
	 * @param object 对象实体
	 * @return 符合条件的集合
	 * 用于模糊查询，根据分页的参数和查询的条件以集合的形式返回符合条件的对象
	 */
	List<T> findAll(Pager pager,T object);
}
