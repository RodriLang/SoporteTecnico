/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import st.entidades.enumerados.TipoProblema;

/**
 *
 * @author Matías Pacheco
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "especialidades")

@Entity
@Table(name = "problema")
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(length = 45, nullable = false)
    private TipoProblema tipo; //posible ENUM
    @ManyToMany(mappedBy = "problemas")
    private List<Especialidad> especialidades;
}
