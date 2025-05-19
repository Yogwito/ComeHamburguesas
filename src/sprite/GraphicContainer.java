/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;

import java.util.List;

/**
 * 
 * @author Juans & Trujirendjj
 */
public interface GraphicContainer {

    /**
     * Obtiene la lista de sprites almacenados en el contenedor.
     *
     * @return una lista de objetos {@code Sprite}.
     */
    List<Sprite> getSprites();

    /**
     * Agrega un nuevo sprite al contenedor.
     *
     * @param sprite el sprite que se desea agregar.
     */
    void addSprite(Sprite sprite);
}
