/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;
import java.util.List;

/**
 *
 * @author juans
 */

public interface GraphicContainer {
    List<Sprite> getSprites();
    void addSprite(Sprite sprite);
}
