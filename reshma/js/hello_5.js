let M = {
    name: "reshma",
    age: 32,
    fav_item: [ "gulab jamun", "pedha", "barfee"]

}
console.log(M.name) 
console.log(M.age) 
console.log(M.fav_item [2]) 
console.log(M.fav_item.length)
console.log(M.name.toUpperCase())
result1= M.fav_item.map(ele => ele.length)
console.log (result1)
result2= M.fav_item.map(ele => ele.toUpperCase())
console.log(result2)
result3= M.fav_item.sort()
console.log(result3)
result4=[...M.fav_item, ...M.fav_item]
console.log(result4)
result5=M.fav_item.map(ele=>[ele,ele]).flatMap(ele=>ele)
console.log(result5)

let X = M.fav_item
         .filter(ele => ele.length === 5)
         .map(ele => ele.toUpperCase())
        //  .map(ele => ele.length)


console.log(X)




