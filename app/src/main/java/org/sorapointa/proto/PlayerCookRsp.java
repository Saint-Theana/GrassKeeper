package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCookRsp {
    public enum PlayerCookRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=128) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<ItemParam> extralItemList = new ArrayList<>();
    @Tag(tag=9) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=5) public CookRecipeData recipeData = null;
    @Tag(tag=12) public Integer cookCount = null;
    @Tag(tag=4) public Integer qteQuality = null;
}
