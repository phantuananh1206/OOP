/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
 
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.TransferHandler;
 
 
public class Example extends JFrame {
 DefaultListModel model2;
 String[] item = {"Toan","Ly","Hoa","Anh","Van"};
    DefaultListModel model;
 
    public Example() {
 
        setTitle("Drag And Drop Example");
 
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
   
        JScrollPane pane = new JScrollPane();
        pane.setPreferredSize(new Dimension(180, 150));
 
        model = new DefaultListModel();
        JList list = new JList(model);
        JList list2 = new JList(model2);
//        
//        for(String i : item  )
//        {
//            model2.addElement(i);
//           
//        
//        }
//        list2.setModel(model2);
//        
        
        list.setDropMode(DropMode.INSERT);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setTransferHandler(new ListHandler());
 
     
        pane.getViewport().add(list); 
        panel.add(pane);
        add(list2);
        add(panel);
 
        pack();
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
 
    private class ListHandler extends TransferHandler {
        public boolean canImport(TransferSupport support) {
            if (!support.isDrop()) {
                return false;
            }
 
            return support.isDataFlavorSupported(DataFlavor.stringFlavor);
        }
 
        public boolean importData(TransferSupport support) {
            if (!canImport(support)) {
                return false;
            }
 
            Transferable transferable = support.getTransferable();
            String line;
            try {
                line = (String) transferable.getTransferData(DataFlavor.stringFlavor);
            } catch (Exception e) {
                return false;
            }
 
            JList.DropLocation dl = (JList.DropLocation) support.getDropLocation();
            int index = dl.getIndex();
 
            String[] data = line.split(",");
            for (String item: data) {
                if (!item.isEmpty())
                    model.add(index++, item.trim());
            }
            return true;
       }
    }
 
    public static void main(String[] args) {
        new Example();
    }
}