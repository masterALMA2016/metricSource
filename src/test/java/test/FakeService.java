package test;

/**
 * Created on 28/11/14.
 *
 * 1 attribute
 *      1 private
 * 1 Constructor public
 * 2 methods (0 overrides)
 *      2 public
 *
 * @author dralagen
 */
public class FakeService {
    private Fake fake;

    public FakeService() {
        fake = new FakeImpl();
        fake.createFake("Three");
    }

    public FakeBean getFake() {
        return fake.getFake();
    }

    public void setFakeName(String name) {
        fake.setFake(name);
    }
}
