

import groovy.transform.BaseScript
@BaseScript alpha.commands.groovy.AlphaScript alphaScript

r = ReadAlphaBundle("./matmult/alpha/");
p = GetRoot(r, "matmult");
Show(p);
AShow(p);

