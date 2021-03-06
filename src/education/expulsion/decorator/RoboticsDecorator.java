package education.expulsion.decorator;

import education.Student;
import education.expulsion.ExpulsionConfig;

public class RoboticsDecorator extends Decorator {
    public RoboticsDecorator(Expulsioner expulsioner) {
        super(expulsioner);
    }

    @Override
    public void expulsionProcess(Student student, ExpulsionConfig config) {
        super.expulsionProcess(student, config);
    }
}
