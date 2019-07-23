import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/HW2_2.alpha")
system = GetSystem(root, "tests.SR.HW2_2")
body = GetSystemBody(system, 0)
ReductionDecomposition(GetExpression(body, "X", "[0]"), "(i,j,k->i,j+k)", "(i0,i1->i0)")
Normalize(body)
NormalizeReduction(GetExpression(body, "X", "[0, 1]"))
SimplifyingReductions(GetExpression(body, "X_NR", "[0]"), "[ 1 -1 -1 ]")
SplitUnionIntoCase(GetExpression(body, "X_NR_add", "[0, 1]"))
PermutationCaseReduce(GetExpression(body, "X_NR_add", "[0]"))

CheckProgram(root)
AShow(system)
