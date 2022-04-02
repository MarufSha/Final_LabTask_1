package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Final")
public class Final  implements Interface {
    @Value("${Final.date}")
    private String date;

    @Override
    public String exam() {
        return date + ": The Final Exam Date is: ";
    }

    public String getDate() {
        this.date= String.valueOf(2022-04-03);
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
