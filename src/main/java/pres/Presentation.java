package pres;
import dao.DaoImp;
import ext.IDaoImp2;
import metier.MetierImp;

public class Presentation {
    public static void main(String[] args) {
        IDaoImp2 dao=new IDaoImp2();
        DaoImp dao1=new DaoImp();

        //injection via le constructeur avec parametre
        MetierImp metier=new MetierImp(dao);
        //injection des dependance
        metier.setDao(dao);
        System.out.println("Resultat ="+metier.calcul());
    }
}
