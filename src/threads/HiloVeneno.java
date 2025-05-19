/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import models.CampoDeJuego;
import models.Veneno;
import java.util.Random;
import javax.swing.JPanel;
import gui.VentanaJuego;
import java.util.List;

/**
 * @author Juans & Trujirendjj
 */
public class HiloVeneno implements Runnable {

<<<<<<< HEAD
public class HiloVeneno implements Runnable {

=======
    /** Referencia al campo de juego donde se gestionan los sprites. */
>>>>>>> b819558f8ee1f49b61828aa729ae0690f99d8c69
    private CampoDeJuego campo;

    /** Panel gráfico donde se pinta el juego. */
    private JPanel panel;

    /** Generador de números aleatorios para la posición horizontal de los venenos. */
    private Random random = new Random();

    /**
     * Constructor que inicializa el hilo con el campo de juego y el panel gráfico.
     * 
     * @param campo el campo de juego que contiene los sprites.
     * @param panel el panel donde se representa gráficamente el juego.
     */
    public HiloVeneno(CampoDeJuego campo, JPanel panel) {
        this.campo = campo;
        this.panel = panel;
    }

    /**
     * Método que contiene la lógica del hilo.
     */
    @Override
    public void run() {
        while (true) {
            // Generar veneno solo si hay menos de 4 activos
            if (campo.contarTipo(Veneno.class) < 4) {
                int x = random.nextInt(760); // 800 - ancho veneno
                if (!campo.hayColision(x, 0, 40, 40)) {
                    campo.addSprite(new Veneno(x, 0, 40, 40));
                }
            }

            campo.moverTodo(Veneno.class, 5);

            // Eliminar venenos que se salieron del panel
            List<Veneno> fuera = campo.venenosFueraDelLimite(panel.getHeight());
            for (Veneno v : fuera) {
                campo.removeSprite(v);
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
