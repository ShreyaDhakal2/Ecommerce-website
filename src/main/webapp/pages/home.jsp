<!DOCTYPE html>
<html lang="en">
<%@page import="util.StringUtils"%>    
    

<%
    // Get the session and request objects
    HttpSession userSession = request.getSession();
    String currentUser = (String) userSession.getAttribute("username");
    String contextPath = request.getContextPath();
%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE-edge">
    <meta name="viewport" content="width-devie-width, initial-scale-1.0">
    <title>Laptop Galaxy</title>
    <!--CSS Link-->
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Jost:wght@700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
     integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" 
     crossorigin="anonymous" referrerpolicy="no-referrer" />

    <link rel="stylesheet" href="../stylesheets/home.css">

</head>
<body>

    <header>
       
        <ul class="navoption">
            <li><a href="#">Home</a></li>
            <li><a href="#">Shop</a></li>
            <li><a href="#">Products</a></li>
            <li><a href="#">About us</a></li>
            <li><a href="#">Docs</a></li>
        </ul>

        <div class="navIcon">
            <a href="#"><i class="bx bx-search"></i></a>
            <a href="#"><i class="bx bx-user"></i></a>
            <a href="#"><i class="bx bx-cart"></i></a>
            <a href="#"><i class="bx bx-menu" id="menu-icon"></i></a>
           
    <div class="dropdown">
        <button class="dropbtn"><%
            // Conditionally set the button label based on user session
            if (currentUser != null) {
                out.print("Logout");
            } else {
                out.print("Login");
            }
        %></button>
        <div class="dropdown-content">
            <a href="<%=contextPath + StringUtils.PAGE_URL_REGISTER%>">Register</a>
            <a href="<%=contextPath + StringUtils.CUSTOMER_LOGIN_PAGE%>">Customer Login</a>
            <a href="<%=contextPath + StringUtils.ADMIN_LOGIN_PAGE%>">Admin Login</a>
        </div>
    </div>
</form>
            
        </div>
    </header>
  
    <section class="main-home">
        <div class="main-text">
            <h5>New Year Sale</h5>
            <h1>Exciting Offers</h1>
            <p>Get the Most Bang for Buck</p>

            <a href="#" class="main-btn">Shop Now<i class="bx bx-right-arrow-alt"></i></a>
        </div>
        <div class="down-arrow">
            <a href="#trending" class="down"><i class='bx bx-down-arrow-alt'></i></a>
        </div>
    </section>
    <!--trending products-section-->
    <section class="trending-product" id="trending">
        <div class="center-text">
            <h2>Our Trending <span>Products</span></h2>
        </div>
        
        <div class="products">
            <div class="row">
                <img src="Images/timage5.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Asus Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>


            <div class="row">
                <img src="Images/timage2.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Dell Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>


            <div class="row">
                <img src="Images/timage3.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Hp Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>

            <div class="row">
                <img src="Images/timage4.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Acer Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>


            <div class="row">
                <img src="Images/timage5.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Lenovo Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>


            <div class="row">
                <img src="Images/timage5.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Lenovo Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>


            <div class="row">
                <img src="Images/timage5.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Lenovo Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>


            <div class="row">
                <img src="Images/timage5.jpg" alt="">
                <div class="product-text">
                    <h5>Sale</h5>
                </div>
                <div class="heart-icon">
                    <i class='bx bx-cart' ></i>
                </div>
                <div class="rating">
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class='bx bx-star' ></i>
                    <i class="bx bxs-star-half"></i>
                </div>
                <div class="price">
                    <h4>Lenovo Laptop</h4>
                    <p>$99 - $250</p>
                </div>
            </div>

            
        </div>
    </section>
    <!-- ClientReview-->
    <section class="client">
        <div class="review">
            <h3>Client Reviews</h3>
            <img src="Images/timage5.jpg" alt="">
            <p>It was easy to spot her. All you needed to do was look at her socks. They were never a matching pair. One would be green while the other would be blue. One would reach her knee while the other barely touched her ankle. Every other part of her was perfect, but never the socks. They were her micro act of rebellion.</p>
            
            <h2>Ram Bahadur</h2>
            <p>Regular Patreon</p>
        </div>
    </section>
    <!--update section-->
    <section class="newsupdate">
        <div class="up-center-text">
            <h2>New Updates</h2>
        </div>

        <div class="update-cart">
            <div class="cart">
                <img src="Images/timage1.jpg" alt="">
                <h5>
                
              