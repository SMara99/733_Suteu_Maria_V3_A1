# 733_Suteu_Maria_V3_A1

Aufgabe 1.Tasks
In einer Textdatei offerten.txt sind die Daten vonverschiedenen Offerten gespeichert. 
DieFelder werden mit ‘$’ abgetrennt.
Folgende Felder sind vorhanden:
-Id
-Taskname
-Hours spent (integer)
-Hour budget (integer)
-Status (Enum: Open, In Progress, Done)
-------------------------------------------------------------------------------------------------------------------------------
Beispiel Textdatei offerten.txt:
1$Remove button from homepage$5$7$In Progress
2$Add new field in form$2$1$Done
3$Solve error 500 bug$0$3$Open
4$edit text$1$1$Done
-------------------------------------------------------------------------------------------------------------------------------
Entwickeln Sie eine Anwendung, die:
a.) aus der Datei liest.(1p)
b.) die Tasks nach “Hours spent” in fallender Reihenfolge sortiert.(0.5p)
c.) die sortierten Tasks  in eine neue Datei mit dem Namentaskssortiert.txtspeichert(0.5p)
d.) eine Statistik mit den Statusse und der restlichen Budget (hour budget - hours spent),sortiert in fallender Reihenfolge nach den restlichen Budget. 
Diese Statistik wird in eine andereTextdatei mit dem Namen statistik.txt gespeichert.(1p)
-------------------------------------------------------------------------------------------------------------------------------
Beispiel Output: taskssortiert.txt 
1$Remove button from homepage$5$7$In Progress
2$Add new field in form$2$1$Done4$edit text$1$1$Done
3$Solve error 500 bug$0$3$Open
statistik.txtOpen: 3In Progress: 2Done: -1
