# Hallo!
In den letzten Tagen habe ich mich viel mit Design Patterns auseinandergesetzt. 
Dabei habe ich viel über kompaktes und smartes Design gelernt.
Ich freue mich schon mein neu erlangtes Wissen mit euch zu teilen!
## Was ist ein Design Pattern?
Das Buch mit dem ich mich jetzt so lange beschäftigt habe definiert ein _Pattern_ als:

> "**A pattern** is a solution to a problem in a context."

Was will uns das sagen?

Es gibt viele Situationen (_context_) in denen man auf ähnliche Herausforderungen (_problem_) stößt. 
Es gibt Muster (_pattern_) die sich zur Lösung (_solution_) anwenden lassen.

Design Pattern liefern getestete, effiziente und bekannte Lösungen, die einem helfen können, Code zu straffen, 
weniger problemanfällig und für mehr Leute verständlich zu machen.

### Aber was macht ein Pattern denn jetzt genau?
Pauschal ist jedes Pattern anders. Und sie haben alle unterschiedliche Anwendungsfälle. Es gibt allerdings einige
Vorteile, die bei Design Patterns immer wieder vorkommen:

> **Design Pattern helfen dabei: **
> - Ein gemeinsames Vokabular mit anderen OO-Designern aufzubauen.
> - Fehler und Problemanfälligkeit zu reduzieren. (Patterns sind von so vielen Entwicklern getestet, da sind Probleme 
    meist ausgemerzt.)
> - Die Prinzipien der objekt-orientierten Programmierung einzuhalten.
> - Abstraktion zu schaffen.
> - Die Kopplung zwischen Klassen lose zu halten.
> - Die Stellen an denen Veränderungen vorgenommen werden abzukapseln.
> - Klassen offen für Erweiterung zu halten, ohne bearbeitet werden zu müssen.
> - Rigide Vererbungsstrukturen zu vermeiden.
> - …

Design Patterns können also ein sehr mächtiges Werkzeug sein, wenn es darum geht, soliden, verständlichen und sicheren
Code zu schreiben.

## Wie wende ich ein Pattern an?

_**nicht immer!**_

Es gibt für jedes Pattern bestimmte Zwecke, Stellen an denen sie _natürlich_ hingehören. Diese Stellen zu bemerken und
ein passendes Pattern dann anzuwenden ist was Pattern-Meister ausmacht. Jedes Problem mit Pattern lösen zu wollen, 
oder noch schlimmer, jedes Programm im Voraus durch die Linse von Pattern zu planen, bläht Projekte schnell auf und 
macht sie komplexer als nötig.

> **Gründe, Design Patterns nicht anzuwenden: **
> - Es wäre Overkill.
> - Neue Klassen und Strukturen erhöhen die Komplexität.
> - Mehr Ebenen des Programms können die Effizienz auch senken.

Meistens kommen Pattern in der Refaktorierung zum Einsatz. Zu diesem Zeitpunkt ist die Funktionsweise des Codes bekannt
und seine Probleme fallen auf. Hier kann man mit Design Pattern oft aufräumen.

Die Liste von Design Pattern ist riesig und wächst stets, deshalb wäre ein umfassender Überblick viel zu groß.
aber es gibt viele Ressourcen, online und in Katalogen, in welchen Designs mitsamt ihren Anwendungsfällen und
Codebeispielen vorgestellt werden. Sich mit Diesen vertraut zu machen, wenigstens zu wissen, dass es ein Pattern für
diese Situation gibt, ist schon alles, was man wirklich im Kopf zu haben braucht.

## Was gibt es denn für Pattern?

Immer langsam! Zum spannenden Teil kommen wir schnell genug.

Davor ist es nämlich gut, sich mit den **Prinzipien der objekt-orientierten Programmierung** vertraut zu machen:

### Prinzipien der objekt-orientierten Programmierung

> Verkapsel, was variiert.

Es spart viel Zeit und Code, wenn man nur eine Stelle anstatt von potenziell hunderten anpassen muss.

> Bevorzuge Komposition über Vererbung.

Vererbung ist nicht der einzige Weg um sicherzustellen, dass bestimmte Klassen ihre Funktionen haben. Auf Vererbung
zu verzichten hilft viel bei der Flexibilität des Codes, ermöglicht dynamische Anpassung des Verhaltens von Klassen
und hilft dabei, Familien von Algorithmen in eigene Klassen abzukapseln. 

> Programmiere zu Interfaces, nicht mit konkreten Implementierungen.

Der Grundbaustein der Polymorphie. Offen für viele verschiedene Klassen zu bleiben und trotzdem sicher sein zu können,
dass sie alle die benötigten Eigenschaften und Methoden beinhalten.

> Strebe nach loser Kopplung zwischen interagierenden Klassen.

Die Flexibilität und Widerstandsfähigkeit deines Codes wird stark gesteigert, wenn Klassen zwar miteinander interagieren
können, aber (fast) nichts voneinander wissen. Die Klassen können unabhängig voneinander verwendet und bearbeitet 
werden, und können nur auf festgelegte Weisen miteinander interagieren.

> Halte deine Klassen offen für Erweiterung und geschlossen für Modifikation.

Wenn du ein das Verhalten einer Klasse verändern möchtest, kannst du sie mithilfe von Vererbung erweitern. Die 
Original-Klasse muss nie bearbeitet werden. So wird der Code widerständiger und bleibt flexibel.

> Sei nie von konkreten Klassen abhängig. Bevorzuge abstrakte Klassen.

High-Level-Komponenten und Low-Level-Komponenten sollten beide von Abstraktion anstatt konkreter Klassen abhängig sein.

> Sprich nur mit deinen engsten Freunden.

Reduziere die Anzahl an Klassen mit denen deine Klassen kommunizieren können auf ein Minimum. Das verhindert
Unübersichtlichkeit und begünstigt einen Kaskade-Effekt, bei welchem Veränderungen in einer Klasse an jede Stelle
hinreichen, ohne Modifikation an jeder Stelle zu benötigen. Ein System mit zu vielen Schnittstellen zwischen Klassen
ist ein fragiles System.

> Die Großen rufen die Kleinen auf.

Vermeide es, Abhängigkeiten kreuz und quer in der Klassenhierarchie anzusiedeln. Solche Systeme sind nur schwer zu
durchsteigen und selten effizient. Stattdessen ist es meist besser, wenn die Klassen einer höheren Ebene direkt auf die
betreffenden darunterliegenden Klassen zukommt, indem sie die Low-Level Methoden ansteuert.

> Es sollte nur einen Grund geben eine Klasse zu verändern.

Jede Klasse sollte nur eine einzelne Verantwortung innehaben. Eine höhe Kohärenz der Methoden innerhalb einer Klasse
oder eines Moduls trägt viel dazu bei, Veränderung thematisch abzukapseln und somit Fehleranfälligkeit zu reduzieren.

## Darf ich jetzt endlich die Design Patterns sehen?

Gerne!
