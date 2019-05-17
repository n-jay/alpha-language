package tests.transformations.SR


import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/conv2D.alpha")
system = GetSystem(root, "tests.SR.conv2D")
body = GetSystemBody(system, 0)
SubstituteByDef(GetExpression(body, "c2", "[0]"), "y")
Normalize(GetExpression(body, "c2", "[0]"))
ReductionComposition(GetExpression(body, "c2", "[0]"))
Normalize(body)
ReductionDecomposition(GetExpression(body, "c2", "[0]"), "(r,c,i,j->i,j)", "(i0,i1->)")
Normalize(body)
Distributivity(GetExpression(body, "c2", "[0, 1]"))
NormalizeReduction(GetExpression(body, "c2", "[0, 1, 1]"))
SimplifyingReductions(GetExpression(body, "c2_NR", "[0]"), "[ 1 0 -1 0 ]")

CheckProgram(root)
AShow(system)

