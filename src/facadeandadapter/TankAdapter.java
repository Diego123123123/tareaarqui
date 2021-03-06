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
class TankAdapter implements Weapon {

    private Tank tank;
    public void setWeapon(Tank tank) {
        this.tank = tank;
    }

    public void fire() {
        Sensor sensor = new Sensor();
        HorizontalPointingSystem horizontalPointingSystem = new HorizontalPointingSystem();
        VerticalPointingSystem verticalPointingSystem = new VerticalPointingSystem();
        sensor.checkIfThereAreEnemies();
        horizontalPointingSystem.point();
        verticalPointingSystem.point();
        tank.fireMissile();
    }
    
}
