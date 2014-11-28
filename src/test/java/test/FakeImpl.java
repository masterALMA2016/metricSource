package test;

/**
 * Created on 28/11/14.
 *
 * 3 methods (3 Overrides)
 *      3 public
 *
 * @author dralagen
 */
public class FakeImpl extends FakeAbstract {

    @Override
    public void createFake() {
        setBean(new FakeBean());
    }

    @Override
    public void createFake(String name) {
        createFake();
        getBean().setName(name);
    }

    @Override
    public void setFake(String name) {
        getBean().setName(name);
    }
}
