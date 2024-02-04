package TestingProject.tst.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {
    @Value("${first.string.variable}")
    private String stringFirst;
    @Value("${second.string.variable}")
    private String stringSecond;
    @Value("${flag.variable}")
    private Integer flag;

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
