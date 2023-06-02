package Clases;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
import Tablas.TablaErrores;

%%
%state A
%cupsym sym
%class Lexico
%cup
%public
%unicode
%line
%char
%ignorecase




/*SUSTANTIVOS*/
SUSTANTIVO="action"|"age"|"air"|"animal"|"answer"|"apple"|"art"|"baby"|"back"|"ball"|"bank"|"bed"|"bill"|"bird"|"blood"|"boat"|"body"|"bone"|"book"|"bottom"|"box"|"boy"|
"brother"|"building"|"business"|"call"|"capital"|"case"|"cat"|"cause"|"cent"|"center"|"century"|"chance"|"change"|"check"|"child""church"|"circle"|"city"|"class"|
"clothes"|"cloud"|"coast"|"color"|"company"|"consonant"|"copy"|"corn"|"cotton"|"country"|"course"|"cow"|"crowd"|"day"|"dictionary"|"direction"|"distance"|"doctor"|
"dollar"|"door"|"ear"|"earth"|"egg"|"energy"|"example"|"experience"|"eye"|"game"|"garden"|"gas"|"girl"|"glass"|"gold"|"government"|"grass"|"group"|"hair"|"hand"|"hat"|
"head"|"heart"|"heat"|"history"|"hole"|"home"|"horse"|"hour"|"house"|"ice"|"idea"|"inch"|"industry"|"information"|"insect"|"interest"|"iron"|"island"|"job"|"key"|"lake"|
"land"|"language"|"law"|"leg"|"level"|"lie"|"life"|"light"|"line"|"list"|"machine"|"man"|"map"|"material"|"meat"|"middle"|"mile"|"milk"|"mind"|"minute"|"money"|"month"|
"moon"|"mouth"|"music"|"nation"|"night"|"nose"|"note"|"number"|"object"|"ocean"|"office"|"page"|"pair"|"paper"|"paragraph"|"park"|"part"|"party"|"past"|"person"|"pound"|
"president"|"problem"|"product"|"property"|"question"|"race"|"radio"|"rain"|"reason"|"record"|"region"|"ring"|"river"|"road"|"rock"|"row"|"rule"|"sand"|"school"|"science"|
"sea"|"seat"|"second"|"sentence"|"set"|"side"|"sign"|"sister"|"size"|"skin"|"snow"|"soldier"|"solution"|"son"|"spring"|"square"|"star"|"state"|	"stop"|"street""student"|"sugar"|
"sun"|"village"|"vowel"c"war"|"weather"|"weight"|"wife"|"window"|"winter"|"woman"|"word"|"world"|"year"
/*FIN SUSTANTIVOS*/

/*Auxiliares*/
AUX_FUTURO= "will"

/*Verbo ing*/
VER_ING="ing"


/*Adjetivos*/
  ADJ_POSESIVO="my"|"your"|"his"|"her"|"its"|"our"|"your"|"their"
  ADJ_DEMOSTRATIVO="this"|"that"|"these"|"those"
  
ADJ_CALIFICATIVO="tall"|"high"|"short"|"low"|"long"|"large"|"big"|"fit"|"small"|"blue"|"dark"|"sad"|"angry"|"happy"|"nervous"|"upset"|"crazy"|"hungry"|"starving"|"sympathetic"|"round"|
"triangular"|"square"|"sharp"|"rectangular"|"wide"|"sensible"|"friendly"|"polite"|"lazy"|"clever"|"nice"|"dirty"|"wet"|"dry"|"stinky"|"great"|"healthy"|"hot"|"cold"|"loud"|"sweet"|"salty"|
"bitter"|"sour"|"delicious"|"disgusting"|"spicy"|"soft"|"bland"|"icy"|"fresh"|"spanish"|"english"|"french"|"italian"|"awful"|"boiling"|"fascinating"|"freezing"|"filthy"|"furious"|"huge"|"spotless"|"tiny"|"wonderful"

ADJ_NUMERAL_CARDINAL="zero"|"one"|"two"|"three"|"four"|"five"|"six"|"seven"|"eight"|"nine"|"ten"|"eleven"|"twelve"|"thirteen"|"fourteen"|"fifteen"|"sixteen"|"seventeen"|
"eighteen"|"nineteen"|"twenty"|"thirty"|"fourty"|"fifty"|"sixty"|"seventy"|"eighty"|"ninety"|"ninety-one"|"ninety-two"|"one hundred"|"two hundred"|
"one thousand"|"ten thousand"|"one million"
 
 ADJ_NUMERAL_ORDINAL="first"|"second"|"third"|"fourth"|"fifth"|"sixth"|"seventh"|"eighth"|"ninth"|"tenth"|"eleventh"|"twelfth"|"thirteenth"|"fourteenth"|"fifteenth"|"sixteenth"|
"seventeenth"|"eighteenth"|"nineteenth"|"twentieth"|"thirtieth"|"fortieth"|"fiftieth"|"sixtieth"|"seventieth"|"eightieth"|"ninetieth"|"ninety-first"|
"ninety-second"|"ninety-third"|"ninety-fourth"|"one hundredth"|"one thousandth"|"one millionth"
  
ADJ_INDEFINIDO="all"|"any"|"both"|"each"|"either"|"enough"|"few"|"less"|"little"|"much"|"more"|"many"|"one"|"other"|"others"|"muchos"|"several"|"some"|"such"
/*Fin Adjetivos*/

/*ARTICULOS*/
  ART_DEFINIDO="the"
  ART_INDEFINIDO="a"|"an"
/*FIN ARTICULOS*/

/*PRONOMBRES*/
  PRO_PERSONAL="i"|"you"|"he"|"she"|"it"|"we"|"they"
  PRO_DEMOSTRATIVO="this"|"that"|"these"|"those"
  PRO_INTERROGATIVO="who"|"whom"|"whose"|"what"|"which"
/*FIN PRONOMBRES*/


VER_IRREGULAR_PASADOSIMPLE="was"|"became"|"began"|"bit"|"blew"|"broke"|"brought"|"built"|"bought"|"could"|"caught"|"chose"|"came"|"cost"|"cut"|"did"|
"drew"|"drank"|"drove"|"ate"|"fell"|"felt"|"fought"|"found"|"flew"|"forgot"|"forgave"|"froze"|"got"|"gave"|"went"|"grew"|"hung"|"had"|"hid"|"hit"|
"held"|"hurt"|"kept"|"knew"|"led"|"left"|"lent"|"let"|"lost"|"made"|"meant"|"met"|"paid"|"put"|"read"|"rode"|"rang"|"rose"|"ran"|"said"|"saw"|"sold"|
"sent"|"set"|"showed"|"shut"|"sang"|"sank"|"sat"|"slept"|"spoke"|"spent"|"stole"|"swam"|"took"|"taught"|"told"|"thought"|"threw"|"understood"|"woke"|"wore"|"won"|"wrote"

VER_IRREGULAR_PASADOPARTICIPIO="been"|"become"|"begun"|"bitten"|"blown"|"broken"|"brought"|"built"|"bought"|"been able"|"caught"|"chosen"|"come"|"cost"|"cut"|"done"|"drawn"|
"drunk"|"drive"|"eaten"|"fallen"|"fougth"|"found"|"flown"|"forgotten"|"forgiven"|"frozen"|"got gotten"|"given"|"gone"|"grown"|"hung"|"had"|"hidden"|"hit"|"held"|"hurt"|
"kept"|"know"|"led"|"left"|"lent"|"lost"|"made"|"meant"|"met"|"paid"|"put"|"read"|"ridden"|"rung"|"risen"|"run"|"said"|"seen"|"sold"|"sent"|"set"|"shown"|"shut"|"sung"|
"sunk"|"sat"|"slept"|"spoken"|"spent"|"stolen"|"swum"|"taken"|"taught"|"told"|"thought"|"thrown"|"understood"|"woken"|"worn"|"won"|"written"

//VERBOS REGULARES
VERBO_REGULAR="abandon"|"abolish"|"absolve"|"absorb"|"abuse"|"accede"|"accelerate"|"accent"|"accept"|"accuse"|"accustom"|"archieve"|"acquire"|"act"|
"add"|"address"|"admire"|"admit"|"adore"|"adorn"|"advance"|"advertise"|"advise"|"affirm"|"agree"|"allow"|"amount"|"amuse"|"announce"|"annoy"|"answer"|
"apologize"|"appear"|"appoint"|"approach"|"approve"|"arrange"|"arrive"|"ask"|"assure"|"astonish"|"attack"|"attempt"|"attend"|"attract"|"avoid"|"bathe"|
"beg"|"believe"|"belong"|"blame"|"book"|"call"|"carry"|"cash"|"cease"|"change"|"check"|"claim"|"clean"|"clear"|"climb"|"close"|"collect"|"comb"|"combine"|
"command"|"commit"|"compare"|"complain"|"compose"|"conceal"|"consider"|"consist"|"contain"|"continue"|"copy"|"correct"|"cough"|"count"|"cover"|"cross"|"crown"|
"cry"|"damage"|"dance"|"dawn"|"deceive"|"decide"|"declare"|"defend"|"deliver"|"desire"|"despise"|"destroy"|"detach"|"develop"|"devote"|"devour"|"discover"|"dislike"|
"disturb"|"divide"|"drag"|"drop"|"dry"|"earn"|"elect"|"employ"|"enclose"|"encourage"|"end"|"enjoy"|"enter"|"estabilish"|"esteem"|"evoke"|"exchange"|"expect"|"explain"|
"explode"|"expose"|"express"|"extract"|"fail"|"fear"|"fetch"|"fill"|"finish"|"fish"|"fit"|"fix"|"float"|"fold"|"follow"|"found"|"gain"|"gamble"|"gather"|"govern"|"grant"|
"greet"|"guard"|"guess"|"handle"|"hang"|"happen"|"hate"|"heat"|"help"|"hire"|"hope"|"hunt"|"hurry"|"imagine"|"imply"|"import"|"impress"|"improve"|"include"|"increase"|
"inquire"|"intend"|"invent"|"invite"|"iron"|"join"|"joke"|"jump"|"justify"|"kick"|"kill"|"kiss"|"knock"|"land"|"last"|"laugh"|"lie"|"like"|"listen"|"live"|"look"|"love"|
"lower"|"maintain"|"marry"|"measure"|"measure"|"mend"|"mention"|"move"|"name"|"note"|"notice"|"number"|"obley"|"obligue"|"occupy"|"offer"|"open"|"order"|"organize"|"pack"|
"paint"|"pass"|"permit"|"place"|"play"|"please"|"possess"|"practise"|"prefer"|"prepare"|"present"|"produce"|"promise"|"propose"|"pull"|"punish"|"push"|"rain"|"reach"|"receive"|
"refer"|"refyse"|"relieve"|"remain"|"remember"|"remind"|"remove"|"rent"|"repair"|"repeat"|"reply"|"report"|"request"|"require"|"rest"|"return"|"rush"|"sail"|"save"|"seem"|
"sharpen"|"shout"|"sign"|"smile"|"smoke"|"sound"|"start"|"stop"|"study"|"suffer"|"suggest"|"suppose"|"surprise"|"talk"|"tame"|"taste"|"tire"|"touch"|"test"|"thank"|"tie"|
"translate"|"travel"|"trouble"|"trust"|"try"|"turn"|"unite"|"use"|"vary"|"visit"|"wait"|"walk"|"want"|"wash"|"watch"|"weigh"|"wish"|"work"|"worry"|"wound"|"sleep"|"be"|"become"|
"begin"|"bite"|"blow"|"break"|"bring"|"build"|"buy"|"can"|"catch"|"choose"|"come"|"cost"|"cut"|"do"|"draw"|"drink"|"drive"|"eat"|"fall"|"feel"|"fight"|"find"|"fly"|"forget"|
"forgive"|"freeze"|"get"|"give"|"go"|"grow"|"hang"|"have"|"hide"|"hit"|"hold"|"hurt"|"keep"|"know"|"lead"|"leave"|"lend"|"let"|"lose"|"make"|"mean"|"meet"|"pay"|"put"|"read"|
"ride"|"ring"|"rise"|"run"|"say"|"see"|"sell"|"send"|"set"|"show"|"shut"|"sing"|"sink"|"sit"|"speak"|"spend"|"steal"|"swim"|"take"|"teach"|"tell"|"think"|"throw"|"understand"|"wake"|"wear"|"win"|"write"|"does"
/*FIN VERBOS*/

/*ADVERBIOS*/
  ADVIO_TIEMPO="now"|"yesterday"|"today"|"tomorrow"|"before"|"last night"|"still"|"when"|"afterwards"|"then"|"never"|"then"|"while"|"never"|"first"|"always"|"late"|"still"|"yet"|"already"|"next week"
  ADVIO_LUGAR="here"|"there"|"over there"|"here"|"outside"|"down"|"before"|"around"|"upstairs"|"back"|"close"|"under"|"where"|"onin front"|"ofoutside"|"far"
  ADVIO_CANTIDAD="something"|"nothing"|"hardly"|"anough"|"almost"|"how much"|"too much"|"more"|"less"|"much"|"little"|"all"|"only"|"half"|"so"|"so much"
  ADVIO_MODO="so"|"well"|"bad"|"almost"|"how"|"slowly"|"fast"|"slow"|"fast"
  ADVIO_AFIRMACION="if"|"of course"|"exact"|"really"|"certainly"|"surely"|"fair"|"already"
  ADVIO_NEGACION="no"|"never"|"not"|"never"
  ADVIO_DUDA="perhaps"|"probably"
/*FIN ADVERBIOS*/  


/*PREPOSICION*/
PREPOSICION="about"|"above"|"across"|"after"|"against"|"among"|"around"|"as"|"at"|"before"|"behind"|"below"|"beneath"|"beside"|"between"|"beyond"|
"but"|"by"|"despite"|"down"|"during"|"except"|"for"|"from"|"in"|"inside"|"into"|"near"|"next"|"of"|"on"|"opposite"|"outside"|"over"|"per"|"plus"|
"round"|"since"|"than"|"through"|"till"|"to"|"toward"|"under"|"unlike"|"until"|"up"|"via"|"with"|"whithin"|"whitout"|"according to"|"because of"|
"close to"|"due to"|"except to"|"far from"|"inside of"|"instead of"|"near to"|"nex to"|"outside of"|"prior to"|"as far as"|"as well as"|"in addition to"|
"in front of"|"in spite of"|"on behalf of"|"on top of"
/*FIN PREPOSICION*/

/*CONJUNCIONES COORDINANTES*/
CONJUN_COOR_COPULATIVA="and"|"not only"|"but also"|"not only"|"but"|"as well"|"both"|"and"|"no sooner"|"than"
CONJUN_COOR_ADVERSATIVA="but"|"however"|"nonetheless"|"nevertheless"|"yet"|"even so"|"still"|"instead"|"on the contrary"
CONJUN_COOR_DISTRIBUTIVA="as soon"|"as"|"ya"|"already"|"here"|"there"|"these"|"those"|"or"|"or good"
CONJUN_COOR_DISYUNTIVA="or"|"either"|"neither"|"nor"|"whether or"|"or else"|"otherwise"
CONJUN_COOR_EXPLICATIVA="that is to say"|"rather"|"it's more"|"that is"|"this is"|"rather"
/*FIN CONJUNCIONES COORDINANTES*/



/*CONJUNCIONES SUBORDINANTES */
  CONJUN_SUBOR_CONDICIONAL="if"|"whenever"|"as long as"
  CONJUN_SUBOR_CAUSAL="anymore because"|"it because"|"because"|"since i"
  CONJUN_SUBOR_CONSECUTIVA="then"|"so"|"that it"|"so"|"in this way"|"therefore"
  CONJUN_SUBOR_CONSESIVA="even if"|"by more than"
  CONJUN_SUBOR_COMPARATIVA="than"|"to"|"like"|"as well"
  CONJUN_SUBOR_FINAL="so that"|"to"
/*FIN CONJUNCIONES SUBORDINANTES*/

/*INTERJECCION*/
 INTERJECCION="wow"|"ouch"|"uh-huh"|"oops"|"hey"
/*FIN INTERJECCION*/

/*CONTRACCION*/
  CONTRACCION="i’m"|"you’re"|"he’s"|"she’s"|"you’re"|"it’s"|"we’re"|"you’re"|"they’re"
/*FIN CONTRACCION*/


/*SIGNOS*/
  PUNTO="."
  COMA=","
  PUNTOCOMA=";"
  DOSPUNTOS=":"
  INTERROGACIONABIERTO="¿"
  INTERROGACIONCERRADO="?"
  ADMIRACIONABIERTO="¡"
  ADMIRACIONCERRADO="!"
  PARENTESISABIERTO="("
  PARENTESISCERRADO=")"
  CORCHETEABIERTO="["
  CORCHETECERRADO="]"
  GUION="-"
  ASTERISCO="*"
  DIAGONAL="/"
/*FIN SIGNOS*/

    




WHITE=[ \t\r\n]
%{
public String lexeme;
public String error;
TablaErrores te=new TablaErrores();

%}
%%
{WHITE} {/* ignore */}
"//".* {/* ignore */}


{SUSTANTIVO} {return new Symbol(sym.sustantivo, yychar,yyline,new String(yytext()));}

{AUX_FUTURO} {return new Symbol(sym.aux_futuro, yychar,yyline,new String(yytext()));}
{VER_ING} {return new Symbol(sym.ver_ing, yychar,yyline,new String(yytext()));}
{ADJ_POSESIVO} {return new Symbol(sym.adj_posesivo, yychar,yyline,new String(yytext()));}
{ADJ_DEMOSTRATIVO} {return new Symbol(sym.adj_demostrativo, yychar,yyline,new String(yytext()));}
{ADJ_CALIFICATIVO} {return new Symbol(sym.adj_calificativo, yychar,yyline,new String(yytext()));}
{ADJ_NUMERAL_CARDINAL} {return new Symbol(sym.adj_numeral_cardinal, yychar,yyline,new String(yytext()));}
{ADJ_NUMERAL_ORDINAL} {return new Symbol(sym.adj_numeral_ordinal, yychar,yyline,new String(yytext()));}
{ADJ_INDEFINIDO} {return new Symbol(sym.adj_indefinido, yychar,yyline,new String(yytext()));} 

{ART_DEFINIDO} {return new Symbol(sym.art_definido, yychar,yyline,new String(yytext()));}
{ART_INDEFINIDO} {return new Symbol(sym.art_indefinido, yychar,yyline,new String(yytext()));}

{PRO_PERSONAL} {return new Symbol(sym.pro_personal, yychar,yyline,new String(yytext()));}
{PRO_DEMOSTRATIVO} {return new Symbol(sym.pro_demostrativo, yychar,yyline,new String(yytext()));}
{PRO_INTERROGATIVO} {return new Symbol(sym.pro_interrogativo, yychar,yyline,new String(yytext()));}

//{VER_IRREGULAR_INFINITO} {return new Symbol(sym.ver_irregular_infinito, yychar,yyline,new String(yytext()));}
{VER_IRREGULAR_PASADOSIMPLE} {return new Symbol(sym.ver_irregular_pasadosimple, yychar,yyline,new String(yytext()));}
{VER_IRREGULAR_PASADOPARTICIPIO} {return new Symbol(sym.ver_irregular_pasadoparticipio, yychar,yyline,new String(yytext()));}

{VERBO_REGULAR} {return new Symbol(sym.verbo_regular, yychar,yyline,new String(yytext()));}

{ADVIO_TIEMPO} {return new Symbol(sym.advio_tiempo, yychar,yyline,new String(yytext()));}
{ADVIO_LUGAR} {return new Symbol(sym.advio_lugar, yychar,yyline,new String(yytext()));}
{ADVIO_CANTIDAD} {return new Symbol(sym.advio_cantidad, yychar,yyline,new String(yytext()));}
{ADVIO_MODO} {return new Symbol(sym.advio_modo, yychar,yyline,new String(yytext()));}
{ADVIO_AFIRMACION} {return new Symbol(sym.advio_afirmacion, yychar,yyline,new String(yytext()));}
{ADVIO_NEGACION} {return new Symbol(sym.advio_negacion, yychar,yyline,new String(yytext()));}
{ADVIO_DUDA} {return new Symbol(sym.advio_duda, yychar,yyline,new String(yytext()));}




{PREPOSICION} {return new Symbol(sym.preposicion, yychar,yyline,new String(yytext()));}

{CONJUN_COOR_COPULATIVA} {return new Symbol(sym.conjun_coor_copulativa, yychar,yyline,new String(yytext()));}
{CONJUN_COOR_ADVERSATIVA} {return new Symbol(sym.conjun_coor_adversativa, yychar,yyline,new String(yytext()));}
{CONJUN_COOR_DISTRIBUTIVA} {return new Symbol(sym.conjun_coor_distributiva, yychar,yyline,new String(yytext()));}
{CONJUN_COOR_DISYUNTIVA} {return new Symbol(sym.conjun_coor_disyuntiva, yychar,yyline,new String(yytext()));}
{CONJUN_COOR_EXPLICATIVA} {return new Symbol(sym.conjun_coor_explicativa, yychar,yyline,new String(yytext()));}




{CONJUN_SUBOR_CONDICIONAL} {return new Symbol(sym.conjun_subor_condicional, yychar,yyline,yytext());}
{CONJUN_SUBOR_CAUSAL} {return new Symbol(sym.conjun_subor_causal, yychar,yyline,yytext());}
{CONJUN_SUBOR_CONSECUTIVA} {return new Symbol(sym.conjun_subor_consecutiva, yychar,yyline,yytext());}
{CONJUN_SUBOR_CONSESIVA} {return new Symbol(sym.conjun_subor_consesiva, yychar,yyline,yytext());}
{CONJUN_SUBOR_COMPARATIVA} {return new Symbol(sym.conjun_subor_comparativa, yychar,yyline,yytext());}
{CONJUN_SUBOR_FINAL} {return new Symbol(sym.conjun_subor_final, yychar,yyline,yytext());}


{INTERJECCION} {return new Symbol(sym.interjeccion, yychar,yyline,yytext());}

{CONTRACCION} {return new Symbol(sym.contraccion, yychar,yyline,yytext());}

{PUNTO} {return new Symbol(sym.punto, yychar,yyline,yytext());}
{COMA} {return new Symbol(sym.coma, yychar,yyline,yytext());}
{PUNTOCOMA} {return new Symbol(sym.puntocoma, yychar,yyline,yytext());}
{DOSPUNTOS} {return new Symbol(sym.dospuntos, yychar,yyline,yytext());}
{INTERROGACIONABIERTO} {return new Symbol(sym.interrogacionabierto, yychar,yyline,yytext());}
{INTERROGACIONCERRADO} {return new Symbol(sym.interrogacioncerrado, yychar,yyline,yytext());}
{ADMIRACIONABIERTO} {return new Symbol(sym.admiracionabierto, yychar,yyline,yytext());}
{ADMIRACIONCERRADO} {return new Symbol(sym.admiracioncerrado, yychar,yyline,yytext());}
{PARENTESISABIERTO} {return new Symbol(sym.parentesisabierto, yychar,yyline,yytext());}
{PARENTESISCERRADO} {return new Symbol(sym.parentesiscerrado, yychar,yyline,yytext());}
{CORCHETEABIERTO} {return new Symbol(sym.corcheteabierto, yychar,yyline,yytext());}
{CORCHETECERRADO} {return new Symbol(sym.corchetecerrado, yychar,yyline,yytext());}
{GUION} {return new Symbol(sym.guion, yychar,yyline,yytext());}
{ASTERISCO} {return new Symbol(sym.asterisco, yychar,yyline,yytext());}
{DIAGONAL} {return new Symbol(sym.diagonal, yychar,yyline,yytext());}

. { te.addTable("Error Lexico", yytext()+ " fila "+(yyline+1));
//JOptionPane.showMessageDialog(null, yytext()+ " fila "+(yyline+1), "Error Lexico", JOptionPane.ERROR_MESSAGE);
//System.out.println("Error lexico: "+yytext()+ " fila "+(yyline+1));
} 