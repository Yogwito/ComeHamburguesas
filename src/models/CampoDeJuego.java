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
 * 
 * @author Juans & Trujirendjj & JJDaza
 * 
 */
public class CampoDeJuego extends SpriteContainer {

    /**
     * Crea una nueva instancia de {@code CampoDeJuego}.
     */
    public CampoDeJuego() {
        super();
    }

    /**
     * Dibuja todos los sprites contenidos en el campo de juego.
     * 
     * @param g el contexto gráfico en el que se dibujan los sprites.
     */
    public void dibujarTodo(Graphics g) {
        for (Sprite s : getSprites()) {
            s.paint(g);
        }
    }

    /**
     * Agrega un nuevo sprite al campo de juego.
     * 
     * @param sprite el sprite a agregar.
     */
    @Override
    public void addSprite(Sprite sprite) {
        super.addSprite(sprite);
    }

    /**
     * Método destinado a actualizar el estado del campo de juego.
     * Actualmente no implementa ninguna lógica específica.
     */
    public void update() {
        // Lógica de actualización pendiente
    }

    /**
     * Cuenta cuántos sprites del tipo especificado existen en el campo de juego.
     * 
     * @param tipo la clase del tipo de sprite a contar.
     * @return el número de sprites del tipo dado.
     */
    public int contarTipo(Class<?> tipo) {
        int count = 0;
        for (Sprite s : getSprites()) {
            if (tipo.isInstance(s)) count++;
        }
        return count;
    }

    /**
     * Mueve todos los sprites del tipo especificado que sean móviles hacia abajo 
     * con una velocidad determinada.
     * 
     * @param tipo la clase del tipo de sprite a mover.
     * @param velocidad la velocidad con la que se moverán hacia abajo.
     */
    public void moverTodo(Class<?> tipo, int velocidad) {
        for (Sprite s : getSprites()) {
            if (tipo.isInstance(s) && s instanceof SpriteMobile) {
                ((SpriteMobile) s).moverHaciaAbajo(velocidad);
            }
        }
    }

    /**
     * Elimina un sprite del campo de juego.
     * 
     * @param s el sprite a eliminar.
     */
    public void removeSprite(Sprite s) {
        getSprites().remove(s);
    }

    /**
     * Busca un sprite que se encuentre en las coordenadas proporcionadas.
     * 
     * @param mouseX la coordenada X del punto a buscar.
     * @param mouseY la coordenada Y del punto a buscar.
     * @return el sprite encontrado en esa posición, o {@code null} si no hay ninguno.
     */
    public Sprite buscarElemento(int mouseX, int mouseY) {
        for (Sprite s : getSprites()) {
            if (mouseX >= s.getX() && mouseX <= s.getX() + s.getWidth() &&
                mouseY >= s.getY() && mouseY <= s.getY() + s.getHeight()) {
                return s;
            }
        }
        return null;
    }

    /**
     * Devuelve una lista de objetos {@link Comida} que se encuentran fuera del límite 
     * inferior de la ventana.
     * 
     * @param alturaVentana la altura límite de la ventana de juego.
     * @return una lista de comidas fuera del límite.
     */
    public List<Comida> comidasFueraDelLimite(int alturaVentana) {
        List<Comida> fuera = new ArrayList<>();
        for (Sprite s : getSprites()) {
            if (s instanceof Comida && s.getY() > alturaVentana) {
                fuera.add((Comida) s);
            }
        }
        return fuera;
    }
}
