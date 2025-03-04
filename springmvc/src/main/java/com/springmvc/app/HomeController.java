package com.springmvc.app;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String getCourse(){
        return "Java";
    }


    @RequestMapping("/")
    public String home(){
        return "index";
    }

//        @RequestMapping("/add")
//        public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result=num1+num2;
//            session.setAttribute("result",result);
//            return "result.jsp";
//        }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
//        int result=num1+num2;
//        model.addAttribute("result",result);
//        return "result";
//    }

//        @RequestMapping("/add")
//        public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//            int result=num1+num2;
//            mv.addObject("result",result);
//            mv.setViewName("result");
//            return mv;
//        }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int result=num1+num2;
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

//    @RequestMapping("/addStudent")
//    public ModelAndView add(@RequestParam("rollno") int rollno, @RequestParam("aname") String aname, ModelAndView mv){
//        Student student=new Student();
//        student.setRollno(rollno);
//        student.setName(aname);
//
//        mv.addObject("student",student);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("/addStudent")
    public String add(@ModelAttribute Student student){
        return "result";
    }

}
