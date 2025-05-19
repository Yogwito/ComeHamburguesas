/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz {@link GraphicContainer} que maneja una colección de objetos {@link Sprite}.
 * 
 * Proporciona métodos para obtener la lista de sprites y agregar nuevos sprites al contenedor.
 * 
 * @author Juans & Trujirendjj
 */
public class SpriteContainer implements GraphicContainer {

    /** Lista que almacena los sprites gestionados por el contenedor. */
    private List<Sprite> sprites = new ArrayList<>();

    /**
     * Obtiene la lista de sprites almacenados en el contenedor.
     * 
     * @return lista de objetos {@code Sprite}.
     */
    @Override
    public List<Sprite> getSprites() {
        return sprites;
    }

    /**
     * Agrega un sprite a la colección gestionada por el contenedor.
     * 
     * @param sprite el sprite que se desea agregar.
     */
    @Override
    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }
}
