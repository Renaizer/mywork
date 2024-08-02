
let A = [5, 10 ,20, 30 , 40 , 50]

let value1 = A[0]

function print(myString) { 
    let newMyString = myString.toUpperCase(); 
    console.log(newMyString) }



if(value1 === 1)
{
    print("In condition 1")
    print("results of condition eApression is " + (A[1] + A[2] + A[3] + A[4] + A[5]))
}
else if(value1 === 2) 
{
    print("In condition 2")
    print("results of condition eApression is " + (A[1] * A[2] * A[3] * A[4] * A[5]) )
    
}
else if(value1 === 3) 
{
    print("In condition 3")
    print("results of condition eApression is " + (A[1] - A[2] - A[3] - A[4] - A[5]) )
    
}
else
{
    print("In condition 4")
    print("results of condition eApression is " + (A[1] + A[2] + A[3] + A[4] + A[5]) )
}
