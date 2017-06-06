package view;

import controller.PromocaoDAO;

public class ViewListarPromocoes {
	
	public ViewListarPromocoes()
	{
		
	}
	public void Show(PromocaoDAO promocaoDAO)
	{
		promocaoDAO.listar();
	}
}
