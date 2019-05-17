import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/segmentSum.alpha")
system = GetSystem(root, "tests.SR.segmentSum")
body = GetSystemBody(system, 0)
SimplifyingReductions(GetExpression(body, "C", "[0]"), "[ -1 0 ]")

CheckProgram(root)
AShow(system)
