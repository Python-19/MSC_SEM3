#Practical 8
# Max z = 40x1 + 50x2
# subj to:
# 2x1+3x2 <= 3
# 8x1+4x2 <= 5
# x1, x2 >= 0

require(lpSolve)
f.obj <- c(40, 50)
f.con <- matrix(c(2, 3, 8, 4), 
                nrow = 2, byrow = TRUE)
f.dir <- c("<=", "<=")
f.rhs <- c(3, 5)

lp("max", f.obj, f.con, f.dir, f.rhs)

lp("max", f.obj, f.con, f.dir, f.rhs)$solution

# Sensitivities
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens = TRUE)$sens.coef.from
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens = TRUE)$sens.coef.to

# Duals
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens = TRUE)$duals

# Duals lower and upper limits
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens = TRUE)$duals.from
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens = TRUE)$duals.to

