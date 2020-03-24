/*
 * Universidad Catolica Boliviana "San Pablo"
 */
package facadeandadapter;

/**
 *
 * @author Diego Mejia, Marcelo Hidalgo
 */
public class Soldier {
    
    public static void main(String[] args) {
        Tank tank = new Tank();
        Gun gun = new Gun();
        TankAdapter tankAdapter = new TankAdapter();
        tankAdapter.setWeapon(tank);
        gun.fire();
        tankAdapter.fire();
    }
    
}
