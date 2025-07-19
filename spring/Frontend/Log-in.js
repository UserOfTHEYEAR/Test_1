
const loginForm = document.querySelector('form');

loginForm.addEventListener('submit', (e) => {
e.preventDefault();

const request = {
username: document.getElementById('username').value,
password: document.getElementById('password').value
}

fetch('http://localhost:9999/auth/login', {
method: 'POST',
headers: {
'Content-Type':'application/json'
},
body: JSON.stringify(request)

})
.then(async response => {
if (response.ok) {
const token = await response.text();
localStorage.setItem('token', token);
alert("Login successfully")
}else{
let data = response.json();
alert(data.message); 
}
})
})