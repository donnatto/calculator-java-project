/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutables;

import datos.PilaCaracteres;
import datos.PilaNros;
import static java.lang.Math.round;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class frmPrincipal extends javax.swing.JFrame {

  /**
   * Creates new form frmPrincipal
   */
  int n;
  PilaCaracteres pilaExpresion;
  PilaCaracteres pilaOperadores;
  PilaCaracteres pilaSalida;
  PilaNros operandos;

  public frmPrincipal() {
    initComponents();
    n = 15;
    pilaExpresion = new PilaCaracteres(n);
    pilaOperadores = new PilaCaracteres(n);
    operandos = new PilaNros(n);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    txtCalc = new javax.swing.JTextField();
    btn0 = new javax.swing.JButton();
    btn1 = new javax.swing.JButton();
    btn2 = new javax.swing.JButton();
    btn3 = new javax.swing.JButton();
    btn4 = new javax.swing.JButton();
    btn5 = new javax.swing.JButton();
    btn6 = new javax.swing.JButton();
    btn7 = new javax.swing.JButton();
    btn8 = new javax.swing.JButton();
    btn9 = new javax.swing.JButton();
    btnPar1 = new javax.swing.JButton();
    btnPar2 = new javax.swing.JButton();
    btnDel = new javax.swing.JButton();
    btnMult = new javax.swing.JButton();
    btnDiv = new javax.swing.JButton();
    btnResta = new javax.swing.JButton();
    btnSuma = new javax.swing.JButton();
    btnResultado = new javax.swing.JButton();
    btnPunto = new javax.swing.JButton();
    btnClear = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txtCalc.setEditable(false);
    txtCalc.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
    txtCalc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

    btn0.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn0.setText("0");
    btn0.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn0ActionPerformed(evt);
      }
    });

    btn1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn1.setText("1");
    btn1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn1ActionPerformed(evt);
      }
    });

    btn2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn2.setText("2");
    btn2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn2ActionPerformed(evt);
      }
    });

    btn3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn3.setText("3");
    btn3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn3ActionPerformed(evt);
      }
    });

    btn4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn4.setText("4");
    btn4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn4ActionPerformed(evt);
      }
    });

    btn5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn5.setText("5");
    btn5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn5ActionPerformed(evt);
      }
    });

    btn6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn6.setText("6");
    btn6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn6ActionPerformed(evt);
      }
    });

    btn7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn7.setText("7");
    btn7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn7ActionPerformed(evt);
      }
    });

    btn8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn8.setText("8");
    btn8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn8ActionPerformed(evt);
      }
    });

    btn9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btn9.setText("9");
    btn9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn9ActionPerformed(evt);
      }
    });

    btnPar1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnPar1.setText("(");
    btnPar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPar1ActionPerformed(evt);
      }
    });

    btnPar2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnPar2.setText(")");
    btnPar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPar2ActionPerformed(evt);
      }
    });

    btnDel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnDel.setText("DEL");
    btnDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDelActionPerformed(evt);
      }
    });

    btnMult.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnMult.setText("x");
    btnMult.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMultActionPerformed(evt);
      }
    });

    btnDiv.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnDiv.setText("÷");
    btnDiv.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDivActionPerformed(evt);
      }
    });

    btnResta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnResta.setText("-");
    btnResta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRestaActionPerformed(evt);
      }
    });

    btnSuma.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnSuma.setText("+");
    btnSuma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSumaActionPerformed(evt);
      }
    });

    btnResultado.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnResultado.setText("=");
    btnResultado.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResultadoActionPerformed(evt);
      }
    });

    btnPunto.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnPunto.setText(".");
    btnPunto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPuntoActionPerformed(evt);
      }
    });

    btnClear.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    btnClear.setText("CE");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnClearActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txtCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                  .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                  .addComponent(btnPar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnPar2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap(24, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(txtCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnPar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnPar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(24, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public String texto() {
    String text = txtCalc.getText();
    return text;
  }

  public String delete() {
    String str = texto();
    if (str != null && str.length() > 0) {
      str = str.substring(0, str.length() - 1);
    }
    return str;
  }

  private static String depurar(String s) {
    s = s.replaceAll("\\s+", "");
    s = "(" + s + ")";
    String simbols = "+-x/()";
    String str = "";

    //espacios entre operadores
    for (int i = 0; i < s.length(); i++) {
      if (simbols.contains("" + s.charAt(i))) {
        str += " " + s.charAt(i) + " ";
      } else {
        str += s.charAt(i);
      }
    }
    return str.replaceAll("\\s+", " ").trim();
  }

  //jerarquía de operadores
  private static int pref(String op) {
    int prf = 99;

    if (op.equals("x") || op.equals("/")) {
      prf = 4;
    }
    if (op.equals("+") || op.equals("-")) {
      prf = 3;
    }
    if (op.equals(")")) {
      prf = 2;
    }
    if (op.equals("(")) {
      prf = 1;
    }
    return prf;
  }

  private void btnPar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPar1ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "(");
  }//GEN-LAST:event_btnPar1ActionPerformed

  private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "x");
  }//GEN-LAST:event_btnMultActionPerformed

  private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "/");
  }//GEN-LAST:event_btnDivActionPerformed

  private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "7");
  }//GEN-LAST:event_btn7ActionPerformed

  private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "-");
  }//GEN-LAST:event_btnRestaActionPerformed

  private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "4");
  }//GEN-LAST:event_btn4ActionPerformed

  private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "+");
  }//GEN-LAST:event_btnSumaActionPerformed

  private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "1");
  }//GEN-LAST:event_btn1ActionPerformed

  ///Proceso Principal

  private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
    // TODO add your handling code here:
    String postfija, acum, resultado;
    String exp = depurar(txtCalc.getText());
    String[] expresionInfija = exp.split(" ");
    double a, b, c;
    char caracter;
    int n, i;
    postfija = "";

    //Convertir Infija a Posfija
    for (i = expresionInfija.length - 1; i >= 0; i--) {
      pilaExpresion.poner(expresionInfija[i]);
    }

    while (pilaExpresion.getCima() != -1) {
      switch (pref(pilaExpresion.observar())) {
        case 1:
          pilaOperadores.poner(pilaExpresion.sacar());
          break;
        case 3:
        case 4:
          while (pref(pilaOperadores.observar()) >= pref(pilaExpresion.observar())) {
            postfija += pilaOperadores.sacar() + " ";
          }
          pilaOperadores.poner(pilaExpresion.sacar());
          break;
        case 2:
          while (!pilaOperadores.observar().equals("(")) {
            postfija += pilaOperadores.sacar() + " ";
          }
          pilaOperadores.sacar();
          pilaExpresion.sacar();
          break;
        default:
          postfija += pilaExpresion.sacar() + " ";
      }
    }
    //salida postfija
    //JOptionPane.showMessageDialog(this, postfija);

    //Evaluar Posfija
    n = postfija.length();
    acum = "";

    for (i = 0; i < n; i++) {
      caracter = postfija.charAt(i);

      if (caracter == ' ' || caracter == ',') {
        continue;
      } else if (caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/' || caracter == '^') {
        b = operandos.sacar();
        a = operandos.sacar();
        c = 0;

        switch (caracter) {
          case '+':
            c = a + b;
            break;
          case '-':
            c = a - b;
            break;
          case 'x':
            c = a * b;
            break;
          case '/':
            c = a / b;
            break;
        }

        operandos.poner(c);
      } else {
        acum = acum + caracter;
        if (postfija.charAt(i + 1) == ' ' || postfija.charAt(i + 1) == ',') {
          c = Double.parseDouble(acum);
          operandos.poner(c);
          acum = "";
        }
      }
    }
    resultado = String.valueOf(((double)Math.round(operandos.sacar()*100)/100));
    txtCalc.setText(resultado);


  }//GEN-LAST:event_btnResultadoActionPerformed

  private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    // TODO add your handling code here:
    txtCalc.setText("");
  }//GEN-LAST:event_btnClearActionPerformed

  private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "5");
  }//GEN-LAST:event_btn5ActionPerformed

  private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "0");
  }//GEN-LAST:event_btn0ActionPerformed

  private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "2");
  }//GEN-LAST:event_btn2ActionPerformed

  private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "3");
  }//GEN-LAST:event_btn3ActionPerformed

  private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "6");
  }//GEN-LAST:event_btn6ActionPerformed

  private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "8");
  }//GEN-LAST:event_btn8ActionPerformed

  private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + "9");
  }//GEN-LAST:event_btn9ActionPerformed

  private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(delete());
  }//GEN-LAST:event_btnDelActionPerformed

  private void btnPar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPar2ActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + ")");
  }//GEN-LAST:event_btnPar2ActionPerformed

  private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
    // TODO add your handling code here:
    txtCalc.setText(texto() + ".");
  }//GEN-LAST:event_btnPuntoActionPerformed

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
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new frmPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn0;
  private javax.swing.JButton btn1;
  private javax.swing.JButton btn2;
  private javax.swing.JButton btn3;
  private javax.swing.JButton btn4;
  private javax.swing.JButton btn5;
  private javax.swing.JButton btn6;
  private javax.swing.JButton btn7;
  private javax.swing.JButton btn8;
  private javax.swing.JButton btn9;
  private javax.swing.JButton btnClear;
  private javax.swing.JButton btnDel;
  private javax.swing.JButton btnDiv;
  private javax.swing.JButton btnMult;
  private javax.swing.JButton btnPar1;
  private javax.swing.JButton btnPar2;
  private javax.swing.JButton btnPunto;
  private javax.swing.JButton btnResta;
  private javax.swing.JButton btnResultado;
  private javax.swing.JButton btnSuma;
  private javax.swing.JTextField txtCalc;
  // End of variables declaration//GEN-END:variables
}
