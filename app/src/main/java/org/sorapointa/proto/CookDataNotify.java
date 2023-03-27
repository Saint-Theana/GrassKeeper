package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CookDataNotify {
    public enum CookDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=145) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<CookRecipeData> recipeDataList = new ArrayList<>();
    @Tag(tag=2) public Integer grade = null;
}
