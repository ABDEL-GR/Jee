package ext;

import dao.Idao;

public class DaoImpv2 implements Idao {

	@Override
	public double getData() {
		/*
		 * Version WS
		 */
		System.out.println("Version web service");
		double data =12;
		return data;
	}

}
