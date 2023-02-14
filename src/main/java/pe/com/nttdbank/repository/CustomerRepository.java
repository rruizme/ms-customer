package pe.com.nttdbank.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import pe.com.nttdbank.model.Customer;

@ApplicationScoped
public class CustomerRepository implements PanacheRepositoryBase<Customer, Integer>{
    
}
