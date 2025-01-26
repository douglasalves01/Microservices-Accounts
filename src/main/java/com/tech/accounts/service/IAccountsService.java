package com.tech.accounts.service;

import com.tech.accounts.dto.CustomerDto;
import com.tech.accounts.entity.Customer;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of account details is succesful or not
     */
    boolean deleteAccount(String mobileNumber);
}
