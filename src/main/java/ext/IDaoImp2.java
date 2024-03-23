package ext;

import dao.IDao;

public class IDaoImp2 implements IDao {
    @Override
    public double getData() {
        System.out.println("vesion capteur");
        double temp=6000;
        return temp;
    }
}
