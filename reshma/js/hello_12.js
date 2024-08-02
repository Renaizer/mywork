let A = ["mango", "orange", "chickoo"]


let text = ""
let text1 = ""


for(i=0 ; i< A.length; i++)
{
    let B = A[i].toUpperCase() + "xx"
    text = text + B
}

console.log(text)


for(i=A.length-1 ; i >= 0; i--)
{
    
    let C = A[i].toUpperCase() + "xx"
    text1 = text1 + C
}

console.log(text1)



