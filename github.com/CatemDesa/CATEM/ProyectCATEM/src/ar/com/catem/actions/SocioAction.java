package ar.com.catem.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.interceptor.validation.SkipValidation;

import ar.com.catem.controller.SocioController;
import ar.com.catem.model.EstadoCivil;
import ar.com.catem.model.Socio;
import ar.com.catem.model.TipoSocio;

import com.opensymphony.xwork2.ActionSupport;

public class SocioAction extends ActionSupport {

	private static final long serialVersionUID = 106086586587130947L;

	private Socio socio;
	private SocioController socioController = new SocioController();

	List<EstadoCivil> estados = new ArrayList<EstadoCivil>();
	List<TipoSocio> tiposSocio = new ArrayList<TipoSocio>();

	
	private Integer idTipoSocio;
	private String nroSocio;
	private String apellido;
	private String nombre;
	private String cel;
	private String nacionalidad;
	private Integer idEstadoCivil;
	private Date fechaNacimiento;
	private String dni;
	private String ocupacion;
	private String email;
	private Date fechaAlta;
	
	public SocioAction() {
		setEstados(socioController.getEstados());
		setTiposSocio(socioController.getTipoSocio());
	}

	@SkipValidation
	public String init() {
		setEstados(socioController.getEstados());
		setTiposSocio(socioController.getTipoSocio());
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		socioController = new SocioController();
		socio = new Socio();
		socio.setFechaAlta(new Date());
		socio.setIdTipoSocio(idTipoSocio);
		socio.setApellido(apellido);
		socio.setCel(cel);
		socio.setDni(dni);
		socio.setEmail(email);
		socio.setFechaNacimiento(fechaNacimiento);
		socio.setIdEstadoCivil(idEstadoCivil);
		socio.setNacionalidad(nacionalidad);
		socio.setOcupacion(ocupacion);
		socioController.createNewSocio(socio);

		return SUCCESS;
	}

	

	public SocioController getSocioController() {
		return socioController;
	}

	public void setSocioController(SocioController socioController) {
		this.socioController = socioController;
	}

	public List<EstadoCivil> getEstados() {
		return estados;
	}

	public void setEstados(List<EstadoCivil> estados) {
		this.estados = estados;
	}

	public List<TipoSocio> getTiposSocio() {
		return tiposSocio;
	}

	public void setTiposSocio(List<TipoSocio> tiposSocio) {
		this.tiposSocio = tiposSocio;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Integer getIdTipoSocio() {
		return idTipoSocio;
	}

	public void setIdTipoSocio(Integer idTipoSocio) {
		this.idTipoSocio = idTipoSocio;
	}

	public String getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(String nroSocio) {
		this.nroSocio = nroSocio;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	

}
