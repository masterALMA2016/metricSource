package test;

/**
 * Created on 28/11/14.
 *
 * 2 attributes
 *      2 private
 * 1 Constructor Public
 * 4 methods (0 override)
 *      4 public
 *
 * @author dralagen
 */
public class FakeBean {

    private Long id;

    private String name;

    public FakeBean() {
        id = (long) (Math.random() * Long.MAX_VALUE);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
