package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.CustomerDAO;
import com.accenture.lkm.dao.CustomerDAOIMPL;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;
import com.daoo.CustDao;

public class CustomerServiceIMPL implements CustomerService {
	
	public Integer addCustomer(CustomerBean customer) throws Exception {

		int customerId = 0;
		try {

			//EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			CustomerDAOIMPL dd=new CustomerDAOIMPL();

			 customerId = dd.addCustomer(customer);

		} catch (Exception exception) {
			throw exception;
		}

		return customerId;

	}

	

	

	
	public CustomerBean findCustomerById(Integer customerId) throws Exception {
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO employeeDAO = Factory.createCustomerDAO();

			customerBeanRet = employeeDAO.findCustomerById(customerId);

			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}


	@Override
	public CustomerBean updateCustomerBillById(CustomerBean customerBean)throws Exception{
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO employeeDAO = Factory.createCustomerDAO();

			customerBeanRet = employeeDAO.updateCustomerBillById(customerBean);
			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}


	@Override
	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO cutomerDAO = Factory.createCustomerDAO();

			
			// your code  goes here
			
			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound,Date upperBound) throws Exception{
		List<CustomerBean> list=null;
		try {
			CustomerDAO cutomerDAO = Factory.createCustomerDAO();
			
			// your code goes here
			
		} catch (Exception exception) {
			throw exception;
		}
		return list;
	}
	
	
	
	public Integer updateCustomerBillByName(String name, Double bill)throws Exception{
		Integer ret=null;
		try {
			CustomerDAO cutomerDAO = Factory.createCustomerDAO();
		
			
			// your code goes here
			
		} catch (Exception exception) {
			throw exception;
		}
		return ret;
	}

}
