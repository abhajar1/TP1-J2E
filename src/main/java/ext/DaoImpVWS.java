package ext;

import dao.IDao;

public class DaoImpVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("vesion web service");

        return 90;
    }
}
