# ObserveListView

This JavaFX project is a test of ListView and an Observable class. 

It is a test to learn how to use ListView with a class and do all 
the functions necessary for the ScreenShotArchive project.

# Highlights are:

**ObservePairClass** - models in a simple way what SShotArchive needs to do. 
there are three Strings in the class: Pair name, source path, destination path.

**ObserveLVController** - The controller contains all the functions of the program
and is tied to the GUI.

**OLV-View.fxml** - Built with SceneBuilder rather than hand coded.
The fxml file for the GUI. Contains a listview, three fields and
the function buttons to manipulate the list as required in SShotArchive.
Basically, adding,
removing "pairs" from the list and reordering the list. Drag and Drop would
have been more elegant, and maybe someday I'll do that. But for now I'll use the
model from the old Qt framework based program that I've been using.

The program works. So now I can move on with the ScreenShotArchive program.

I've posted this to GitHub - in public - as an example for others that have
similar problems to solve. The examples I found on the web were not clear, or
too complicated to easily use. which is why I build this test program.

I hope this is a clearer solution as an example of a simple way to 
hook an Observable Class to a ListView object in JavaFx.

Enjoy

BTW, The project was built with IntelliJ

>IntelliJ IDEA 2024.3.5 (Community Edition)
>Build #IC-243.26053.27, built on March 15, 2025
>Runtime version: 21.0.6+8-b631.39 amd64 (JCEF 122.1.9)
>VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
>Toolkit: sun.awt.windows.WToolkit
>Windows 11.0
>GC: G1 Young Generation, G1 Concurrent GC, G1 Old Generation
>Memory: 2048M
>Cores: 24
>Registry:
>ide.experimental.ui=true
>llm.show.ai.promotion.window.on.start=false
>Kotlin: 243.26053.27-IJ

and 

>SceneBuilder
>Product Version
>JavaFX Scene Builder 23.0.1
>
>Build Information
>Version 23.0.1
>Date: 2024-10-16 15:53:24
>JavaFX Version: 23.0.1
>Java Version: 23, OpenJDK Runtime Environment

Can you believe it. There's no way to stop wordwrap of all that stuff that I thought
you might want in the readme. Sigh... No Quoted or Code tag or anything. 

-- From a post over a year ago

>As far as I know and understand from reading issue tickets, this is not something that is supported at the time of this writing, and I am not aware of any workarounds (though that doesn't mean they don't exist- just that I don't know about them).

