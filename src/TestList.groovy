def nums =[2,3,5,1,4,3,1]
println nums
nums.each {println it}
nums.each {aa ->println aa}
def doubled = nums.collect {it * 2}
println doubled