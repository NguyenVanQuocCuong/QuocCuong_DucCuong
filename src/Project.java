 
package QuanLiDeTaiTotNghiep;
/**
 * Nguyen Van Quoc Cuong + Nguyen Duc Cuong 
 */

public class Project {

    int id;
    String projectname, deadline, instruction;

    public Project(int id, String projectname, String deadline, String instruction) {
        this.id = id;
        this.projectname = projectname;
        this.deadline = deadline;
        this.instruction = instruction;
    }

    public Project(String projectname, String deadline, String instruction) {
        this.projectname = projectname;
        this.deadline = deadline;
        this.instruction = instruction;
    }

    public Project() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

}

