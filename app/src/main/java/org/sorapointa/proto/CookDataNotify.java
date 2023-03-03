package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CookRecipeData.*;
import org.sorapointa.proto.CookRecipeData;

public class CookDataNotify {
    @Tag(tag=2) public List<CookRecipeData> recipeDataList = new ArrayList<>();
    @Tag(tag=11) public Integer grade = null;
}
