import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/prefixSum.alpha")
system = GetSystem(root, "tests.SR.prefixSum")
body = GetSystemBody(system, 0)
SimplifyingReductions(GetExpression(body, "C", "[0]"), "[ -1 0 ]")

CheckProgram(root)
AShow(system)
