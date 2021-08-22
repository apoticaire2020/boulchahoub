package ma.pfe.module1.services;

import ma.pfe.module1.dao.IDemandDao;
import ma.pfe.module1.model.Demand;

public class ServiceImpl implements IService{
     IDemandDao dao;

	@Override
	public boolean insertDemand(Demand d) {
		// TODO Auto-generated method stub
		return dao.insert(d);
	}
	

}
