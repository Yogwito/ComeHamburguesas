/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;

/**
 *
 * @author juans
 */
public abstract class SpriteMobile extends Sprite {

    public SpriteMobile(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    
    public void moverHaciaAbajo(int velocidad) {
    this.y += velocidad;
    }

}
