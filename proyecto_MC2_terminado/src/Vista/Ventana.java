package Vista;

import Clases.Vertice;
import Clases.Arista;
import Logica.VerticesLogica;
import Logica.AristasLogica;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author jm543
 */
public class Ventana extends javax.swing.JFrame {

    private static int modo = 0;
    private static char identificador = 'a', v1 = ' ', v2 = ' ';
    private static int LineasI = 0;
    private static int xmouse = 0, ymouse = 0;
    private static int click = 0;
    private static int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    private static boolean MAdyacencia[][] = new boolean[VerticesLogica.getVertice().size()][VerticesLogica.getVertice().size()];
    private static List<String> listaString = new ArrayList<>();
    private static List<String> ListaCosos = new ArrayList<>();

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        rb1.setVisible(false);     
        this.setLocationRelativeTo(null);
        this.setTitle("Camino mas optimo de grafos");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        grafo1 = new Vista.Panel();
        btnClear = new javax.swing.JButton();
        btnArista = new javax.swing.JButton();
        btnVertice = new javax.swing.JButton();
        rb1 = new javax.swing.JRadioButton();
        coordenadas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbV1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbV2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(807, 710));

        grafo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        grafo1.setMinimumSize(new java.awt.Dimension(700, 559));
        grafo1.setPreferredSize(new java.awt.Dimension(722, 459));
        grafo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                grafo1MouseMoved(evt);
            }
        });
        grafo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grafo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout grafo1Layout = new javax.swing.GroupLayout(grafo1);
        grafo1.setLayout(grafo1Layout);
        grafo1Layout.setHorizontalGroup(
            grafo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        grafo1Layout.setVerticalGroup(
            grafo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        btnClear.setText("Borrar Todo");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnArista.setText("Arista");
        btnArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAristaActionPerformed(evt);
            }
        });

        btnVertice.setText("Vertice");
        btnVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerticeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb1);
        rb1.setText("v1");

        coordenadas.setText("coordenadas");

        jLabel5.setText("Vertice inicial");

        cbV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V1" }));

        jLabel6.setText("Vertice final");

        cbV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V2" }));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grafo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(14, 14, 14)
                                .addComponent(cbV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(14, 14, 14)
                                .addComponent(cbV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnCalcular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rb1)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(coordenadas)
                                .addGap(62, 62, 62)
                                .addComponent(btnArista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVertice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafo1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArista)
                            .addComponent(btnVertice)
                            .addComponent(btnClear)
                            .addComponent(coordenadas))
                        .addGap(10, 10, 10)
                        .addComponent(rb1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cbV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(cbV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerticeActionPerformed
        modo = 1;
    }//GEN-LAST:event_btnVerticeActionPerformed

    private void grafo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grafo1MouseClicked
        switch (modo) {
            case 0 ->
                JOptionPane.showMessageDialog(this, "Seleccione una opción");
            case 1 -> {
                try {
                    identificador = 'a';
                    for (Vertice object : VerticesLogica.getVertice()) {
                        if (object.getIdentificador() == identificador && (identificador >= 'a' && identificador <= 'z')) {
                            identificador++;
                        }
                    }
                } catch (Exception e) {
                }
                Vertice vertice = new Vertice(identificador, xmouse, ymouse);
                identificador++;
                VerticesLogica.addVertice(vertice);
                grafo1.repaint();
                llenarCb();
            }
            case 2 -> {
                if (VerticesLogica.getVertice().size() < 2) {
                    JOptionPane.showMessageDialog(this, "Ingrese al menos dos vertices");
                } else {
                    for (Vertice circulo1 : VerticesLogica.getVertice()) {
                        if (xmouse > circulo1.getX() - 20 && ymouse > circulo1.getY() - 20 && xmouse < circulo1.getX() + 20 && ymouse < circulo1.getY() + 20) {
                            if (click == 0) {
                                v1 = circulo1.getIdentificador();
                                x1 = circulo1.getX();
                                y1 = circulo1.getY();
                                rb1.setSelected(true);
                                click++;
                                break;
                            }
                            if (click == 1) {
                                v2 = circulo1.getIdentificador();
                                x2 = circulo1.getX();
                                y2 = circulo1.getY();
                                click++;
                                break;
                            }
                        }
                    }
                    if (click == 2) {
                        LineasI = 0;
                        for (Arista object : AristasLogica.getAristas()) {
                            if (LineasI == object.getIdentificador()) {
                                LineasI++;
                            }
                        }
                        Arista linea = new Arista(LineasI, v1, v2, x1, y1, x2, y2);
                        AristasLogica.addArista(linea);
                        buttonGroup1.clearSelection();
                        click = 0;
                    }
                }
                grafo1.repaint();
            }
            default ->
                throw new AssertionError();
        }
    }//GEN-LAST:event_grafo1MouseClicked

    private void grafo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grafo1MouseMoved
        try {
            Point punto = grafo1.getMousePosition();
            xmouse = (int) punto.getX();
            ymouse = (int) punto.getY();
            coordenadas.setText("(x,y)=(" + xmouse+","+ymouse+")");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_grafo1MouseMoved

    private void inicializar() {
        MAdyacencia = new boolean[VerticesLogica.getVertice().size()][VerticesLogica.getVertice().size()];
        for (int i = 0; i < VerticesLogica.getVertice().size(); i++) {
            for (int j = 0; j < VerticesLogica.getVertice().size(); j++) {
                for (int k = 0; k < AristasLogica.getAristas().size(); k++) {
                    if ((VerticesLogica.getVertice().get(i).getIdentificador() == AristasLogica.getAristas().get(k).getV1()
                            && VerticesLogica.getVertice().get(j).getIdentificador() == AristasLogica.getAristas().get(k).getV2())
                            || (VerticesLogica.getVertice().get(i).getIdentificador() == AristasLogica.getAristas().get(k).getV2()
                            && VerticesLogica.getVertice().get(j).getIdentificador() == AristasLogica.getAristas().get(k).getV1())) {
                        MAdyacencia[i][j] = true;
                    }
                }
            }
        }

        /*for (int i = 0; i < VerticesLogica.getVertice().size(); i++) {
            for (int j = 0; j < VerticesLogica.getVertice().size(); j++) {
                System.out.print(MAdyacencia[i][j] + "     ");
            }
            System.out.println("");
        }
        System.out.println("");*/
    }

    private void btnAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAristaActionPerformed
        modo = 2;
    }//GEN-LAST:event_btnAristaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        VerticesLogica.removeAllVertice();
        AristasLogica.removeAllAristas();
        cbV1.setSelectedIndex(0);
        cbV2.setSelectedIndex(0);
        int a = cbV1.getItemCount();
        grafo1.repaint();
        try {
            for (int i = 0; i < a; i++) {
                cbV1.removeItemAt(1);
                cbV2.removeItemAt(1);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        listaString.clear();
        for (Arista bs : AristasLogica.getAristas()) {
            bs.setColor(Color.BLACK);
        }
        if (cbV1.getSelectedIndex() > 0 && cbV2.getSelectedIndex() > 0) {
            inicializar();
            printShortestPaths(MAdyacencia, cbV1.getSelectedIndex() - 1, cbV2.getSelectedIndex() - 1);
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Vertices Validos");
        }
        ListaCosos.clear();     
        //
                List<String> palabras = listaString;
        List<Color> colores = Arrays.asList(Color.BLUE, Color.RED);
        //System.out.println("");
        int n = 0;
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length() - 1; i++) {   
                char primerCaracter = Character.toLowerCase(palabra.charAt(i));
                char segundoCaracter = Character.toLowerCase(palabra.charAt(i + 1));
                String primerCaracterString = new String(new char[]{primerCaracter});
                primerCaracterString += new String(new char[]{segundoCaracter});
                if (!ListaCosos.contains(primerCaracterString)) {
                    ListaCosos.add(primerCaracterString);
                    //System.out.println(primerCaracterString);
                    for (Arista linea : AristasLogica.getAristas()) {
                        if ((linea.getV1() == primerCaracter && linea.getV2() == segundoCaracter)
                                || (linea.getV1() == segundoCaracter && linea.getV2() == primerCaracter)) {
                            linea.setColor(colores.get(n));
                        }
                    }
                }
            }
            ListaCosos.clear();

            //System.out.println("....");
            n++;
        }
        grafo1.repaint();
        //
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void printShortestPaths(boolean[][] adjacencyMatrix, int source, int target) {
        List<List<Integer>> shortestPaths = dijkstra(adjacencyMatrix, source, target);

        for (List<Integer> path : shortestPaths) {
            StringBuilder sb = new StringBuilder();
            for (int i : path) {
                char c = (char) (i + 65); // Convertir número a letra
                sb.append(c);
            }
            listaString.add(sb.toString());
            //System.out.println(sb.toString());
        }
    }

    public static List<List<Integer>> dijkstra(boolean[][] adjacencyMatrix, int source, int target) {
        int n = adjacencyMatrix.length;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((path1, path2) -> Integer.compare(path1.size(), path2.size()));
        pq.offer(Collections.singletonList(source));

        List<List<Integer>> shortestPaths = new ArrayList<>();

        while (!pq.isEmpty() && shortestPaths.size() < 2) {
            List<Integer> path = pq.poll();
            int lastNode = path.get(path.size() - 1);

            if (lastNode == target) {
                shortestPaths.add(path);
                continue;
            }
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (adjacencyMatrix[lastNode][neighbor] && !path.contains(neighbor)) {
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    pq.offer(newPath);
                }
            }
        }
        return shortestPaths;
    }

    private void llenarCb() {
        if (!VerticesLogica.getVertice().isEmpty()) {
            for (Vertice i : VerticesLogica.getVertice()) {
                boolean repetidos = false;
                for (int j = 0; j < cbV1.getItemCount(); j++) {
                    if (cbV1.getItemAt(j).equals(i.getIdentificador() + "")) {
                        repetidos = true;
                        break;
                    }
                }
                if (repetidos == false) {
                    cbV1.addItem(i.getIdentificador() + "");
                    cbV2.addItem(i.getIdentificador() + "");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArista;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnVertice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbV1;
    private javax.swing.JComboBox<String> cbV2;
    private javax.swing.JLabel coordenadas;
    private Vista.Panel grafo1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rb1;
    // End of variables declaration//GEN-END:variables
}
