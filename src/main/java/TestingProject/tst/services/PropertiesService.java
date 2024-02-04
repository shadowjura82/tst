package TestingProject.tst.services;

import org.springframework.stereotype.Service;

@Service
public class PropertiesService {
    private String stringFirst;
    private String stringSecond;
    private Integer flag;

    public PropertiesService() {
        this.stringFirst = "This is first string";
        this.stringSecond = "This is second string";
        this.flag = 10;
    }

    public String getString() {
        if (flag < 20) {
            return stringFirst;
        }
        return stringSecond;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
