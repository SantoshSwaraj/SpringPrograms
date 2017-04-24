package co.santosh.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.santosh.entity.MobilePhone;

public class MobilePhoneDAOImpl implements MobilePhoneDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	@Transactional(readOnly=false)
	public void saveMobile(MobilePhone mobilePhone) {
		sessionfactory.getCurrentSession().save(mobilePhone);

	}
	
	@Transactional(readOnly=false)
	public void updateMobile(MobilePhone mobilePhone) {
		sessionfactory.getCurrentSession().update(mobilePhone);

	}
	
	@Transactional(readOnly=false)
	public void deleteMobile(int product_id) {
		sessionfactory.getCurrentSession().delete(getMobilePhone(product_id));
	}
	
	@Transactional(readOnly=true)
	public MobilePhone getMobilePhone(int product_id) {
		return (MobilePhone)sessionfactory.getCurrentSession().get(MobilePhone.class, product_id);
	}

	@Transactional(readOnly=true)
	public List<MobilePhone> getAllMobilePhone() {
		return (List<MobilePhone>)sessionfactory.getCurrentSession().createQuery("From MobilePhone").list();
	}

}
