target tm.test.simple3D

context {:N>30}
band[a] {
	A : [i]
	B : [i]
} + band [b,c] {
	A : [j,k]
	B : [j,k]
	unroll (0)
	atomic (1)
	isolate ({ : 10<=c<=20 } unroll(1))
}

