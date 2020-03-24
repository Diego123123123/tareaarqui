/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeandadapter;

/**
 *
 * @author  Diego Mejia, Marcelo Hidalgo
 */
class Tank {
    
    public void fireMissile() {
        checkIfThereAreMissilesAvailable();
        pointCanyonHorizontally();
        pointCanyonVertically();
        pressFireMissileButton();
    }
    
    private void pointCanyonHorizontally() {
        System.out.println("TANK: GIRANDO EL CAÑON HORIZONTALMENTE ");
    }
    
    private void pointCanyonVertically() {
        System.out.println("TANK: GIRANDO EL CAÑON VERTICALMENTE");
    }
    
    private void checkIfThereAreMissilesAvailable() {
        System.out.println("TANK: VERIFICANDO SI HAY MISILES");
    }
    private void pressFireMissileButton() {
        System.out.println("TANK: PRESIONANDO EL BOTON DE DISPARAR EL MISIL");
    }
}
