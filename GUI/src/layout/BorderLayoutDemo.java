/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package layout;

/*
 * BorderLayoutDemo.java
 *
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class BorderLayoutDemo {
	public static boolean RIGHT_TO_LEFT = false;

	public static void addComponentsToPane(Container pane) {

		if (!(pane.getLayout() instanceof BorderLayout)) {
			pane.add(new JLabel("Container doesn't use BorderLayout!"));
			return;
		}




		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(
					java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final JLabel label = new JLabel("0");

		label.setPreferredSize(new Dimension(600, 100));
		pane.add(label, BorderLayout.PAGE_START);



		JPanel centro = new JPanel();
		centro.setLayout(new GridLayout(5,4));
		centro.setPreferredSize(new Dimension(600, 800));
		añadirCosas(centro, label);
		pane.add(centro, BorderLayout.CENTER);

	}


	private static void añadirCosas(JPanel centro, JLabel label){



		JButton ce = new JButton("CE");
		JButton c = new JButton("C");
		JButton b = new JButton(" <x ");
		JButton d = new JButton(" / ");
		JButton pun = new JButton(" . ");
		JButton s = new JButton(" 7 ");
		JButton o = new JButton(" 8 ");
		JButton n = new JButton(" 9 ");
		JButton x = new JButton(" X ");
		JButton cu = new JButton(" 4 ");
		JButton cin = new JButton(" 5 ");
		JButton se = new JButton(" 6 ");
		JButton m = new JButton(" - ");
		JButton un = new JButton(" 1 ");
		JButton dos = new JButton(" 2 ");
		JButton tres = new JButton(" 3 ");
		JButton plus = new JButton(" + ");
		JButton mm = new JButton(" + - ");
		JButton zero = new JButton(" 0 ");
		JButton punto = new JButton(" . ");
		JButton equals = new JButton(" = ");

		centro.add(ce);
		centro.add(c);
		centro.add(b);
		centro.add(d);
		centro.add(s);
		centro.add(o);
		centro.add(n);
		centro.add(x);
		centro.add(cu);
		centro.add(cin);
		centro.add(se);
		centro.add(m);
		centro.add(un);
		centro.add(dos);
		centro.add(tres);
		centro.add(plus);
		centro.add(mm);
		centro.add(zero);
		centro.add(punto);
		centro.add(equals);




		ce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				label.setText("0");
			}
		});

		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				label.setText("0");
			}

		});

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				if(label.getText().length() > 1){
					label.setText(label.getText().substring(0, label.getText().length()-1));
				}
			}
		});

		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				//TODO: dividir
			}

		});

		pun.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				label.setText(label + ".");
			}

		});


		s.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				if(label.getText().equals("0")){
					label.setText("7");
				}else{
					label.setText(label.getText() + "7");
				}
			}

		});

		o.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("8");
				}else{
					label.setText(label.getText() + "8");
				}
			}

		});
		
		n.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("9");
				}else{
					label.setText(label.getText() + "9");
				}
			}

		});
		
		cu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("4");
				}else{
					label.setText(label.getText() + "4");
				}
			}

		});
		
		cin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("5");
				}else{
					label.setText(label.getText() + "5");
				}
			}

		});
		
		se.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("6");
				}else{
					label.setText(label.getText() + "6");
				}
			}

		});
		
		un.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("1");
				}else{
					label.setText(label.getText() + "1");
				}
			}

		});

		dos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){

				if(label.getText().equals("0")){
					label.setText("2");
				}else{
					label.setText(label.getText() + "2");
				}
			}

		});





	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	private static void createAndShowGUI() {

		//Create and set up the window.
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set up the content pane.
		addComponentsToPane(frame.getContentPane());
		//Use the content pane's default BorderLayout. No need for
		//setLayout(new BorderLayout());
		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}