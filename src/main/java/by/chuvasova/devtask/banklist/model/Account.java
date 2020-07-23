package by.chuvasova.devtask.banklist.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Account implements Comparable<Account> {

    private Integer id;
    private Integer account;
    private Integer userId;

    public Account(Integer account, Integer userId) {
        this.account = account;
        this.userId = userId;
    }

    @Override
    public int compareTo(Account a) {
        return id - a.id;
    }
}
