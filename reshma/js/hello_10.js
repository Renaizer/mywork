function rand (a)
{ 
    let A = Math.random( ) * Math.pow(10,a)
    let B = Math.ceil(A)
    return B

}
let r = rand(5)




document.getElementById("demo").innerHTML = r;