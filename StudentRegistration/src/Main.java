import java.awt.*;
import java.awt.event.*;

class StudentRegistration {
    public static void main(String[] args) {
        Frame frame = new Frame("Student Registration Form");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        MenuItem itemNew = new MenuItem("New Form");
        MenuItem itemExit = new MenuItem("Exit");
        menuFile.add(itemNew);
        menuFile.addSeparator();
        menuFile.add(itemExit);

        Menu menuEdit = new Menu("Edit");
        MenuItem itemCut = new MenuItem("Cut");
        MenuItem itemCopy = new MenuItem("Copy");
        MenuItem itemPaste = new MenuItem("Paste");
        menuEdit.add(itemCut);
        menuEdit.add(itemCopy);
        menuEdit.add(itemPaste);

        Menu menuView = new Menu("View");
        MenuItem itemZoomIn = new MenuItem("Zoom In");
        MenuItem itemZoomOut = new MenuItem("Zoom Out");
        menuView.add(itemZoomIn);
        menuView.add(itemZoomOut);

        Menu menuHelp = new Menu("Help");
        MenuItem itemAbout = new MenuItem("About");
        menuHelp.add(itemAbout);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);
        menuBar.add(menuHelp);
        frame.setMenuBar(menuBar);

        Label lblName = new Label("Full Name: ");
        TextField tfName = new TextField(25);

        Label lblEmail = new Label("Email ID:  ");
        TextField tfEmail = new TextField(25);

        Label lblGender = new Label("Gender: ");

        Panel genderPanel = new Panel();
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox chkMale = new Checkbox("Male", genderGroup, false);
        Checkbox chkFemale = new Checkbox("Female", genderGroup, false);
        genderPanel.add(chkMale);
        genderPanel.add(chkFemale);

        Label lblCourse = new Label("Course: ");
        Choice courseChoice = new Choice();
        courseChoice.add("Computer Science");
        courseChoice.add("Information Technology");
        courseChoice.add("Electronics");

        Label lblHobbies = new Label("Hobbies / Interests:");
        List listHobbies = new List(4, true);
        listHobbies.add("Coding");
        listHobbies.add("Gaming");
        listHobbies.add("Sports");
        listHobbies.add("Music");
        listHobbies.add("Reading");

        Button btnSubmit = new Button("Register");

        frame.add(lblName);
        frame.add(tfName);

        frame.add(lblEmail);
        frame.add(tfEmail);

        frame.add(lblGender);
        frame.add(genderPanel);

        frame.add(lblCourse);
        frame.add(courseChoice);

        frame.add(lblHobbies);
        frame.add(listHobbies);

        frame.add(btnSubmit);

        frame.setSize(320, 520);
        frame.setBackground(Color.LIGHT_GRAY);

        frame.setVisible(true);
    }
}