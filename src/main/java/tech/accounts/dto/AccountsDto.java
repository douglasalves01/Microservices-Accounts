package tech.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

public class AccountsDto {
    @NotEmpty
    @Pattern(regexp = "($|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotEmpty
    @Column(name = "account_type")
    private String accountType;
    @NotEmpty
    @Column(name = "branch_address")
    private String branchAddress;

    public AccountsDto(Long accountNumber, String accountType, String branchAddress) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchAddress = branchAddress;
    }

    public AccountsDto() {
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "AccountsDto{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                '}';
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountsDto that = (AccountsDto) o;
        return Objects.equals(accountNumber, that.accountNumber) && Objects.equals(accountType, that.accountType) && Objects.equals(branchAddress, that.branchAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountType, branchAddress);
    }
}
