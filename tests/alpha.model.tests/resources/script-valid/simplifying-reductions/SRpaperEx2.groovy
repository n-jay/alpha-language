import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

root = ReadAlpha("resources/src-valid/simplifying-reductions/SRpaperEx2.alpha")
system = GetSystem(root, "tests.SR.SRpaperEx2")
body = GetSystemBody(system, 0)
SimplifyingReductions(GetExpression(body, "Y", "[0]"), "[ -1 0 0 ]")

CheckProgram(root)
AShow(system)
