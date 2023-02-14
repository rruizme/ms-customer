package pe.com.nttdbank.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import pe.com.nttdbank.utilities.State;

@Entity
@Table(name = "customer")
public class Customer{

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    public Integer a_customerId;

    @Column(name = "names", nullable = false, length = 80)
    public String b_names;

    @Column(name = "first_last_name", nullable = false, length = 40)
    public String c_firstLastName;

    @Column(name = "second_last_name", nullable = false, length = 40)
    public String d_secondLastName;

    @Column(name = "business_name", nullable = false, length = 50)
    public String e_businessName;

    @Column(name = "document_type_code", nullable = false) // 0: inactivo, 1: activo
    public Character f_documentTypeCode;

    @Column(name = "document_number", nullable = false, length = 12, unique = true)
    public String g_documentNumber;

    @Column(name = "birthdate", nullable = false)
    public LocalDate h_birthdate;

    @Column(name = "address", nullable = true, length = 70)
    public String i_address;

    @Column(name = "phone", nullable = true, length = 9)
    public String j_phone;

    @Column(name = "email", nullable = true, length = 35)
    public String k_email;

    @Column(name = "state", nullable = false) // 0: DNI, 1: Carnet de Extranjería, 2: RUC
    public Integer l_state = State.ACTIVE.ordinal();
}
