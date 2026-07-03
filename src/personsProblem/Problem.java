package personsProblem;

public class Problem {
    private String name;
    private ProblemType type;
    public boolean isSolved;
    private  String description;

    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {

        return this.name;
    }

    public ProblemType getType() {

        return this.type;
    }

    public boolean getIsSolved() {
        return isSolved;

    }

    public void solved() {

        this.isSolved = true;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
