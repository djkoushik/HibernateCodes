import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ExecutableClass
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String argv[])
    {
        Configuration configuration = new Configuration();
        configuration.configure("Check.xml");
        Session session = configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Perosn perosn = new Perosn();
        System.out.println("Select the Mode of Payment");
        System.out.println("1.Wallets  2.NetBanking 3.CreditCard");
        String selection = scanner.next();
        if(selection.toLowerCase().equals("wallets") || selection.equals("1"))
        {
            perosn.setPaymentType("Wallets");
            Wallets wallets = new Wallets();
            System.out.println("Enter the Mobile_Number");
            wallets.setMobileNumber(scanner.nextLong());
            System.out.println("Enter the Password");
            wallets.setPassword(scanner.next());
            Set<Wallets> s1 = new LinkedHashSet<>();
            s1.add(wallets);
            perosn.setWallets(s1);
        }
        else if(selection.toLowerCase().equals("netbanking") || selection.equals("2"))
        {
            perosn.setPaymentType("Net Banking");
            NetBannking netBannking = new NetBannking();
            System.out.println("Enter the User_Id");
            netBannking.setUserId(scanner.next());
            System.out.println("Enter the Password");
            netBannking.setPassword(scanner.next());
            Set<NetBannking> set = new LinkedHashSet<>();
            set.add(netBannking);
            perosn.setNetBannkings(set);
        }
        else if(selection.toLowerCase().equals("creditcard")|| selection.toLowerCase().equals("3"))
        {
            perosn.setPaymentType("Credit Card");
            CreditCard creditCard = new CreditCard();
            System.out.println("Enter the Card_Number");
            creditCard.setCardNumber(scanner.nextLong());
            System.out.println("Enter the Name");
            creditCard.setName(scanner.next());
            System.out.println("Enter the Expiry");
            creditCard.setExpiry(scanner.next());
            System.out.println("Enter the cvv");
            creditCard.setCvv(scanner.nextInt());
            Set<CreditCard> set = new LinkedHashSet<>();
            set.add(creditCard);
            perosn.setCreditCards(set);
        }
        else
        {
            perosn.setCreditCards(null);
            perosn.setNetBannkings(null);
            perosn.setWallets(null);
            System.out.println("Next time Please enter the valid data");
        }

        session.save(perosn);
        transaction.commit();
    }
}
