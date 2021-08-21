package slideshow;

import arc.*;
import arc.util.*;
import mindustry.Vars;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class SlideShowMod extends Mod{

    public SlideShowMod(){
        Events.on(ClientLoadEvent.class, e -> {
            Core.settings.put("fpscap", 1);
        });
    }

    @Override
    public void loadContent(){
    }

}
