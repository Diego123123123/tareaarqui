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
class Gun implements Weapon{
    public void fire() {
        checkIfThereAreBullets();
        pointEnemy();
        loadBullet();
        pressTrigger();
    }
    
    private void checkIfThereAreBullets() {
        System.out.println("GUN: VERIFICANDO SI HAY BALAS");
    }
    
    private void pointEnemy(){
        System.out.println("GUN: APUNTANDO AL ENEMIGO");
    }
    
    private void loadBullet(){
        System.out.println("GUN: CARGANDO BALA AL CAÑON");
    }
    private void pressTrigger(){
        System.out.println("GUN: PRESIONANDO EL GATILLO");
    }
}
