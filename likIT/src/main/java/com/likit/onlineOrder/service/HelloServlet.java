package com.likit.onlineOrder.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.likit.onlineOrder.entity.Customer;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String username;

    public void init() {
        username = "World!";
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        Customer customer= new Customer();
        customer.setEmail("sun@laioffer.com");
        customer.setPassword("123456");
        customer.setFirstName("rick");
        customer.setLastName("sun");
        customer.setEnabled(true);

        response.getWriter().print(mapper.writeValueAsString(customer));
    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Read customer information from request body
//        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
//        String email = jsonRequest.getString("email");
//        String firstName = jsonRequest.getString("first_name");
//        String lastName = jsonRequest.getString("last_name");
//        int age = jsonRequest.getInt("age");
//        // Print customer information to IDE console
//        System.out.println("Email is: " + email);
//        System.out.println("First name is: " + firstName);
//        System.out.println("Last name is: " + lastName);
//        System.out.println("Age is: " + age);
//        // Return status = ok as response body to the client
//        response.setContentType("application/json");
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("status", "ok");
//        response.getWriter().print(jsonResponse);
//    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        String username = request.getParameter("username");
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Hello " + username + "</h1>");
//        out.println("</body></html>");
//    }


//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("application/json");
//
//
//        JSONObject customer = new JSONObject();
//        customer.put("email", "sun@laioffer.com");
//        customer.put("first_name", "rick");
//        customer.put("last_name", "sun");
//        customer.put("age", 50);
//        response.getWriter().print(customer);
//    }

    public void destroy() {
    }
}