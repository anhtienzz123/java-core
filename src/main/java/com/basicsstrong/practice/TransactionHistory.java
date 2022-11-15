package com.basicsstrong.practice;

import com.basicsstrong.annotation.Column;
import com.basicsstrong.annotation.PrimaryKey;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransactionHistory {

    @PrimaryKey
    @Column(name = "transaction_id")
    private long transactionId;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "amount")
    private int amount;

    public TransactionHistory(int accountNumber, String name, String transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.transactionType = transactionType;
        this.amount = amount;
    }
}
