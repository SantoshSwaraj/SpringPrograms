package co.santosh.dao;

import java.util.List;

import co.santosh.entity.MobilePhone;

public interface MobilePhoneDAO {
	public void saveMobile(MobilePhone mobilePhone);
	public void updateMobile(MobilePhone mobilePhone);
	public void deleteMobile(int product_id);
	public MobilePhone getMobilePhone(int product_id);
	public List getAllMobilePhone();
}
