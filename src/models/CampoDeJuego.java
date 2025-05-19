/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import sprite.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juans
 */

public class CampoDeJuego extends SpriteContainer {

    public CampoDeJuego() {
        super();
    }

    public void dibujarTodo(Graphics g) {
        for (Sprite s : getSprites()) {
            s.paint(g);
        }
    }

    @Override
    public void addSprite(Sprite sprite) {
        super.addSprite(sprite);
    }

    public void update() {
    
    }

    public int contarTipo(Class<?> tipo) {
        int count = 0;
        for (Sprite s : getSprites()) {
            if (tipo.isInstance(s)) count++;
        }
        return count;
    }

    public void moverTodo(Class<?> tipo, int velocidad) {
        for (Sprite s : getSprites()) {
            if (tipo.isInstance(s) && s instanceof SpriteMobile) {
                ((SpriteMobile) s).moverHaciaAbajo(velocidad);
            }
        }
    }

    public void removeSprite(Sprite s) {
        getSprites().remove(s);
    }

    public Sprite buscarElemento(int mouseX, int mouseY) {
        for (Sprite s : getSprites()) {
            if (mouseX >= s.getX() && mouseX <= s.getX() + s.getWidth() &&
                mouseY >= s.getY() && mouseY <= s.getY() + s.getHeight()) {
                return s;
            }
        }
        return null;
    }
    public List<Comida> comidasFueraDelLimite(int alturaVentana) {
        List<Comida> fuera = new ArrayList<>();
        for (Sprite s : getSprites()) {
            if (s instanceof Comida && s.getY() > alturaVentana) {
                fuera.add((Comida) s);
            }
        }
        return fuera;
    }
    public boolean hayColision(int x, int y, int ancho, int alto) {
        for (Sprite s : getSprites()) {
            if (x < s.getX() + s.getWidth() && x + ancho > s.getX() &&
                y < s.getY() + s.getHeight() && y + alto > s.getY()) {
                return true; // Hay colisión
            }
    }
    return false;
    }
    
    public List<Veneno> venenosFueraDelLimite(int alturaVentana) {
        List<Veneno> fuera = new ArrayList<>();
        for (Sprite s : getSprites()) {
            if (s instanceof Veneno && s.getY() > alturaVentana) {
                fuera.add((Veneno) s);
            }
        }
        return fuera;
    }
}
