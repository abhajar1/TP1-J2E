package dao;


import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de donnés");

    return Math.random()*40;
    }
}
