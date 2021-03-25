package dao;

public class DaoImpl implements Idao  {

	@Override
	public double getData() {
		System.out.println("Version base de données");
		double data=22;
		return data;
		
	}
	
	public void init() {
		System.out.println("Instanciation de Dao Impl");
	}

}
