/* recognize tokens for the calculator and print them out */
%{
#include "calc.h"
#include "calc.tab.h"
%}

/* float exponent */
EXP	([Ee][-+]?[0-9]+)

%%
"+" |
"-" |
"*" |
"/" |
"|" |
"(" |
")" { return yytext[0]; }

[0-9]+"."[0-9]*{EXP}? |
"."?[0-9]+{EXP}? { yylval.d = atof(yytext); return NUMBER; }


\n	{ return EOL; }
[ \t] { /* ignore whitespace */ }
. 	{ printf("Mystery character %c\n", *yytext); }
%%

