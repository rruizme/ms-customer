package pe.com.nttdbank.model;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class AuditLog extends PanacheEntity{

    public int state;

    public int auditCreateUser;

    public LocalDateTime auditCreateDate;

    public int auditUpdateUser;

    public LocalDateTime auditUpdateDate;

    public int auditDeleteUser;

    public LocalDateTime auditDeleteDate;

}
