
package programacovid.pkg19;

import javax.swing.JOptionPane;


public class Consulta extends javax.swing.JFrame {
    String pais;
    boolean posiblecontagiado;
     int cChina;
    int cItalia;
    int cEspaña;
    int cFrancia;
    int cEEUU;
    int cOtro;

    public void setcOtro(int cOtro) {
        this.cOtro = cOtro;
    }

    public int getcChina() {
        return cChina;
    }

    public void setcChina(int cChina) {
        this.cChina = cChina;
    }

    public int getcItalia() {
        return cItalia;
    }

    public void setcItalia(int cItalia) {
        this.cItalia = cItalia;
    }

    public int getcEspaña() {
        return cEspaña;
    }

    public void setcEspaña(int cEspaña) {
        this.cEspaña = cEspaña;
    }

    public int getcFrancia() {
        return cFrancia;
    }

    public void setcFrancia(int cFrancia) {
        this.cFrancia = cFrancia;
    }

    public int getcEEUU() {
        return cEEUU;
    }

    public void setcEEUU(int cEEUU) {
        this.cEEUU = cEEUU;
    }
    public Consulta() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnItalia = new javax.swing.JButton();
        BtnEspaña = new javax.swing.JButton();
        BtnEEUU = new javax.swing.JButton();
        BtnFrancia = new javax.swing.JButton();
        BtnRecomendaciones = new javax.swing.JButton();
        BtnChina = new javax.swing.JButton();
        BtnResultados = new javax.swing.JButton();
        Btnotro = new javax.swing.JButton();
        BtnResultados1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("¿viajo a alguno de estos paises recientemente?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Triage coronavirus");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BtnItalia.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnItalia.setText("Italia");
        BtnItalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnItaliaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnItalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        BtnEspaña.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnEspaña.setText("España");
        BtnEspaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEspañaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEspaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        BtnEEUU.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnEEUU.setText("EEUU");
        BtnEEUU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEEUUActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEEUU, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        BtnFrancia.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnFrancia.setText("Francia");
        BtnFrancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFranciaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFrancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        BtnRecomendaciones.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnRecomendaciones.setText("Ver recomiendaciones");
        BtnRecomendaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecomendacionesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRecomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 30));

        BtnChina.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnChina.setText("China");
        BtnChina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChinaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnChina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        BtnResultados.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnResultados.setText("Resultados");
        BtnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResultadosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 160, 30));

        Btnotro.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        Btnotro.setText("Otro");
        Btnotro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnotroActionPerformed(evt);
            }
        });
        getContentPane().add(Btnotro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        BtnResultados1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnResultados1.setText("Salida");
        BtnResultados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResultados1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnResultados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 600, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRecomendacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecomendacionesActionPerformed
     Recomendaciones obj2=new Recomendaciones();
      
      obj2.setcChina(cChina);
      obj2.setcEEUU(cEEUU);
      obj2.setcEspaña(cEspaña);
      obj2.setcFrancia(cFrancia);
      obj2.setcItalia(cItalia);
      obj2.setcOtro(cOtro);
     obj2.setVisible(true);
     obj2.setContagiado(posiblecontagiado);
     this.setVisible(false);
    }//GEN-LAST:event_BtnRecomendacionesActionPerformed

    public boolean isPosiblecontagiado() {
        return posiblecontagiado;
    }

    private void BtnChinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChinaActionPerformed
        pais="China";
        JOptionPane.showMessageDialog(null,"Posible contagiado");
        posiblecontagiado=true;
        System.out.println(posiblecontagiado);
        cChina++;
    }//GEN-LAST:event_BtnChinaActionPerformed

    private void BtnItaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnItaliaActionPerformed
        pais="Italia";
         JOptionPane.showMessageDialog(null,"Posible contagiado");
         posiblecontagiado=true;
         cItalia++;
         
    }//GEN-LAST:event_BtnItaliaActionPerformed

    private void BtnEspañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEspañaActionPerformed
         pais="España";
         JOptionPane.showMessageDialog(null,"Posible contagiado");
         posiblecontagiado=true;
         cEspaña++;
    }//GEN-LAST:event_BtnEspañaActionPerformed

    private void BtnFranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFranciaActionPerformed
         pais="Francia";
         JOptionPane.showMessageDialog(null,"Posible contagiado");
         posiblecontagiado=true;
         cFrancia++;
    }//GEN-LAST:event_BtnFranciaActionPerformed

    private void BtnEEUUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEEUUActionPerformed
         pais="EEUU";
         JOptionPane.showMessageDialog(null,"Posible contagiado");
         posiblecontagiado=true;
         cEEUU++;
    }//GEN-LAST:event_BtnEEUUActionPerformed

    private void BtnotroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnotroActionPerformed
        pais="Otro";
        JOptionPane.showMessageDialog(null,"No es contagiado");
        posiblecontagiado=false;
        cOtro++;
        
    }//GEN-LAST:event_BtnotroActionPerformed

    private void BtnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResultadosActionPerformed
        Resultados bt= new Resultados();
        bt.setcChina(cChina);
        bt.setcEEUU(cEEUU);
        bt.setcEspaña(cEspaña);
        bt.setcFrancia(cFrancia);
        bt.setcItalia(cItalia);
        bt.setcOtro(cOtro);
        bt.setVisible(true);
        
    }//GEN-LAST:event_BtnResultadosActionPerformed

    private void BtnResultados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResultados1ActionPerformed
        JOptionPane.showMessageDialog(null, "Adios");
        System.exit(0);
    }//GEN-LAST:event_BtnResultados1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChina;
    private javax.swing.JButton BtnEEUU;
    private javax.swing.JButton BtnEspaña;
    private javax.swing.JButton BtnFrancia;
    private javax.swing.JButton BtnItalia;
    private javax.swing.JButton BtnRecomendaciones;
    private javax.swing.JButton BtnResultados;
    private javax.swing.JButton BtnResultados1;
    private javax.swing.JButton Btnotro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
