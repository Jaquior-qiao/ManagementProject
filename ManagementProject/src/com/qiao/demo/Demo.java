package com.qiao.demo;

import org.apache.commons.dbutils.QueryRunner;

import com.qiao.dao.CustomerDao;
import com.qiao.domain.Customer;

import cn.itcast.commons.CommonUtils;
import cn.itcast.jdbc.TxQueryRunner;

/**
 * Created by codingBoy on 16/10/23.
 */
public class Demo
{
    QueryRunner qr=new TxQueryRunner();
    public static void main(String[] args)
    {
        CustomerDao customerDao=new CustomerDao();

        for (int i=0;i<1000;i++)
        {
            Customer customer=new Customer();
            customer.setId(CommonUtils.uuid());
            customer.setName("customer"+i);
            customer.setGender(i%2==0?"male":"female");
            customer.setPhone("13476"+i);
            customer.setEmail("customer"+i+"@163.com");
            customer.setDescription("helle world");

            customerDao.add(customer);
        }
    }
}
