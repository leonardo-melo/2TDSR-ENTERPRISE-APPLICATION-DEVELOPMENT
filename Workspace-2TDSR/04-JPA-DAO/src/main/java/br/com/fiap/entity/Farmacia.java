package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** T_FARMACIA
 * 		*cd_farmacia (NUMBER) (PK)
 * 		*nm_farmacia (VARCHAR2(50))
 * 		dt_aberto (DATE)
 * 		ds_tipo (VARCHAR2) (Enum)
 *		ds_plantao (NUMBER)
 *
 */

@Entity
@Table(name = "T_FARMACIA")
@SequenceGenerator(name = "farmacia", sequenceName = "SQ_T_FARMACIA", allocationSize = 1)
public class Farmacia {
	
	@Id
	@Column(name = "cd_farmacia")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmacia")
	private int codigo;
		
	@Column(name = "nm_farmacia", nullable = false, length = 50)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_aberto", nullable = false)
	private Calendar dt_aberto;
	
	@Column(name="ds_sexo")
	@Enumerated(EnumType.STRING)
	private Tipo ds_tipo;
		
	@Column(name="ds_sexo")
	private boolean  ds_plantao;
	
	
	

	
	public Farmacia() {
		super();
	}

	public Farmacia(int codigo, String nome, Calendar dt_aberto, Tipo ds_tipo, boolean ds_plantao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dt_aberto = dt_aberto;
		this.ds_tipo = ds_tipo;
		this.ds_plantao = ds_plantao;
	}

	
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDt_aberto() {
		return dt_aberto;
	}

	public void setDt_aberto(Calendar dt_aberto) {
		this.dt_aberto = dt_aberto;
	}

	public Tipo getDs_tipo() {
		return ds_tipo;
	}

	public void setDs_tipo(Tipo ds_tipo) {
		this.ds_tipo = ds_tipo;
	}

	public boolean getDs_plantao() {
		return ds_plantao;
	}

	public void setDs_plantao(boolean ds_plantao) {
		this.ds_plantao = ds_plantao;
	}
	

}
