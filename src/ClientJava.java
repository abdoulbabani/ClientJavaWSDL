import proxy.BanqueService;
import proxy.BanquesWs;
import proxy.Compte;

import java.util.List;

public class ClientJava {
    public static void main(String[] args) {
        BanqueService stub=new BanquesWs().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDh(30));
        Compte cp=stub.getCompte(3L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cpts=stub.listComptes();
        cpts.forEach(c->{
            System.out.println("*-*-*-*-*-*-*") ;
            System.out.println(c.getCode());
            System.out.println(c.getSolde());


        });
    }
}
