package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CountATest.class, SquareTest.class })
public class AllTests {

}

//Test suites can be used to execute multiple test cases at once.