/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacovid.pkg19;

import javax.swing.JLabel;


public class Recomendaciones extends javax.swing.JFrame {
    public void showrecomendaciones(boolean estado){
         if(estado==false){
            Recomendaciones.setText("<html><body>"+"1. Mantenga una higiene correcta  <br> 2.no salga de casa <br> 3. Evite el contacto cercano con personas que estén enfermas. <br> 4.Emplee pañuelos desechables <br> 5. Evite las grandes aglomeraciones "+"</body></html>");
        }
        else{
            Recomendaciones.setText("Por favor dirijase a un hospital y evite el contacto humano");
        }
        
        
    }
    String recomendaciones;
    boolean contagiado;
     int cChina;
    int cItalia;
    int cEspaña;
    int cFrancia;
    int cEEUU;
    int cOtro;

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

    public int getcOtro() {
        return cOtro;
    }

    public void setcOtro(int cOtro) {
        this.cOtro = cOtro;
    }
    public void setContagiado(boolean contagiado) {
        this.contagiado = contagiado;
    }
    public Recomendaciones() {
        initComponents();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Recomendaciones = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recomendaciones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        Recomendaciones.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        Recomendaciones.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Recomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jButton2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2257a2b370a8fd9.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Consulta obj= new Consulta();
         obj.setcChina(cChina);
        obj.setcEEUU(cEEUU);
        obj.setcEspaña(cEspaña);
        obj.setcFrancia(cFrancia);
        obj.setcItalia(cItalia);
        obj.setcOtro(cOtro);
        obj.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        showrecomendaciones(contagiado);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Recomendaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    void setRecomendaciones(boolean posiblecontagiado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
