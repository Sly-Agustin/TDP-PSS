package Colisionador;

import Entidades.*;

public abstract class Colisionador 
{
//Interface Visitor
	
	
	
	//Metodos abstractos  vacios para que no molesten en las clases hijas
	public void afectarJugador(Player p) {}
	public void afectarEnemigo(Enemigo e) {}
	public void afectarObstaculo(Obstaculo o) {}
	public void afectarEnemigoKami(EnemigoKami ek) {}
	public void afectarEnemigoArmado(EnemigoArmado ea) {}
	public void afectarDisparo(Balazo balazo) {}
	
}
