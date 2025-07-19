
let registerForm = document.querySelector("form")
registerForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const user = {
        firstName: document.getElementById('FirstName').value,
        lastName: document.getElementById('LastName').value,
        username: document.getElementById('UserName').value,
        password: document.getElementById('Password').value,
        email: document.getElementById('Email').value
    }

    fetch('http://localhost:9999/auth/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
        .then(async response => {
            if (response.ok)
            alert("User has successfully been created!");
            document.getElementById('FirstName').value = "";
            document.getElementById('FastName').value = "";
            document.getElementById('UserName').value = "";
            document.getElementById('Password').value = "";
            document.getElementById('Email').value = "";
        }
)}
) 
