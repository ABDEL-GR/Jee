package metier;
import dao.Idao;

public class MetierImpl implements IMetier {
/*
 * couplage faible
 */
	private Idao dao;
	@Override
	public double calcul() {
		double data= dao.getData();
		double res=data*Math.PI;
		return res;
			
	}
	public void setDao(Idao dao) {
		this.dao = dao;
		System.out.println("Injection des dépendances");
	}
	public void init() {
		System.out.println("Instanciation de MetierImpl");
	}

}
