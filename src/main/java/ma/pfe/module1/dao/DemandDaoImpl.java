package ma.pfe.module1.dao;

import ma.pfe.module1.model.Demand;

public class DemandDaoImpl implements IDemandDao {

	private String url;
	private String mdp;
	private String user;
	
	
	
	public void setUrl(String url) {
		this.url = url;
	}



	public void setMdp(String mdp) {
		this.mdp = mdp;
	}



	public void setUser(String user) {
		this.user = user;
	}



	@Override
	public boolean insert(Demand d) {
		System.out.println("sql insert into ...." + d);
		return false;
	}

}
