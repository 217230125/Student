public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;
    private int numberOfActivities;

    // Constructor
    public Student(String studentID, String studentName, int numberOfActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.numberOfActivities = numberOfActivities;
        this.extraActivities = new String[numberOfActivities];
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public int getNumberOfActivities() {
        return numberOfActivities;
    }

    public void setNumberOfActivities(int numberOfActivities) {
        this.numberOfActivities = numberOfActivities;
    }

    // addExtraActivity method
    public void addExtraActivity(String activity) {
        extraActivities[numberOfActivities - 1] = activity;
        numberOfActivities++;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Student Name: ").append(studentName).append("\n");
        sb.append("Extra Activities: \n");
        for (int i = 0; i < numberOfActivities; i++) {
            sb.append("Activity ").append(i + 1).append(": ").append(extraActivities[i]).append("\n");
        }
        return sb.toString();
    }
}
