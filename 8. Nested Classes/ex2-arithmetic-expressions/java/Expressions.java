package com.epam.rd.autotasks.arithmeticexpressions;

import java.util.StringJoiner;

public class Expressions {

    public static Variable var(String name, int value) {
        return new Variable(name, value);
    }

    static String buildString(String symbol, Expression... members){
        StringJoiner sj = new StringJoiner(" " + symbol + " ", "(", ")");
        for (Expression member : members) {
            sj.add(member.toExpressionString());
        }
        return sj.toString();
    }

    public static Expression val(int value) {
        return new Expression(){

            @Override
            public int evaluate() {
                return value;
            }

            @Override
            public String toExpressionString() {
                return value < 0 ? "(" + value + ")" : "" + value;
            }
        };
    }

    public static Expression sum(Expression... members){

        return new Expression() {
            @Override
            public int evaluate() {
                int total = 0;
                for (Expression member : members) {
                    total += member.evaluate();
                }
                return total;
            }

            @Override
            public String toExpressionString() {
                return buildString("+", members);
            }
        };
    }

    public static Expression product(Expression... members){
        return new Expression() {
            @Override
            public int evaluate() {
                int total = 1;
                for (Expression member : members) {
                    total *= member.evaluate();
                }
                return total;
            }

            @Override
            public String toExpressionString() {
                return buildString("*", members);
            }
        };
    }

    // returns the result of evaluating of the expression.
    public static Expression difference(Expression minuend, Expression subtrahend){

        return new Expression() {
            @Override
            public int evaluate() {
                return minuend.evaluate() - subtrahend.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "(" + minuend.toExpressionString() + " - " + subtrahend.toExpressionString() + ")";
            }
        };
    }

    // returns string representation of the expression.
    public static Expression fraction(Expression dividend, Expression divisor){
        return new Expression() {
            @Override
            public int evaluate() {
                return dividend.evaluate() / divisor.evaluate();    // Auto cast to int
            }

            @Override
            public String toExpressionString() {
                return "(" + dividend.toExpressionString() + " / " + divisor.toExpressionString() + ")";
            }
        };
    }

}
