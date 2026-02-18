package lab9;

import java.awt.*;

import java.awt.event.*;

import java.io.*;

public class FileReadWriteGUI3 extends Frame {

    private TextArea textArea;

    private Button readButton;

    private Button writeButton;

    private FileDialog fileDialog;

    private String fileContent;

    private Panel buttonPanel;

    public FileReadWriteGUI3() {

        setTitle("File Reader and Writer");

        setSize(600, 400);

        setLayout(new BorderLayout());

        textArea = new TextArea();

        readButton = new Button("Read File");

        writeButton = new Button("Write To File");

        add(textArea, BorderLayout.CENTER);

        buttonPanel = new Panel();

        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(readButton);

        buttonPanel.add(writeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        readButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                readFile();

            }

        });

        writeButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                writeFile();

            }

        });

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {

                System.exit(0);

            }

        });

    }

    private void readFile() {

        fileDialog = new FileDialog(this, "Select File to Read", FileDialog.LOAD);

        fileDialog.setVisible(true);

        String filePath = fileDialog.getDirectory() + fileDialog.getFile();

        char[] array = new char[200];

        if (filePath != null && !fileDialog.getFile().isEmpty()) {

            try {

                Reader reader = new FileReader(filePath);

                reader.read(array);

                textArea.setText(new String(array));

                reader.close();

            } catch (Exception error) {

                error.getStackTrace();

            }

        }

    }

    private void writeFile() {

        fileDialog = new FileDialog(this, "Save File As", FileDialog.SAVE);

        fileDialog.setVisible(true);

        String data = textArea.getText();

        String filePath = fileDialog.getDirectory() + fileDialog.getFile();

        if (filePath != null && !fileDialog.getFile().isEmpty()) {

            try {

                FileWriter wr = new FileWriter(filePath);

                wr.write(data);

                wr.close();

                textArea.setText("File written successfully!");

            } catch (Exception error) {

                error.getStackTrace();

            }

        }

    }

    public static void main(String[] args) {

        FileReadWriteGUI3 gui = new FileReadWriteGUI3();

        gui.setVisible(true);

    }

}