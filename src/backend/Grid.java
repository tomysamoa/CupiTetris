package backend;

import java.util.ArrayList;

public class Grid {
	private Bloque[][] grid = new Bloque[22][10];

	public Grid(){

		for (int i = 0; i < grid.length ; i++)
		{
		for (int  j = 0; j < grid[0].length; j++)
			{
				grid[i][j] = new vacio();
			}
		}
	}


	public int[] verificarLineas()
	{
		int lineasCompletas = 0;

		ArrayList<String> queFilas = new ArrayList<String>();

		for (int i = 0; i < grid.length; i++)
		{
			boolean lineaCompletada = true;
			
			Bloque primero = grid[i][0];
			
			for (int j = 0; j < grid.length && lineaCompletada; j++)
			{
				Bloque algunoDespues = grid[i][j];
				if (primero.darColor() == Bloque.VACIO)
				{
					lineaCompletada = false;
				}
				if (j == grid.length - 1 && lineaCompletada)
				{
					queFilas.add("" + i);
					
				}
			}
		}
		
		int[] filas = new int[queFilas.size()];
		
		for (int i = 0; i < queFilas.size(); i++)
		{
			filas[i] = Integer.parseInt(queFilas.get(i));
		}
		
		return filas;
	}
	
	
	public void actualizarGrid()
	{
		int[] deboEliminar = verificarLineas();
		
		
	}
}
