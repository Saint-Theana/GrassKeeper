package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CookRecipeDataNotify {
    public enum CookRecipeDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=185) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public CookRecipeData recipeData = null;
}
