package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CookRecipeData.*;
import org.sorapointa.proto.CookRecipeData;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class PlayerCookRsp {
    @Tag(tag=15) public List<ItemParam> extraItemList = new ArrayList<>();
    @Tag(tag=12) public Integer cookCount = null;
    @Tag(tag=11) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer qteQuality = null;
    @Tag(tag=7) public CookRecipeData recipeData = null;
}
