package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CreateGadgetInfo {
    public static class CreateGadgetInfo_Chest {
        @Tag(tag=1) public Integer chestDropId = null;
        @Tag(tag=2) public Boolean isShowCutscene = null;
    }

    @Tag(tag=1) public Integer bornType = null;
    @Tag(tag=2) public CreateGadgetInfo_Chest chest = null;
}
