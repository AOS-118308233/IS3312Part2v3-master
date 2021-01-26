Couple of Problems:

1. Login Servlet is technically working, in the sense that it runs, the url includes /loginServlet when you click 
    the log in button but there seems to be a problem with the following piece of code:
        
    if (StringUtils.isStringEmpty(email) || StringUtils.isStringEmpty(password)) {

            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.forward(request, response);

    For some reason it cannot get past this code when I tried to debug it so regardless of what login credentials I use,
    it will always stay at login.jsp

2. Product Servlet won't even run, I don't know why. I've the products from that page hard coded and they are in the 
    comments on the shop.jsp page, shop2.jsp is more hard coded products and the page does run.

3. Cart Servlet, same issue as Product Servlet, I'm not sure if for either servlet if I have all the right code, maybe
    some things just aren't named right. 

4. I have an inkling that the Tomcat server is a bit troublesome at times, I had a big issue with it on Monday night/
    Tuesday morning as my project wouldn't even build in Netbeans and Adam was giving me a hand but neither of us could 
    figure what was wrong, we stopped it, restarted it, killed it from the command line, everything we could think of. 
    In the end I had to start a new project and none of them will run in Chrome but works fine in Edge.

5. I'm pretty sure that the web.xml is fine so that it shouldn't be causing the servlets not to run

6. In the Nav Bar, Shop and the Basket Icon bring me to a 500 Internal Server error, and the buttons on the index.html
    is the same issue. 

