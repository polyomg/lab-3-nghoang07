package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import poly.edu.bean.Staff;

@Controller
public class DetailController {

    @GetMapping("/staff/detail")
    public String detail(Model model) {
        Staff staff = Staff.builder()
                .id("hoangnhts01296@gmail.com")
                .fullname("Nguyễn Huy Hoang")
                .level(2)
                .build();

        model.addAttribute("staff", staff);
        return "staff-detail";
    }
}
