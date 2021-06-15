def name = 'Deepak';
println "Hello World ! from ${name}"
println "$name"

def names = ["rita","james","sarah","john"]

println(names)
def newNames = names.collect{it.toUpperCase()}

println(newNames)

def nums = [12,3,44,36,5] as HashSet

println nums.getClass().getName()

println nums.toString()