//This is a utility method to print on the console
function print(a){
    console.log(a)
}

// result1 hold the random output (ranging from 0.0 to 1.0) unique every time

function random(a)
{
    let result1 =  Math.random()
    let result2 =  Math.pow(10, a)
    let result3 =  result1 * result2
    let result4 =  Math.ceil(result3)
    return result4
}

// This function can alternatively be written as below

function random1(a)
{
    return Math.ceil(Math.random() * Math.pow(10, a))
}



print(random(6))
print(random1(6))

