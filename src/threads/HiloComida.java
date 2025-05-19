/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.List;
import models.CampoDeJuego;
import models.Comida;
import java.util.Random;
import javax.swing.JPanel;
import gui.VentanaJuego;

/**
 * @author Juans & Trujirendjj
 */
public class HiloComida implements Runnable {

    /** Referencia al campo de juego donde se gestionan los sprites. */
    private CampoDeJuego campo;

    /** Panel gráfico donde se pinta el juego. */
    private JPanel panel;

    /** Generador de números aleatorios para la posición horizontal de las comidas. */
    private Random random = new Random();

    /**
     * Constructor que inicializa el hilo con el campo de juego y el panel gráfico.
     * 
     * @param campo el campo de juego que contiene los sprites.
     * @param panel el panel donde se representa gráficamente el juego.
     */
    public HiloComida(CampoDeJuego campo, JPanel panel) {
        this.campo = campo;
        this.panel = panel;
    }
    
    /**
     * Método que contiene la lógica del hilo.
     */
    @Override
    public void run() {
        while (true) {
            if (campo.contarTipo(Comida.class) < 4) {
                int x = random.nextInt(760);
                campo.addSprite(new Comida(x, 0, 40, 40));
            }

            campo.moverTodo(Comida.class, 5);

            // ✅ Aquí validamos si alguna comida se salió de la ventana
            List<Comida> fuera = campo.comidasFueraDelLimite(panel.getHeight());
            for (Comida c : fuera) {
                campo.removeSprite(c);
                VentanaJuego.restarPuntoPorCaida(); // método que resta 1 punto
            }

            panel.repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
