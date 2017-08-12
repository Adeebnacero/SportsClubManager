package com.example.demo.Services;

import com.example.demo.Domain.ContactDetails;
/**
 * Created by Adeebo on 2017/08/12.
 */
public interface ContactDetailsService {

    ContactDetails create(ContactDetails contact);
    ContactDetails read(String clubID);
    ContactDetails update(ContactDetails contact);
    void delete(String clubID);
}
