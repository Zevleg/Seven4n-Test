package com.seven4n.service;

import java.util.List;

import javax.ejb.Local;

import org.primefaces.model.UploadedFile;

import com.seven4n.vo.ThomClienteVO;

@Local
public interface ThomClienteService {

	public List<ThomClienteVO> listarClientes();

	public void registrarCliente(ThomClienteVO thomClienteVO, UploadedFile file, String nombreArchivo);
	
	public String guardarLogoEnFicheroTemp(UploadedFile file, String nombreArchivo);
	
	public void guardarArchivosMultiple(UploadedFile file, String nombreArchivo);

	public void modificarCliente(ThomClienteVO thomClienteVO);

	public void eliminarCliente(ThomClienteVO thomClienteVO);
}
