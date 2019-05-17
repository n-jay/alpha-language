package tests.transformations.SR


import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/conv1D.alpha")
system = GetSystem(root, "tests.SR.conv1D")
body = GetSystemBody(system, 0)
SubstituteByDef(GetExpression(body, "c2", "[0]"), "y")
Normalize(GetExpression(body, "c2", "[0]"))
ReductionComposition(GetExpression(body, "c2", "[0]"))
Normalize(body)
ReductionDecomposition(GetExpression(body, "c2", "[0]"), "(i,k->k)", "(i0->)")
Normalize(body)
Distributivity(GetExpression(body, "c2", "[0, 1]"))
NormalizeReduction(GetExpression(body, "c2", "[0, 1, 1]"))
SimplifyingReductions(GetExpression(body, "c2_NR", "[0]"), "[ 1 -1 ]")

CheckProgram(root)
AShow(system)
