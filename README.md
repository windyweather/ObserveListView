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