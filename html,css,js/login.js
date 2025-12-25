document.getElementById('loginform').addEventListener('submit',function(event)
{
    event.preventDefault();

    const email = document.getElementById('Email').value;
    const password = document.getElementById('pass').value;

    if(email===''|| password==='')
    {
        alert("Please Enter both Email and Password");
        return;
    }

    if(email==="sanjay@gmail.com" && password==="sanjay@123")
    {
        window.location.href="home.html";
    }
    else{
        alert("Invalid Email or Password, Try again");
    }

});