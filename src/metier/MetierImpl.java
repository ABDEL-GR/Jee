package metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.Idao;
@Component("metier")
public class MetierImpl implements IMetier {
/*
 * couplage faible
 */
	@Autowired 
	
	private Idao dao=null;

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
		System.out.println("Initialisation de MetierImpl");
	}
	public MetierImpl() {
		System.out.println("Instanciation de m�tier");
	}
}
