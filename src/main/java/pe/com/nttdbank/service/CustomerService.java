package pe.com.nttdbank.service;

import java.util.List;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import pe.com.nttdbank.model.Customer;
import pe.com.nttdbank.repository.CustomerRepository;
import pe.com.nttdbank.utilities.State;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepository customerRepository;

    @Transactional
    public boolean createCustomer(Customer customer) {

        if (customer.a_customerId != null) {

            System.out.println("Customer already exists.");
            return false;
        }

        if (customerRepository.find("g_documentNumber", customer.g_documentNumber).count() != 0) {

            System.out.println("Document number already exists.");
            return false;
        }

        customerRepository.persist(customer);
        System.out.println("Client created successfully.");

        return true;
    };

    public List<Customer> findAllCustomers() {

        return customerRepository.listAll(Sort.by("a_customerId"));
    };

    public List<Customer> findAllActiveCustomers() {

        return customerRepository.list("state", Sort.by("a_customerId"), 1);
    }

    public Customer findCustomerById(Integer id) {

        return customerRepository.findById(id);
    };

    @Transactional
    public boolean updateCustomer(Customer customer) {

        if (customerRepository.findById(customer.a_customerId) != null) {

            Customer customerToUpdate = customerRepository.findById(customer.a_customerId);
            customerToUpdate.i_address = customer.i_address;
            customerToUpdate.j_phone = customer.j_phone;
            customerToUpdate.k_email = customer.k_email;

            return true;
        }

        System.out.println("Client does not exist.");
        return false;
    };

    @Transactional
    public boolean deleteCustomer(Integer id) {

        if(customerRepository.findById(id) != null) {

            Customer customerToUpdate = customerRepository.findById(id);
            customerToUpdate.l_state = State.INACTIVE.ordinal();

            return true;
        }

        System.out.println("Client does not exist.");

        return false;
    };
}
