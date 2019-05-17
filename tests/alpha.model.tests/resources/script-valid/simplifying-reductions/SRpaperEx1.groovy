import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/SRpaperEx1.alpha")
system = GetSystem(root, "tests.SR.SRpaperEx1")
body = GetSystemBody(system, 0)
ReductionDecomposition(GetExpression(body, "Y", "[0]"), "(i,j,k->k,i)", "(i0,i1->i1)")
Normalize(body)
Distributivity(GetExpression(body, "Y", "[0, 1]"))
NormalizeReduction(GetExpression(body, "Y", "[0, 1, 1]"))
SimplifyingReductions(GetExpression(body, "Y_NR", "[0]"), "[ -1 0 0 ]")

CheckProgram(root)
AShow(system)
