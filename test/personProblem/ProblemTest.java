package personProblem;

import org.junit.jupiter.api.Test;
import personsProblem.Problem;
import personsProblem.ProblemType;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {
    @Test
    public  void testThatProblemCanBeCreated(){
        Problem problem = new Problem("Semicolon Fee", ProblemType.FINANCIAL);

        assertEquals("Semicolon Fee", problem.getName());
    }

    @Test
    public void testThatProblemHasAType(){
        Problem problem = new Problem("Semicolon Fee", ProblemType.FINANCIAL);

        assertEquals(ProblemType.FINANCIAL, problem.getType());
    }

    @Test
    public void testThatTheNewProblemIsNotSolvedYet(){
        Problem problem = new Problem("Semicolon Fee", ProblemType.FINANCIAL);

        assertFalse(problem.getIsSolved());
    }

    @Test
    public void testThatProblemCanBeSolved(){
        Problem problem = new Problem("Semicolon Fee", ProblemType.FINANCIAL);

        problem.solved();

        assertTrue(problem.getIsSolved());
    }

    @Test
    public void testThatProblemHasDescription(){
        Problem problem = new Problem("Semicolon", ProblemType.FINANCIAL);

        problem.setDescription("You need to pay up your loan");

        assertEquals("You need to pay up your loan", problem.getDescription());
    }
    @Test
    public void testThatAPersonHas_0_Problem(){

    }
}