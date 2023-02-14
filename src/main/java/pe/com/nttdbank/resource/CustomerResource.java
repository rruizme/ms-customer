package pe.com.nttdbank.resource;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import pe.com.nttdbank.model.Customer;
import pe.com.nttdbank.service.CustomerService;

@Path("/ms-customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class CustomerResource {

    @Inject
    CustomerService customerService;

    @POST
    @Path("/customer")
    public boolean createCustomer(Customer customer) {

        return customerService.createCustomer(customer);
    }

    @GET
    @Path("/customer")
    public List<Customer> listAllCustomers() {
        
        return customerService.findAllCustomers();
    }

    @GET
    @Path("/customer-active")
    public List<Customer> listAllActiveCustomers() {
        
        return customerService.findAllActiveCustomers();
    }

    @GET
    @Path("/customer/{id}")
    public Customer findCustomerById(@PathParam("id") Integer id) {

        return customerService.findCustomerById(id);
    }

    @PUT
    @Path("/customer")
    public boolean updateCustomer(Customer customer) {

        return customerService.updateCustomer(customer);
    }

    @DELETE
    @Path("/customer/{id}")
    public boolean deleteCustomer(@PathParam("id") Integer id) {

        return customerService.deleteCustomer(id);
    }
}
