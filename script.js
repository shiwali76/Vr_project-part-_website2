document.addEventListener("DOMContentLoaded", function() {
    // Variables for form and toggle links
    const signInForm = document.querySelector('.box_login');
    const signUpForm = document.querySelector('.box_login_register');
    const signInLink = document.querySelector('.login_link');
    const signUpLink = document.querySelector('.register_link');
    const largbox = document.querySelector('.largbox');
  
    // Switch to Sign In
    signInLink.addEventListener('click', function(event) {
      event.preventDefault();
      signUpForm.style.transform = 'translateX(430px)';
      signInForm.style.transform = 'translateX(0)';
    });
  
    // Switch to Sign Up
    signUpLink.addEventListener('click', function(event) {
      event.preventDefault();
      signInForm.style.transform = 'translateX(430px)';
      signUpForm.style.transform = 'translateX(0)';
    });
  
    // Handle Sign In Form Submission
    signInForm.addEventListener('submit', function(event) {
      event.preventDefault();
      const email = document.querySelector('input[name="email"]').value;
      const password = document.querySelector('input[name="psw"]').value;
  
      if (email && password) {
        alert(`Sign In Successful! Email: ${email}`);
      } else {
        alert('Please fill in both fields.');
      }
    });
  
    // Handle Sign Up Form Submission
    signUpForm.addEventListener('submit', function(event) {
      event.preventDefault();
      const username = document.querySelector('input[name="usrnm"]').value;
      const email = document.querySelector('input[name="email"]').value;
      const password = document.querySelector('input[name="psw"]').value;
  
      if (username && email && password) {
        alert(`Sign Up Successful! Username: ${username}`);
      } else {
        alert('Please fill in all fields.');
      }
    });
  });
  