import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/HW2_1.alpha")
system = GetSystem(root, "tests.SR.HW2_1")
body = GetSystemBody(system, 0)
ReductionDecomposition(GetExpression(body, "X", "[0]"), "(i,j,k->i,k)", "(i0,i1->i0)")
Normalize(body)
NormalizeReduction(GetExpression(body, "X", "[0, 1]"))
SimplifyingReductions(GetExpression(body, "X_NR", "[0]"), "[ -1 0 0 ]")

CheckProgram(root)
AShow(system)