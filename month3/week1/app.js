const http = new EassyHTTP;

const data = {
    name: 'uttej',
    username:'uttejch',
    email:'uttej@gmail.com'
}

http.put('https://jsonplaceholder.typicode.com/users/2',data)

.then(data=> console.log(data))
.catch(err=>console.log(err));