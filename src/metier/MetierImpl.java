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
		System.out.println("Injection des d�pendances");
	}
	public void init() {
		System.out.println("Instanciation de MetierImpl");
	}

}
