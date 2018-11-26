package br.com.conciliasolucoes.product.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


@Entity(name="Menu" )
@Table(name = "Menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_generator")
	@SequenceGenerator(name="menu_generator", sequenceName = "menu_seq", allocationSize=50)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idParent", insertable = true, updatable = true, nullable = true)
	private Menu idParent;

	private String titulo;
	
	private String icon;
	
	private String url;
	
	private int ordem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu product = (Menu) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
