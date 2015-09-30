package org.ReportServer.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;
import java.util.GregorianCalendar;

@Entity
public class ReportParams implements Serializable {

	private static final long serialVersionUID = -3901738985744850279L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private GregorianCalendar dataInicial;

	@Column(nullable = false)
	private GregorianCalendar dataFinal;

	@Column(length = 1024)
	private String senha;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ReportParams)) {
			return false;
		}
		ReportParams other = (ReportParams) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GregorianCalendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(GregorianCalendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public GregorianCalendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(GregorianCalendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (nome != null && !nome.trim().isEmpty())
			result += "nome: " + nome;
		if (senha != null && !senha.trim().isEmpty())
			result += ", senha: " + senha;
		return result;
	}
}