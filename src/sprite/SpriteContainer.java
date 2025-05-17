/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juans
 */

public class SpriteContainer implements GraphicContainer {
    private List<Sprite> sprites = new ArrayList<>();

    @Override
    public List<Sprite> getSprites() {
        return sprites;
    }

    @Override
    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }
}
