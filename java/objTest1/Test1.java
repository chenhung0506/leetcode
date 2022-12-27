import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1{
    public static void main(String[] args) {

        Date dt = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(dt); 
        c.add(Calendar.DATE, -1);
        dt = c.getTime();

        System.out.println(dt);
        System.out.println("=============");
        String trades = "";
        if(trades!="" && Integer.valueOf(trades)==0) {
           System.out.println("succeee");
        }
        Date expireDate = new Date();
        System.out.println(expireDate);
        List<AccountMt4> accounts = Arrays.asList(
            new AccountMt4(1,123,2),
            new AccountMt4(1,222,1),
            new AccountMt4(1,333,1)
        );
        System.out.println(accounts);
        Map<Integer, Set<Integer>> serverMap = accounts.stream()
        .collect(Collectors.groupingBy(AccountMt4::getDataSourceId, Collectors.mapping(AccountMt4::getAccount, Collectors.toSet())));
        System.out.println(serverMap);
    }

}