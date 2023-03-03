package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CookRecipeData.*;
import org.sorapointa.proto.CookRecipeData;

public class CookRecipeDataNotify {
    @Tag(tag=4) public CookRecipeData recipeData = null;
}
