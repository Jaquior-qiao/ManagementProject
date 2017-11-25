package com.qiao.service;

import com.qiao.dao.CustomerDao;
import com.qiao.domain.Customer;
import com.qiao.domain.PageBean;

/**
 *Practice by Jaquior_qiao on 17/11/24
 *Appreciate the person codingBoy,who give me a lot help 
 */
public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
	
	public void add(Customer customer){
		customerDao.add(customer);
	}
	
	public PageBean<Customer> findAll(int pc,int pr){
		return customerDao.findAll(pc, pr);
	}
	public Customer find(String id){
		return customerDao.find(id);
	}
	public void edit(Customer customer){
		customerDao.edit(customer);
	}
	public void delete(String id)
    {
        customerDao.delete(id);
    }

    public PageBean<Customer> query(Customer customer,int pc,int pr)
    {
        return customerDao.query(customer,pc,pr);


    }
}
