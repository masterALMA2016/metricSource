package test;

/**
 * Created on 28/11/14.
 *
 * 1 attribute
 *      1 private
 * 3 methods (1 Override)
 *      2 protected
 *      1 public
 *
 * @author dralagen
 */
public abstract class FakeAbstract implements Fake {

    private FakeBean bean;

    protected FakeBean getBean() {
        return bean;
    }

    protected void setBean(FakeBean bean) {
        this.bean = bean;
    }

    @Override
    public FakeBean getFake() {
        return bean;
    }
}
