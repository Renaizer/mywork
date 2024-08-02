function sum ( a, b, c )
{
    return a+b+c
}

function print (b)
{
    console.log(b)
}
function JsonReturner(a, b)
{
     let Json = {
        sum: ( a+b),
        difference: (a-b)
        multiplication: (a*b)
        division: (a/b)

     }

     return Json

}

let result = JsonReturner (60, 50)
print(result)


