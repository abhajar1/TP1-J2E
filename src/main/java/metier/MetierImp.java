package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements IMetier{
    // couplage faible


    private IDao dao;
    //injection via le constructeur

    public MetierImp(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul()  {
        double tmp=dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);

    }
    public void setDao(IDao dao)
    {
        this.dao=dao;
    }
}
