package storyteller;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;
import static sun.font.GlyphLayout.done;

/**
 *
 * @author USER
 */
public class StoryTeller {
public static void main(String args[])
{
    new StoryTeller();
}
public StoryTeller()
{
   boolean done=false;
    while(!done)
    {
    String[] ans=new String[12];
    //Start us off 
    JOptionPane.showMessageDialog(null,"Let's make a story :)","This will be a good one",JOptionPane.INFORMATION_MESSAGE);
//1.Color
String[] colors={
    "Voilet",
    "Indigo",
    "Blue",
    "Green",
    "Yellow",
    "Orange",
    "Red",
    "Black",
    "Pink"
};
int color_index = JOptionPane.showOptionDialog(null,"What's your favorite color?","Color",0,JOptionPane.QUESTION_MESSAGE,null,colors,0);
 ans[0]=colors[color_index];
 //2.liquid
 ans[1]=JOptionPane.showInputDialog(null,"What's your favorite thing to drink?","Liquid");
//3.pural noun
ans[2]=JOptionPane.showInputDialog("Who Made This Programme ");
//4.adjective
ans[3]=JOptionPane.showInputDialog("Name something Good about that person (Adjective)");
//5.present tense verb
ans[4]=JOptionPane.showInputDialog(" You're very beautiful miss(Type anything in input box I'm just gonna ignore it)");
//6.pural noun
ans[5]=JOptionPane.showInputDialog("What is your name");
//7.singular noun
ans[6]=JOptionPane.showInputDialog("Name a place you want to visit");
//8.adjective
ans[7]=JOptionPane.showInputDialog("Name something bad about " +ans[2]+" (Adjective)");
//9.present tense verb
ans[8]=JOptionPane.showInputDialog("Name a thing u like to eat ");
//10.Present tense verb
ans[9]=JOptionPane.showInputDialog("What is special about today");
//11.singular noun
ans[10]=JOptionPane.showInputDialog("Name a thing u want to have");
//confirm with user
int input = JOptionPane.showConfirmDialog(null,"Are u sure you r ready to see the result");
if(input==1 || input==2 )
{
    done=false;
}else{
    input=JOptionPane.showConfirmDialog(null,"really this is your last chance to bail,are u certain ? ","",JOptionPane.YES_NO_OPTION);

if(input ==1){
    done=false;
}
}
if(done=true)
{
JOptionPane.showMessageDialog(null,("Hey "+ans[5]+".The guy "+ans[2]+" with his good charecterstic of being "+ans[3]+" He want to ask you something. On the very special occasion of "+ans[9]+
        " Will you be his VALENTINE For today and rest of Valentine's Day to come ? "));
input=JOptionPane.showConfirmDialog(null,"Please give me your answer ? ","",JOptionPane.YES_NO_OPTION);
if(input ==1){
    done=false;
    JOptionPane.showMessageDialog(null,"You are gonna make him Sad but NEVER MIND ");
}
else{
    JOptionPane.showMessageDialog(null,"Try opening his bag first chain.Let's go out for coffee after class. Then we'll go out for "+ans[8]+".");

}
}
else{
JOptionPane.showMessageDialog(null,"Ok we'll start over then ");
}

}
    }
    
}

