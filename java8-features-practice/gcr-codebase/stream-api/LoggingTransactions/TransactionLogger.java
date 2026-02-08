package LoggingTransactions;

import java.util.*;
import java.time.*;

public class TransactionLogger {

    public static void main(String[] args) {

        List<String> transactions = Arrays.asList("TXN1001","TXN1002","TXN1003","TXN1004","TXN1005");

        System.out.println("Transaction Logs:");

        transactions.forEach(txnId -> {
            System.out.println(LocalDateTime.now()+" Transaction: " + txnId);
        });
    }
}
