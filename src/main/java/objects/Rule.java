package objects;

public class Rule {

    String type;
    String parameter;
    String operator;
    String value;

    public Rule() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Rule(String type, String parameter, String operator, String value) {
        this.type = type;
        this.parameter = parameter;
        this.operator = operator;
        this.value = value;
    }
}
