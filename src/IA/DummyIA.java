package IA;

import java.util.Random;

import Datos.GameData;
import Entidades.*;
import TiposDeDatos.*;

public class DummyIA implements IA{

	private static int modu = 80;
	private int i=1;
	private int k =1;
	
	
	
	public Coords ADondeVoy(Entidad e){
		
		int x = (int) e.getCuerpo().getPosicion().getX();
		if(x >= GameData.WindowSize.getWidth()-40){
			return Coords.izquierda;
		}
		if(x <= 0){
			return Coords.derecha;
		}
		if(i >= modu || new Random().nextInt(modu*2) <3){
			k *= -1;	
			i=0;
		}
		i++;
		
		//if(e.getVida()<50)
		//e.get

		return Coords.derecha.multK(k*e.getCuerpo().getVelocidadMaxima());
	}
	
}
