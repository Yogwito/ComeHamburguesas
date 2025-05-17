/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import sprite.SpriteMobile;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author juans
 */

public class Veneno extends SpriteMobile {

    private Image imagen;

    public Veneno(int x, int y, int width, int height) {
        super(x, y, width, height);
        imagen = new ImageIcon(getClass().getResource("/resources/Venom.png")).getImage();
    }

    @Override
    public void checkCollision() {
        // TODO: colisión con jugador
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }
}
