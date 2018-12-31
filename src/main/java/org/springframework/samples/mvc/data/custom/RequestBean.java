package org.springframework.samples.mvc.data.custom;

/**
 * @author xiele
 * @date 2018/12/31
 */
@SupportsCustomizedBinding
public class RequestBean {

    @BindParameter("n")
    private String name;

    @BindParameter("v")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "RequestBean{" +
            "name='" + name + '\'' +
            ", value='" + value + '\'' +
            '}';
    }
}
