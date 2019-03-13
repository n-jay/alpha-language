package tests.transformations.SR

import alpha.model.util.PrintAST
import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/conv2D.alpha")
system = GetSystem(root, "conv2D")
body = GetSystemBody(system)

CheckProgram(root)

eq = GetEquation(body, "c2")

reduce = GetExpression(eq)


SubstituteByDef(body, "c2", "y")

Normalize(system)
ReductionComposition(system)
ReducionDecomposition(eq, "(r,c,i,j->i,j)", "(i,j->)")

FactorOutFromReduction(body, "c2", "0,1,1,1,1")

Normalize(system)
NormalizeReduction(system)

RenameVariable(system, "c2_NR", "X")

SimplifyingReductions(body, "X", "(r,c,i,j->r,c+1,i,j-1)")

CheckProgram(root)

AShow(system)
