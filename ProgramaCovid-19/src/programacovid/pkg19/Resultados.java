
package programacovid.pkg19;


public class Resultados extends javax.swing.JFrame {

    public Resultados() {
        initComponents();
    }
    int cChina;
    int cItalia;
    int cEspaña;
    int cFrancia;
    int cEEUU;
    int cOtro;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cOTROS = new javax.swing.JLabel();
        cITALIA = new javax.swing.JLabel();
        cESPAÑA = new javax.swing.JLabel();
        cFRANCIA = new javax.swing.JLabel();
        ceeuu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cCHINA = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cOTROS.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cOTROS.setForeground(new java.awt.Color(255, 255, 255));
        cOTROS.setText("Estadisticas");
        getContentPane().add(cOTROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        cITALIA.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cITALIA.setForeground(new java.awt.Color(255, 255, 255));
        cITALIA.setText("Estadisticas");
        getContentPane().add(cITALIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        cESPAÑA.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cESPAÑA.setForeground(new java.awt.Color(255, 255, 255));
        cESPAÑA.setText("Estadisticas");
        getContentPane().add(cESPAÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        cFRANCIA.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cFRANCIA.setForeground(new java.awt.Color(255, 255, 255));
        cFRANCIA.setText("Estadisticas");
        getContentPane().add(cFRANCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        ceeuu.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ceeuu.setForeground(new java.awt.Color(255, 255, 255));
        ceeuu.setText("Estadisticas");
        getContentPane().add(ceeuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estadisticas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 30));

        jButton1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton1.setText(" Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        cCHINA.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cCHINA.setForeground(new java.awt.Color(255, 255, 255));
        cCHINA.setText("Estadisticas");
        getContentPane().add(cCHINA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        jButton2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton2.setText("ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2257a2b370a8fd9.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Consulta ob= new Consulta();
        ob.setcChina(cChina);
        ob.setcEEUU(cEEUU);
        ob.setcEspaña(cEspaña);
        ob.setcFrancia(cFrancia);
        ob.setcItalia(cItalia);
        ob.setcOtro(cOtro);
        ob.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cCHINA.setText("Infectados que vinieron de China: "+cChina);
        cITALIA.setText("Infectados que vinieron de Italia: "+cItalia);
        cESPAÑA.setText("Infectados que vinieron de España: "+cEspaña);
        ceeuu.setText("Infectados que vinieron de EEUU: "+cEEUU);
        cFRANCIA.setText("Infectados que vinieron de Francia"+cFrancia);
        cOTROS.setText("No infectados: "+cOtro);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cCHINA;
    private javax.swing.JLabel cESPAÑA;
    private javax.swing.JLabel cFRANCIA;
    private javax.swing.JLabel cITALIA;
    private javax.swing.JLabel cOTROS;
    private javax.swing.JLabel ceeuu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
