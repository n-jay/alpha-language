package tests.transformations.SR

import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/simplifying-reductions/conv1D.alpha")
system = GetSystem(root, "conv1D")
body = GetSystemBody(system)

CheckProgram(root)

eq = GetEquation(body, "c2")

reduce = GetExpression(eq)


SubstituteByDef(body, "c2", "y")

Normalize(system)
ReductionComposition(system)
ReducionDecomposition(eq, "(i,k->k)", "(k->)")

FactorOutFromReduction(body, "c2", "0,1,1,1,1")

Normalize(system)
NormalizeReduction(system)

RenameVariable(system, "c2_NR", "X")

SimplifyingReductions(body, "X", "(i,j->i+1,j-1)")

CheckProgram(root)

AShow(system)

