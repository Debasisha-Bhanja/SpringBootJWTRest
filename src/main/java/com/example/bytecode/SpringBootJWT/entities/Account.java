package com.example.bytecode.SpringBootJWT.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@AllArgsConstructor @NoArgsConstructor  //for lombok (it generates constructors)
@Entity                                 //for JPA
@Table(name="accounts")                 //for JPA
public class Account  implements Serializable {   //Note that for JPA must implement serializable interface{

    @Getter @Setter                     //for lombok
    @NotEmpty @NotBlank @NotNull        //for JSR-303 validation
    @Id                                 //for JPA
    @Column(name="ID")                  //for JPA
    private String id;

    @Getter @Setter                     //for lombok
    @NotEmpty @NotBlank @NotNull        //for JSR-303 validation
    @Column(name="FK_USER")             //for JPA
    private String fkUser;

    @Getter @Setter                     //for lombok
    //@NotEmpty @NotBlank @NotNull        //for JSR-303 validation
    @Column(name="TOTAL")
    private Double total;

    /* Constructors, Getters and Setters automatically generated by lombok */

}
