package com.example.demo.controller;

import com.example.demo.dto.RequestCreateNewUser;
import com.example.demo.dto.Response;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    @ResponseBody
    public Response<Iterable<User>> getAllUsers(@RequestParam @Nullable String email) {
        if(email != null){
            var data = userRepository.findByEmail(email);
            return new Response(true, "200", "Success to get all users", data);
        }
        System.out.println("Hello World");
        var data = userRepository.findUsersWherePasswordIsEya();
        return new Response(true, "200", "Success to get all users", data);
    }


    @GetMapping(path = "/{id}")
    @ResponseBody
    public Response<User> getDetailUser(@PathVariable String id) {
        var data = userRepository.findById(Integer.parseInt(id));
        return new Response(true, "200", "Succes Get User Data", data);
    }

    @PostMapping
    @ResponseBody
    public Response<User> addNewUser(@RequestBody RequestCreateNewUser req) {
        User user = new User();
        user.setEmail(req.getEmail());
        user.setFirstName(req.getFirstName());
        user.setLastName(req.getLastName());
        user.setPassword(req.getPassword());
        userRepository.save(user);
        return new Response(true, "200", "Success to add new User to Database", null);
    }

}
