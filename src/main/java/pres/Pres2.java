package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        //couplage faible instanciation dynamique
        //lire le fichier configuration
        Scanner s =new Scanner(new File("config.txt"));
        String daoClassName= s.nextLine();
        // instanciation dynamique cree un objet de type classe
        Class<?> cDao= Class.forName(daoClassName);
        //creation de objet qui est de type interface depend d'interface IDao pour pas dire  de quelle type de classe
        IDao dao=(IDao) cDao.newInstance();

         // creation d objet mteier

        String metierClassName=s.nextLine();
        Class<?> cMetier= Class.forName(metierClassName);
        Constructor<?> constructor = cMetier.getConstructor(IDao.class);
        IMetier metier = (IMetier) constructor.newInstance(dao);

        //IMetier metier=(IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);
        System.out.println("Resultat="+metier.calcul());
        //System.out.println(dao.getData());
        s.close();
    }
}
