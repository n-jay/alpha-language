import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/matmult.alpha")
system = GetSystem(root, "tests.SR.matmultCS")
body = GetSystemBody(system, 0)
SubstituteByDef(GetExpression(body, "CS2", "[0]"), "C")
Normalize(GetExpression(body, "CS2", "[0]"))
ReductionComposition(GetExpression(body, "CS2", "[0]"))
Normalize(body)
ReductionDecomposition(GetExpression(body, "CS2", "[0]"), "(i,j,k->j,k)", "(i0,i1->)")
Normalize(body)
Distributivity(GetExpression(body, "CS2", "[0, 1]"))
NormalizeReduction(GetExpression(body, "CS2", "[0, 1, 1]"))
SimplifyingReductions(GetExpression(body, "CS2_NR", "[0]"), "[ 0 -1 0 ]")

CheckProgram(root)
AShow(system)
